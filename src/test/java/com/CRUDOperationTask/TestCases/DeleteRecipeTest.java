package com.CRUDOperationTask.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteRecipeTest extends TestBaseClass {
@Test
    public void DeleteRecipe(){
        deleteRecipePage.SelectDeletedItem();
        deleteRecipePage.DeleteItem();
        Assert.assertFalse(!driver.getPageSource().contains("Spaghetti"));
    }
}
