package tests.US015;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Kivanc_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.time.Duration;

public class TC005 extends TestBaseRapor {

    Kivanc_HauseheavenPage kivanc_hauseheavenPage = new Kivanc_HauseheavenPage();
    String validationMessage;
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void creditsTest() throws IOException {

        extentTest = extentReports.createTest("buy credit testi");

        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

        extentTest.info("User views the Househeaven homepage");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        extentTest.info("User sees the 'Sign Up' link in the header section of the homepage");
        Assert.assertTrue(kivanc_hauseheavenPage.signUpButtton.isDisplayed());

        extentTest.info("User clicks on the 'Sign Up' link");
        kivanc_hauseheavenPage.signUpButtton.click();

        extentTest.info("User sees the Register form on the page");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Register");

        extentTest.info("User can see the fields \"First Name\", \"Last Name\", \"Email\", \"Username\", \"Password\", and \"Confirm Password\".");
        Assert.assertTrue(kivanc_hauseheavenPage.firstNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.lastNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.emailTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.usernameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.passwordTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.confirmPasswordTextbox.isDisplayed());

        extentTest.info("User can hover over the \"First Name\", \"Last Name\", \"Email\", and \"Username\" fields and see the warning 'Please fill out this field'.");
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


        extentTest.info("User can hover over the \"Password\" field and see the warning 'Password must be at least 8 characters long and contain at least one letter, one number and one special character'.");
        validationMessage = kivanc_hauseheavenPage.passwordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertFalse(validationMessage.isEmpty());

        validationMessage = kivanc_hauseheavenPage.confirmPasswordTextbox.getAttribute("validationMessage");
        ReusableMethods.bekle(1);
        Assert.assertEquals(validationMessage, "Lütfen bu alanı doldurun.");


        extentTest.info("User can click into the \"First Name\", \"Last Name\", \"Email\", \"Username\", and \"Password\" fields and enter text.");
        kivanc_hauseheavenPage.firstNameTextbox.sendKeys(faker.name().firstName());
        kivanc_hauseheavenPage.lastNameTextbox.sendKeys(faker.name().lastName());
        kivanc_hauseheavenPage.emailTextbox.sendKeys(faker.internet().emailAddress());
        kivanc_hauseheavenPage.usernameTextbox.sendKeys(faker.name().username());
        kivanc_hauseheavenPage.passwordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-password"));
        kivanc_hauseheavenPage.confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("kivancregester-confirmpassword"));


        extentTest.info("User can see the \"Register\" button clearly.");
        Assert.assertTrue(kivanc_hauseheavenPage.registerButton.isDisplayed());


        extentTest.info("User can click the \"Register\" button.");
        kivanc_hauseheavenPage.registerButton.click();


        extentTest.info("User can see the account dashboard page loads properly.");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("dashboard-url"));


        extentTest.info("The registered user sees the \"Buy Credits\" section on the account dashboard page.");
        Assert.assertTrue(kivanc_hauseheavenPage.buyCreditsLink.isDisplayed());


        extentTest.info("The registered user clicks the \"Buy Credits\" section on the account dashboard page.");
        kivanc_hauseheavenPage.buyCreditsLink.click();


        extentTest.info("The registered user sees the packages in the Credits section.");
        Assert.assertTrue(kivanc_hauseheavenPage.creditPackagesSection.isDisplayed());


        extentTest.info("The registered user select 5posts and clicks on the package");
        kivanc_hauseheavenPage.post5PurchaseButton.click();

        ReusableMethods.bekle(1);


        extentTest.info("The registered user sees the payment page after clicking.");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("payment-url"));


        extentTest.info("The registered user sees the \"Card Number\", \"MM/YY\", \"Full Name\", and \"CVC\" fields on the payment page.");
        Assert.assertTrue(kivanc_hauseheavenPage.cardNumberTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.cardMMYYTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.cardFullNameTextbox.isDisplayed());
        Assert.assertTrue(kivanc_hauseheavenPage.cardCVCTextbox.isDisplayed());


        extentTest.info("The registered user clicks into the \"Card Number\", \"MM/YY\", \"Full Name\", and \"CVC\" fields.");
        kivanc_hauseheavenPage.cardNumberTextbox.sendKeys(faker.number().digits(14));
        kivanc_hauseheavenPage.cardMMYYTextbox.sendKeys(faker.business().creditCardExpiry());
        kivanc_hauseheavenPage.cardFullNameTextbox.sendKeys(faker.name().fullName());
        kivanc_hauseheavenPage.cardCVCTextbox.sendKeys(faker.number().digits(3));

        WebElement body = Driver.getDriver().findElement(By.tagName("body"));

        actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();


        extentTest.info("The registered user clicks the \"Checkout\" button to complete the purchase.");
        kivanc_hauseheavenPage.checkoutButton.click();



        extentTest.info("The registered user sees the title information of the purchased credits on the packages page.");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("packages-url"));

    }
}
