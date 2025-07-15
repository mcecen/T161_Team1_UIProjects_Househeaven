package tests.US013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC007 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void backToLoginPageLinkTest(){

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

        //User sees the 'Forgot Your Password' link on the Login page.
        Assert.assertTrue(eda_hauseheavenPage.forgotYourPasswordLink.isDisplayed());

        //User clicks the 'Forgot Your Password' link.
        eda_hauseheavenPage.forgotYourPasswordLink.click();

        //User views the Househeaven Forgot Password page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Forgot password");

        //User sees the 'Back to login page' link on the Forgot Password page.
        Assert.assertTrue(eda_hauseheavenPage.backToLoginPageLink.isDisplayed());

        //User clicks the 'Back to login page' link.
        eda_hauseheavenPage.backToLoginPageLink.click();

        //User is redirected to https://qa.hauseheaven.com/login after clicking the 'Back to login page' link.
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("login-url"));

        //User views the Househeaven Login page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        Driver.quitDriver();


    }
}
