package tests.US013;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC003 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void invalidEmailValidPasswordTest01() {

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the 'Sign In' link in the header section of the homepage
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        //User clicks the 'Sign In' link in the header section of the homepage
        eda_hauseheavenPage.signInLink.click();

        //User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        //User views the Login form on the Househeaven login page
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        //User clicks on the Email/Username textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginEmailTextbox.isEnabled());

        //User does not enter any data into the Email/Username textbox,

        //User clicks on the Password textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginPasswordTextbox.isEnabled());

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        //User clicks the Login button in the Login form
        eda_hauseheavenPage.loginButton.click();

        //User sees the warning message 'The username field is required.' under the Username textbox,
        Assert.assertTrue(eda_hauseheavenPage.emptyUsernameBoxWarning.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.emptyUsernameBoxWarning.getText(), "The username field is required.");
    }

    @Test
    public void invalidEmailValidPasswordTest02() {

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the 'Sign In' link in the header section of the homepage
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        //User clicks the 'Sign In' link in the header section of the homepage
        eda_hauseheavenPage.signInLink.click();

        //User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        //User views the Login form on the Househeaven login page
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        //User clicks on the Email/Username textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginEmailTextbox.isEnabled());

        //User enters invalid data into the Email/Username textbox,
        eda_hauseheavenPage.loginEmailTextbox.sendKeys("selam");

        //User clicks on the Password textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginPasswordTextbox.isEnabled());

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        //User clicks the Login button in the Login form
        eda_hauseheavenPage.loginButton.click();

        //User sees the warning message 'The username field is required.' under the Username textbox
        Assert.assertTrue(eda_hauseheavenPage.invalidUsernameWarning.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.invalidUsernameWarning.getText(), "These credentials do not match our records.");

        //User views the Login form again,
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        Driver.quitDriver();



    }
}
