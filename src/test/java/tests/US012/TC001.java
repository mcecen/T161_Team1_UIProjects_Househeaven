package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void regesterTest(){

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
        eda_hauseheavenPage.emailTextbox.sendKeys(ConfigReader.getProperty("regester-email"));

        //User sees the Username textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.usernameTextbox.isDisplayed());

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User sees the Password textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.passwordTextbox.isDisplayed());

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User sees the Confirm Password textbox in the Register form
        Assert.assertTrue(eda_hauseheavenPage.confirmPasswordTextbox.isDisplayed());

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User sees the Register button in the Register form
        Assert.assertTrue(eda_hauseheavenPage.registerButton.isDisplayed());

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User views the dashboard page
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("dashboard-url")));

        //The User sees the Dashboard link in the left panel of the dashboard page and that it is clickable
        Assert.assertTrue(eda_hauseheavenPage.dashboardLink.isEnabled());

        //User sees the values entered the Name and Last Name fields of the Register form in the header section of the
        // dashboard page to confirm successful registration (e.g., Eda Salman)
        Assert.assertTrue(eda_hauseheavenPage.profilName.isEnabled());

        //User sees the text 'Your Current Credits: 0' on the dashboard page
        Assert.assertTrue(eda_hauseheavenPage.yourCurrentCredits.isEnabled());

        //User sees the text 'Approved properties' on the dashboard page
        Assert.assertTrue(eda_hauseheavenPage.approvedProperties.isEnabled());

        //User sees the text 'Pending approve properties' on the dashboard page
        Assert.assertTrue(eda_hauseheavenPage.pendingApproveProperties.isEnabled());

        //User sees the text 'Rejected properties' on the dashboard page
        Assert.assertTrue(eda_hauseheavenPage.rejectedProperties.isEnabled());

        Driver.quitDriver();


    }
}
