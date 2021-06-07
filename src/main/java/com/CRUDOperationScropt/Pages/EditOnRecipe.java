package com.CRUDOperationScropt.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditOnRecipe extends PageBaseClass {
    public EditOnRecipe(WebDriver driver) {
        super(driver);
    }

    private By PumpkinPie = By.linkText("Pumpkin Pie");
    private By editButton = By.id("btn-edit0");
    private By recipeInput = By.id("title");
    private By editRecipeButton = By.id("addButton");

    @Step("Select Recipe To Update")
    public void OpenRecipe() {
        HandleIFrame("result");
        clickButton(PumpkinPie);
    }
    @Step("Open Pop Up To update recipe name")
    public void setEditButton() {
        clickButton(editButton);
    }

    @Step("Change recipe name [{text}]")
    public void setRecipeInput(String text) {
        setText(text, recipeInput);
    }

    @Step("Save Change")
    public void setEditRecipeButton() {
        clickButton(editRecipeButton);
    }
}
