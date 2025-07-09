package tests.US012;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC004 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void previouslyUsedUsername() {

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User enters valid data into the Email textbox
        eda_hauseheavenPage.emailTextbox.sendKeys("eda@napcaz");

        //User enters previously used Username Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        WebElement warningUsername = Driver.getDriver().findElement(By.xpath("//*[@id=\"sign-up\"]/div/form/div[1]/div[4]/div/span/strong"));
        Assert.assertTrue(warningUsername.getText().contains("The username has already been taken."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();

    }
}
