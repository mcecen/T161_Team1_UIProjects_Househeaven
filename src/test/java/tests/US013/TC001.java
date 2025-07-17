package tests.US013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void loginAndLogoutTest() {

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        //User sees the 'Sign In' link in the header section of the homepage
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        //User clicks the 'Sign In' link in the header section of the homepage
        eda_hauseheavenPage.signInLink.click();

        //User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login");

        //User views the Login form on the Househeaven login page
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        //User clicks on the Email/Username textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginEmailTextbox.isEnabled());

        //User enters valid data into the Email/Username textbox
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));

        //User clicks on the Password textbox in the Login form
        Assert.assertTrue(eda_hauseheavenPage.loginPasswordTextbox.isEnabled());

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        //User clicks the Login button in the Login form
        eda_hauseheavenPage.loginButton.click();

        //User sees that the page https://qa.hauseheaven.com/public/ is opened after clicking the Login button
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("url")));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the username link (e.g., Eda Salman) in the header section of the homepage
        Assert.assertTrue(eda_hauseheavenPage.getProfilName.isDisplayed());

        //User clicks on the username link (e.g., Eda Salman) in the header section of the homepage
        eda_hauseheavenPage.getProfilName.click();

        //User sees that the page https://qa.hauseheaven.com/public/account/dashboard is opened after clicking the username link
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("dashboard-url")));

        //User sees the Logout link in the header section of the dashboard page
        Assert.assertTrue(eda_hauseheavenPage.logoutLink.isDisplayed());

        //User clicks the Logout link in the header section of the dashboard page
        eda_hauseheavenPage.logoutLink.click();

        //User sees that the page https://qa.hauseheaven.com/public/ is opened after clicking the Logout link
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("url")));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the 'Sign In' link in the header section of the homepage
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        Driver.quitDriver();

    }
}
