package com.CRUDOperationTask.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAndDeleteRecipe extends TestBaseClass {
    private String Recipe = "New Recipe";
    private String Ingredients = "ingred 1 , ingred 2";

    @Test
    public void AddNewRecap() throws InterruptedException {
        homePage.AddNewRecipe();
        homePage.EnterIngredients(Ingredients);
        homePage.EnterRecipeName(Recipe);
        homePage.SaveNewRecipe();
        Assert.assertTrue(driver.getPageSource().contains(Recipe));

    }

    @Test(dependsOnMethods = "AddNewRecap")
    public void DeleteRecipe() {

        deleteRecipePage.SelectDeletedItem();
        deleteRecipePage.DeleteItem();
        Assert.assertFalse(driver.getPageSource().contains("New Recipe"));
    }

}
