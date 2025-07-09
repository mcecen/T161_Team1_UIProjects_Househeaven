package tests.US012;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC007 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void emptyTextboxWarningTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the First Name textbox
        boolean isFirstnameValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.firstNameTextbox);
        String firstnameValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.firstNameTextbox);

        System.out.println(firstnameValidationMsg);
        Assert.assertFalse(isFirstnameValid);
        Assert.assertTrue(firstnameValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the Last Name textbox
        boolean isLastnameValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.lastNameTextbox);
        String lastnameValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.lastNameTextbox);

        System.out.println(lastnameValidationMsg);
        Assert.assertFalse(isLastnameValid);
        Assert.assertTrue(lastnameValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the Email textbox
        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.emailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.emailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the Email textbox
        eda_hauseheavenPage.emailTextbox.sendKeys(ConfigReader.getProperty("regester-email"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the Username textbox
        boolean isUsernameValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.usernameTextbox);
        String usernameValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.usernameTextbox);

        System.out.println(usernameValidationMsg);
        Assert.assertFalse(isUsernameValid);
        Assert.assertTrue(usernameValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the Password textbox
        boolean isPasswordValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.passwordTextbox);
        String passwordValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.passwordTextbox);

        System.out.println(passwordValidationMsg);
        Assert.assertFalse(isPasswordValid);
        Assert.assertTrue(passwordValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User seen the warning on the Confirm Password textbox
        boolean isConfirmPasswordValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.confirmPasswordTextbox);
        String confirmPasswordValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.confirmPasswordTextbox);

        System.out.println(confirmPasswordValidationMsg);
        Assert.assertFalse(isConfirmPasswordValid);
        Assert.assertTrue(confirmPasswordValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        //User views the dashboard page
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("dashboard-url")));

        Driver.quitDriver();



    }
}
