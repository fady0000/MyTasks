package com.CRUDOperationScropt.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteRecipePage extends PageBaseClass{
    public DeleteRecipePage(WebDriver driver) {
        super(driver);
    }
    private By deletedItem = By.linkText("Spaghetti");
    private By deleteButton = By.id("btn-del1");

    @Step("Select Item To Delete")
    public void SelectDeletedItem(){
        HandleIFrame("result");
        clickButton(deletedItem);
    }

    @Step("Click On Delete")
    public void DeleteItem(){
        clickButton(deleteButton);
    }
}
