package tests.US014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TC005 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Test
    public void buyCreditsWarningTest(){

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
        eda_hauseheavenPage.loginEmailTextbox.sendKeys("edada");

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

        //User sees the Add Property link in the header section of the Hauseheaven homepage
        Assert.assertTrue(eda_hauseheavenPage.addPropertyLink.isDisplayed());

        //User clicks on the Add Property link in the header section of the Hauseheaven homepage
        eda_hauseheavenPage.addPropertyLink.click();

        //User sees the alert message 'Please add your credit to create your own posts.' after clicking the Add Property link
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-danger")));
        String actualAlertText = alert.getText();
        Assert.assertTrue(actualAlertText.contains("Please add your credit to create your own posts."));

    }
}
