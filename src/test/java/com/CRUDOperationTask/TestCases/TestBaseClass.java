package com.CRUDOperationTask.TestCases;

import com.CRUDOperationScropt.Pages.DeleteRecipePage;
import com.CRUDOperationScropt.Pages.EditOnRecipe;
import com.CRUDOperationScropt.Pages.newRecipePage;
import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class TestBaseClass {
    newRecipePage homePage;
    EditOnRecipe editOnRecipe;
    DeleteRecipePage deleteRecipePage;
    WebDriver driver;
    private final String URL = "https://codepen.io/SedatUygur/pen/jWgJdv";
    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        homePage = new newRecipePage(driver);
        editOnRecipe = new EditOnRecipe(driver);
        deleteRecipePage = new DeleteRecipePage(driver);
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        homePage.ChangeView();


    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }

    @BeforeSuite
    void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "87.0.4280.88")
                        .put("URL", URL)
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }
}
