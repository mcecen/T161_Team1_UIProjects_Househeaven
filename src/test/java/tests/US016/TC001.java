package tests.US016;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Kivanc_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {
    Kivanc_HauseheavenPage kivanc_hauseheavenPage = new Kivanc_HauseheavenPage();
    String validationMessage;
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void propertiesTest() {

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User sees the 'Sign Up' link in the header section of the homepage
        Assert.assertTrue(kivanc_hauseheavenPage.signUpButtton.isDisplayed());

        //User clicks on the 'Sign Up' link
        kivanc_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(), "Register");

        //"User can see the fields ""First Name"", ""Last Name"", ""Email"", ""Username"", ""Password"", and ""Confirm Password""."
        Assert.assertTrue(kivanc_hauseheavenPage.firstNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.lastNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.emailTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.usernameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.passwordTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.confirmPasswordTextbox.isDisplayed());

        //"User can hover over the ""First Name"", ""Last Name"", ""Email"", and ""Username"" fields and see the warning 'Please fill out this field'."

        validationMessage = kivanc_hauseheavenPage.firstNameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");


        validationMessage = kivanc_hauseheavenPage.lastNameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");


        validationMessage = kivanc_hauseheavenPage.emailTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        validationMessage = kivanc_hauseheavenPage.usernameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        //"User can hover over the ""Password"" field and see the warning 'Password must be at least 8 characters long and contain at least one letter, one number and one special character'."

        validationMessage = kivanc_hauseheavenPage.passwordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertFalse(validationMessage.isEmpty());

        validationMessage = kivanc_hauseheavenPage.confirmPasswordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(2);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        //"User can click into the ""First Name"", ""Last Name"", ""Email"", ""Username"", and ""Password"" fields and enter text."
        kivanc_hauseheavenPage.firstNameTextbox.sendKeys(ConfigReader.getProperty("kivancregester-firstname"));
        kivanc_hauseheavenPage.lastNameTextbox.sendKeys(ConfigReader.getProperty("kivancregester-lastname"));
        kivanc_hauseheavenPage.emailTextbox.sendKeys(ConfigReader.getProperty("kivancregester-email"));
        kivanc_hauseheavenPage.usernameTextbox.sendKeys(ConfigReader.getProperty("kivancregester-username"));
        kivanc_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-password"));
        kivanc_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-confirmpassword"));

        //User can see the "Register" button clearly.
        Assert.assertTrue(kivanc_hauseheavenPage.registerButton.isDisplayed());

        //User can click the "Register" button.
        kivanc_hauseheavenPage.registerButton.click();

        //User can see the account dashboard page loads properly.
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("dashboard-url"));

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        // The registered user sees the "Properties" section on the account dashboard page.
        Assert.assertTrue(kivanc_hauseheavenPage.properties.isDisplayed());

        ReusableMethods.bekle(2);

        //The registered user clicks the "Properties" section on the account dashboard page.
        kivanc_hauseheavenPage.properties.click();

        ReusableMethods.bekle(2);

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("properties-url"));

        Driver.quitDriver();
    }
}
