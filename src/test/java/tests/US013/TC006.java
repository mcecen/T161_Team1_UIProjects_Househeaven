package tests.US013;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC006 extends TestBaseRapor {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void forgotYourPasswordLinkTest() {

        extentTest = extentReports.createTest("Forgot Your Password Link Test");

        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        ReusableMethods.bekle(2);
        extentTest.info("User views the Househeaven homepage");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User clicks the 'Sign In' link on the Househeaven homepage.");
        eda_hauseheavenPage.signInLink.click();

        extentTest.info("User is redirected to https://qa.hauseheaven.com/public/login after clicking the 'Sign In' link.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        extentTest.info("User views the Login form on the Househeaven login page.");
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        extentTest.info("User sees the 'Forgot Your Password?' link in the login form.");
        Assert.assertTrue(eda_hauseheavenPage.forgotYourPasswordLink.isDisplayed());

        extentTest.info("User clicks the 'Forgot Your Password?' link in the login form.");
        eda_hauseheavenPage.forgotYourPasswordLink.click();

        ReusableMethods.bekle(2);
        extentTest.info("After clicking the link, the user is redirected to the https://qa.hauseheaven.com/password/request page.");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("forgotPassword-url"));

        ReusableMethods.bekle(2);
        extentTest.info("The user views the Househeaven Forgot Password page.");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Forgot password");

        extentTest.info("The user views the Email textbox on the Househeaven Forgot Password page.");
        Assert.assertTrue(eda_hauseheavenPage.forgotPasswordEmailTextbox.isDisplayed());

        extentTest.info("When the user hovers over the Email textbox without entering data, an alert 'Please fill out this field' is displayed.");
        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.forgotPasswordEmailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.forgotPasswordEmailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen bu alanı doldurun."));

        ReusableMethods.bekle(2);
        extentTest.info("The user enters a valid registered email address.");
        actions.click(eda_hauseheavenPage.forgotPasswordEmailTextbox)
                .sendKeys(ConfigReader.getProperty("user-eda-mail"))
                .build()
                .perform();

        extentTest.info("The user sees the Reset Password button on the Forgot Password page.");
        Assert.assertTrue(eda_hauseheavenPage.resetPasswordButton.isDisplayed());

        extentTest.info("The user clicks the Reset Password button.");
        eda_hauseheavenPage.resetPasswordButton.click();

        ReusableMethods.bekle(2);
        extentTest.info("When you click on the Reset Password button, it displays the new password creation page.");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.hauseheaven.com/password/email");

    }
}
