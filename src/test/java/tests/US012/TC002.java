package tests.US012;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC002 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void registerWithInvalidEmailTest01() {
        //email textbox is empty


        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //Email textbox is empty
                //---------

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.emailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.emailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen bu alanı doldurun."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();
    }


    @Test
    public void registerWithInvalidEmailTest02() {
        //Entering invalid data in email textbox (selam)

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User enters invalid data into the Email textbox (e.g., missing "@" or domain)
        eda_hauseheavenPage.emailTextbox.sendKeys("selam");

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.emailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.emailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen e-posta adresine bir \"@\" işareti ekleyin. \"selam\" adresinde \"@\" eksik."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();
    }


    @Test
    public void registerWithInvalidEmailTest03() {
        //Entering invalid data in email textbox (@@)

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User enters invalid data into the Email textbox (e.g., missing "@" or domain)
        eda_hauseheavenPage.emailTextbox.sendKeys("@@");

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.emailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.emailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Lütfen başına \"@\" ekleyin. \"@@\" adresi eksik."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();
    }


    @Test
    public void registerWithInvalidEmailTest04() {
        //Entering invalid data in email textbox (edaa@@)

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks on the 'Sign Up' link
        eda_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //User enters valid data into the First Name textbox
        eda_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("regester-firstname"));

        //User enters valid data into the Last Name textbox
        eda_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("regester-lastname"));

        //User enters invalid data into the Email textbox (e.g., missing "@" or domain)
        eda_hauseheavenPage.emailTextbox.sendKeys("edaa@@");

        //User enters valid data into the Username textbox
        eda_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("regester-username"));

        //User enters valid data into the Password textbox
        eda_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("resgester-password"));

        //User enters valid data into the Confirm Password textbox
        eda_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("confirm-password"));

        //User clicks the Register button
        eda_hauseheavenPage.registerButton.click();

        boolean isEmailValid = (Boolean) js.executeScript("return arguments[0].checkValidity();", eda_hauseheavenPage.emailTextbox);
        String emailValidationMsg = (String) js.executeScript("return arguments[0].validationMessage;", eda_hauseheavenPage.emailTextbox);

        System.out.println(emailValidationMsg);
        Assert.assertFalse(isEmailValid);
        Assert.assertTrue(emailValidationMsg.contains("Başında \"@\" bulunan kısımda \"@\" simgesi bulunmamalıdır."));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/register"));

        Driver.quitDriver();
    }
}