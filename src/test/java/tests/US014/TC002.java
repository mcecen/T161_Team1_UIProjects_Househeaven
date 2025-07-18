package tests.US014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PageNavigation;
import utilities.TestBaseRapor;

import java.util.List;

public class TC002 extends TestBaseRapor {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void requiredFieldWarningTest(){

        extentTest = extentReports.createTest("Required Field Warning Test");

        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        extentTest.info("User views the Househeaven homepage");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User clicks the 'Sign In' link in the header section of the homepage");
        eda_hauseheavenPage.signInLink.click();

        extentTest.info("User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login");

        extentTest.info("User fills in the login form with valid data.");
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        extentTest.info("User clicks the Login button.");
        eda_hauseheavenPage.loginButton.click();

        extentTest.info("User sees the Househeaven homepage.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User sees the \"Add Property\" link in the header.");
        Assert.assertTrue(eda_hauseheavenPage.addPropertyLink.isDisplayed());

        extentTest.info("User clicks the \"Add Property\" link.");
        eda_hauseheavenPage.addPropertyLink.click();

        extentTest.info("User sees the page https://qa.hauseheaven.com/public/account/properties/create.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Write a property");

        extentTest.info("User sees the listing creation form.");
        Assert.assertTrue(eda_hauseheavenPage.listingCreationform.isDisplayed());

        extentTest.info("User sees the Save button in the right Publish section.");
        Assert.assertTrue(eda_hauseheavenPage.saveButton.isDisplayed());

        extentTest.info("User clicks the Save button.");
        eda_hauseheavenPage.saveButton.click();

        extentTest.info("User sees the Write a Property page again.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Write a property");

        extentTest.info("User sees the warning below the Title* textbox.");
        Assert.assertTrue(eda_hauseheavenPage.titleWarning.isDisplayed());

        extentTest.info("User writes 'geniş bahçeli dubleks villa' into the Title* textbox.");
        eda_hauseheavenPage.titleTextbox.sendKeys("geniş bahçeli dubleks villa");

        extentTest.info("User clicks Save.");
        eda_hauseheavenPage.saveButton.click();

        extentTest.info("User sees the Write a Property page again.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Write a property");

        PageNavigation.scrollDownWithJS(400);

        extentTest.info("User sees the warning below the Content* textbox.");
        Assert.assertTrue(eda_hauseheavenPage.contentWarning.isDisplayed());

        extentTest.info("User enters:'Depreme dayanıklı, iç-dış cephe boyaları yapıldı'");
        eda_hauseheavenPage.contentTextbox.sendKeys("Depreme dayanıklı, iç-dış cephe boyaları yapıldı");

        PageNavigation.scrollUpWithJS(400);

        extentTest.info("User clicks Save.");
        eda_hauseheavenPage.saveButton.click();

        PageNavigation.scrollDownWithJS(500);

        extentTest.info("User sees the warning below the Property location* textbox.");
        extentTest.info("User sees the warning message 'The content field is required.' under the Property location* textbox");
        List<WebElement> propertyLocationWarnings = Driver.getDriver().findElements(By.xpath("//input[@type='password']/following-sibling::*[contains(text(),'These credentials')]"));
        Assert.assertTrue(propertyLocationWarnings.size() > 0, "A warning message should have appeared under the Property location* field!");

        extentTest.info("User sees the Write a Property page again.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Write a property");

        extentTest.info("User types \"Ankara\" in Property location textbox.");
        eda_hauseheavenPage.propertyLocationTextbox.sendKeys("Ankara");

        extentTest.info("User clicks Save button and User sees the Edit Property page.");
        eda_hauseheavenPage.saveButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Edit property");


    }
}
