package com.CRUDOperationScropt.Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newRecipePage extends PageBaseClass {

    private By addRecipe = By.id("show");
    private By recipeName = By.id("title");
    private By ingredients = By.xpath("//textarea[@placeholder='Enter Ingredients Separated By Commas']");
    private By addRecipeButton = By.id("addButton");
    private By changeView = By.id("view-switcher-button");
    private By fullPage = By.id("full-link");

    public newRecipePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Recipe Page")
    @Description("Open Recipe Page To Add new Recipe")
    public void AddNewRecipe() {
        HandleIFrame("result");
        clickButton(addRecipe);
    }
    @Step("Enter Recipe Name [{name}]")
    @Description("Add Recipe Name")
    public void EnterRecipeName(String name) {

        setText(name, recipeName);
    }

    @Step("Enter ingredients[{ingredients}]")
    @Description("Add ingredients")
    public void EnterIngredients(String Ingredients) {
        setText(Ingredients, ingredients);
    }

    @Step("Save New Recipe")
    @Description("Validate To Save New Recipe")
    public void SaveNewRecipe() {
        clickButton(addRecipeButton);
    }
    public void ChangeView() {
        clickButton(changeView);
        clickButton(fullPage);
    }

}
