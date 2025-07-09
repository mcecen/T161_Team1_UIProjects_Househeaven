package tests.US012;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC005 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void invalidPasswordTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(),"Register");

        //User sees the First Name textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.lastNameTextbox.isDisplayed());

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User sees the Last Name textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.lastNameTextbox.isDisplayed());

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User sees the Email textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.emailTextbox.isDisplayed());

        //User enters valid data into the Email textbox
        eda_hauseheavenPage.emailTextbox.sendKeys("napcaz@eda");

        //User sees the Username textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.usernameTextbox.isDisplayed());

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys("napcazeda");

        //User sees the Password textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.passwordTextbox.isDisplayed());

        //User enters invalid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys("heaven");

        //User sees the Confirm Password textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.confirmPasswordTextbox.isDisplayed());

        //User enters invalid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys("heaven");

        //User sees the Register button in the Register form
        Assert.assertTrue(eda_hauseheavenPage.registerButton.isDisplayed());

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        boolean isPasswordValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.passwordTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.passwordTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isPasswordValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen istenen biçimi eşleştirin."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();


    }
}
