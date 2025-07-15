package tests.US014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC002 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void editPropertyTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks the 'Sign In' link in the header section of the homepage
        eda_hauseheavenPage.signInLink.click();

        //User sees that https://qa.hauseheaven.com/public/login page is opened.
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login");

        //User fills in the login form with valid data.
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        //User clicks the Login button.
        eda_hauseheavenPage.loginButton.click();

        //User sees the Househeaven homepage.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the "Add Property" link in the header.

        //User clicks the Add Property link.
        //User sees the page https://qa.hauseheaven.com/public/account/properties/create.
        //User sees the listing creation form.
        //User sees the Save button in the right Publish section.
        //User clicks the Save button.
        //User sees the Write a Property page again.
        //User clicks the Title* textbox.
        //User writes “geniş bahçeli dubleks villa” into the Title* textbox.
        //User clicks Save.
        //User sees the Write a Property page again.
        //User sees the warning below the Content* textbox.
        //User clicks the Content* textbox.
        //User enters: “Depreme dayanıklı, iç-dış cephe boyaları yapıldı”.
        //User clicks Save.
        //User sees the Write a Property page again.
        //User sees the warning below the Property location* textbox.
        //User clicks the Property location* textbox.
        //User types "Ankara" in Property location textbox.
        //User clicks Save button and User sees the Edit Property page.
    }
}
