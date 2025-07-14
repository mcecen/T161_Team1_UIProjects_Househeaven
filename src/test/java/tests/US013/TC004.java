package tests.US013;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class TC004 extends TestBaseRapor {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void validEmailEmptyPasswordTest01() {

        extentTest = extentReports.createTest("Valid Email Empty Password Test");

        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        extentTest.info("User views the Househeaven homepage");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User sees the 'Sign In' link in the header section of the homepage");
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        extentTest.info("User clicks the 'Sign In' link in the header section of the homepage");
        eda_hauseheavenPage.signInLink.click();

        extentTest.info("User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        extentTest.info("User views the Login form on the Househeaven login page");
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        extentTest.info("User clicks on the Email/Username textbox in the Login form");
        Assert.assertTrue(eda_hauseheavenPage.loginEmailTextbox.isEnabled());

        extentTest.info("User enters valid data into the Email/Username textbox");
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));

        extentTest.info("User clicks on the Password textbox in the Login form");
        Assert.assertTrue(eda_hauseheavenPage.loginPasswordTextbox.isEnabled());

    //User does not enter any data into the Password textbox


        extentTest.info("User clicks the Login button in the Login form");
        eda_hauseheavenPage.loginButton.click();

        extentTest.info("User sees the warning message 'The username field is required.' under the Username textbox");
        Assert.assertTrue(eda_hauseheavenPage.emptyPasswordBoxWarning.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.emptyPasswordBoxWarning.getText(), "The password field is required.");

}

    @Test
    public void validEmailInvalidPasswordTest02() {

        extentTest = extentReports.createTest("Valid Email Invalid Password Test");


        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        extentTest.info("User views the Househeaven homepage");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        ReusableMethods.bekle(3);
        extentTest.info("User sees the 'Sign In' link in the header section of the homepage");
        Assert.assertTrue(eda_hauseheavenPage.signInLink.isDisplayed());

        extentTest.info("User clicks the 'Sign In' link in the header section of the homepage");
        eda_hauseheavenPage.signInLink.click();

        extentTest.info("User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        extentTest.info("User views the Login form on the Househeaven login page");
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        extentTest.info("User clicks on the Email/Username textbox in the Login form");
        Assert.assertTrue(eda_hauseheavenPage.loginEmailTextbox.isEnabled());

        extentTest.info("User enters valid data into the Email/Username textbox");
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));

        extentTest.info("User clicks on the Password textbox in the Login form");
        Assert.assertTrue(eda_hauseheavenPage.loginPasswordTextbox.isEnabled());

        extentTest.info("User enters invalid data into the Password textbox");
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys("123456");;

        extentTest.info("User clicks the Login button in the Login form");
        eda_hauseheavenPage.loginButton.click();

        extentTest.info("User sees the warning message 'These credentials do not match our records.' under the Password textbox");
        List<WebElement> passwordWarnings = Driver.getDriver().findElements(By.xpath("//input[@type='password']/following-sibling::*[contains(text(),'These credentials')]"));
        Assert.assertTrue(passwordWarnings.size() > 0, "A warning message should have appeared under the Password field!");

        extentTest.info("User views the Login form again");
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

    }




}
