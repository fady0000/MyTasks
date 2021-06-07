package com.CRUDOperationTask.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EditOnRecipeTest extends TestBaseClass {
    private String dataUpdated = "Updated";
    @Test
    public void EditOnRecipe (){
        editOnRecipe.OpenRecipe();
        editOnRecipe.setEditButton();
        editOnRecipe.setRecipeInput(dataUpdated);
        editOnRecipe.setEditRecipeButton();
        Assert.assertTrue(driver.getPageSource().contains(dataUpdated));
    }
}
