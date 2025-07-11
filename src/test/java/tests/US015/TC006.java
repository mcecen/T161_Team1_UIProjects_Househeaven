package tests.US015;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Kivanc_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC006 {

    Kivanc_HauseheavenPage kivanc_hauseheavenPage = new Kivanc_HauseheavenPage();
    String validationMessage;
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Test
    public void changePasswordTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        //User sees the 'Sign Up' link in the header section of the homepage
        Assert.assertTrue(kivanc_hauseheavenPage.signUpButtton.isDisplayed());

        //User clicks on the 'Sign Up' link
        kivanc_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(),"Register");

        //"User can see the fields ""First Name"", ""Last Name"", ""Email"", ""Username"", ""Password"", and ""Confirm Password""."
        Assert.assertTrue(kivanc_hauseheavenPage.firstNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.lastNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.emailTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.usernameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.passwordTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.confirmPasswordTextbox.isDisplayed());

        //"User can hover over the ""First Name"", ""Last Name"", ""Email"", and ""Username"" fields and see the warning 'Please fill out this field'."

        validationMessage = kivanc_hauseheavenPage.firstNameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");


        validationMessage = kivanc_hauseheavenPage.lastNameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");


        validationMessage = kivanc_hauseheavenPage.emailTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        validationMessage = kivanc_hauseheavenPage.usernameTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        //"User can hover over the ""Password"" field and see the warning 'Password must be at least 8 characters long and contain at least one letter, one number and one special character'."

        validationMessage = kivanc_hauseheavenPage.passwordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertFalse(validationMessage.isEmpty());

        validationMessage = kivanc_hauseheavenPage.confirmPasswordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");

        //"User can click into the ""First Name"", ""Last Name"", ""Email"", ""Username"", and ""Password"" fields and enter text."
        kivanc_hauseheavenPage.firstNameTextbox.sendKeys(faker.name().firstName());
        kivanc_hauseheavenPage.lastNameTextbox.sendKeys(faker.name().lastName());
        kivanc_hauseheavenPage.emailTextbox.sendKeys(faker.internet().emailAddress());
        kivanc_hauseheavenPage.usernameTextbox.sendKeys(faker.name().username());
        kivanc_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-password"));
        kivanc_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-confirmpassword"));

        //User can see the "Register" button clearly.
        Assert.assertTrue(kivanc_hauseheavenPage.registerButton.isDisplayed());

        //User can click the "Register" button.
        kivanc_hauseheavenPage.registerButton.click();

        //User can see the account dashboard page loads properly.
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("dashboard-url"));

        WebElement body = Driver.getDriver().findElement(By.tagName("body"));

        actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);

        //The registered user sees the "Security" section on the account dashboard home page.
        Assert.assertTrue(kivanc_hauseheavenPage.securityLink.isDisplayed());

        //The registered user clicks the "Security" section.
        kivanc_hauseheavenPage.securityLink.click();

        //The registered user accesses the Security page.
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("security-url"));

        //The registered user sees the "New Password" and "Confirmation" fields on the Security page.
        Assert.assertTrue(kivanc_hauseheavenPage.newPasswordTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.confirmationTextbox.isDisplayed());

        ReusableMethods.bekle(2);

        //The registered user clicks into the password fields and enters data.
        kivanc_hauseheavenPage.newPasswordTextbox.sendKeys("Hauseh.0620");
        kivanc_hauseheavenPage.confirmationTextbox.sendKeys("Hauseh.0620");

        //The registered user sees the "Update Password" button.
        Assert.assertTrue(kivanc_hauseheavenPage.updatePasswordButton.isDisplayed());

        //The registered user clicks the "Update Password" button.
        kivanc_hauseheavenPage.updatePasswordButton.click();

        //The registered user sees the alert message "Password successfully changed".
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        String actualAlertText = alert.getText();
        System.out.println("Alert yazısı: " + actualAlertText);

        Assert.assertTrue(actualAlertText.contains("Password successfully changed"));



    }
}
