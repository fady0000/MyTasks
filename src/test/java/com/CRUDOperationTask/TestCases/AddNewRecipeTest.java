package com.CRUDOperationTask.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewRecipeTest extends TestBaseClass {
    private String Recipe = "New Recipe";
    private String Ingredients = "ingred 1 , ingred 2, ingred 3 , ingred 4";

    @Test
    public void AddNewRecap() throws InterruptedException {
        homePage.AddNewRecipe();
        homePage.EnterIngredients(Ingredients);
        homePage.EnterRecipeName(Recipe);
        homePage.SaveNewRecipe();
        Assert.assertTrue(driver.getPageSource().contains(Recipe));
    }





}
