package tests.US046;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_gokhan;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    HauseHeaven_gokhan hauseHeaven_gokhan = new HauseHeaven_gokhan();

    @Test
    public void test() {
        WebDriver driver = Driver.getDriver();

        //User opens browser page
        //User clicks on browser search bar
        //The user types the URL https://qa.hauseheaven.com/
        //The user searches (ENTER) for the URL typed into the search bar
        //The user sees the Hause Heaven homepage open
        driver.get("https://qa.hauseheaven.com/");
        String expectedUrl = "https://qa.hauseheaven.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification failed!");

        //User sees Sign Up button
        //The user sees that the Sign Up button is active.
        //User clicks on the Sign Up button
        Assert.assertTrue(hauseHeaven_gokhan.signUpButton.isDisplayed());
        hauseHeaven_gokhan.signUpButton.click();

        //The user sees that he can access the URL https://qa.hauseheaven.com/register
        //The user sees the Register page open
        //The user sees the First name text field on the Register page.
        //The user clicks on the First name text field on the Register page.
        //On the Register page, the user writes "Gökhan" in the First name text field.
        Assert.assertTrue(hauseHeaven_gokhan.firstNameTextArea.isDisplayed());
        hauseHeaven_gokhan.firstNameTextArea.sendKeys("Gökhan");

        //The user sees the Last name text field on the Register page.
        //On the Register page, the user clicks on the Last name text field.
        //On the Register page, the user writes "Bıçak" in the Last name text field.
        Assert.assertTrue(hauseHeaven_gokhan.lastNameTextArea.isDisplayed());
        hauseHeaven_gokhan.lastNameTextArea.sendKeys("Bıçak");

        //User sees Email text field on Register page
        //The user clicks on the Email text field on the Register page.
        //On the Register page, the user writes "gokhan.bicak54@gmail.com" in the Email text field.
        Assert.assertTrue(hauseHeaven_gokhan.emailTextArea.isDisplayed());
        hauseHeaven_gokhan.emailTextArea.sendKeys("gokhan.bicak54@gmail.com");

        //The user sees the Username text field on the Register page.
        //Clicks on the Username text field on the User Register page
        //On the User Register page, type "gokhanbicak" in the Username text field.
        Assert.assertTrue(hauseHeaven_gokhan.usernameTextArea.isDisplayed());
        hauseHeaven_gokhan.usernameTextArea.sendKeys("gokhanbicak54");

        //The user sees the Password text field on the Register page.
        //The user clicks on the Password text field on the Register page.
        //On the Register page, the user writes "WiseQuarter54." in the Password text field.
        Assert.assertTrue(hauseHeaven_gokhan.passwordTextArea.isDisplayed());
        hauseHeaven_gokhan.passwordTextArea.sendKeys("WiseQuarter54.");

        //The user sees the Confirm Password text field on the Register page.
        //On the User Register page, click on the Confirm Password text field.
        //On the User Register page, type "WiseQuarter54." in the Confirm Password text field.
        Assert.assertTrue(hauseHeaven_gokhan.confirmPasswordTextArea.isDisplayed());
        hauseHeaven_gokhan.confirmPasswordTextArea.sendKeys("WiseQuarter54.");

        //The user sees the Register button on the Register page.
        //The user clicks the Register button on the Register page.
        Assert.assertTrue(hauseHeaven_gokhan.registerButton.isDisplayed());
        hauseHeaven_gokhan.registerButton
                .click();

        //The user sees that they can access the URL https://qa.hauseheaven.com/account/dashboard
        //The user sees the Hauseheaven Account Dashboard page open
        Driver.quitDriver();
        ReusableMethods.bekle(2);
    }
}
