package com.CRUDOperationScropt.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBaseClass {

    WebDriver driver;

    public PageBaseClass(WebDriver driver) {
        this.driver = driver;

    }

    protected WebElement action(By locator) {
        return driver.findElement(locator);
    }


    protected void setText(String data, By locator) {
        waitElement(locator);
        action(locator).clear();
        action(locator).sendKeys(data);
    }

    protected void clickButton(By locator) {
        waitElement(locator);
        action(locator).click();
    }

    public void waitElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean isDisplayed(By locator) {
        return action(locator).isDisplayed();
    }

    public void HandleIFrame(String frame) {
        driver.switchTo().frame(frame);
    }




}
