package tests.US046;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_gokhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {

    HauseHeaven_gokhan hauseHeaven_gokhan = new HauseHeaven_gokhan();

    @Test
    public void test() {
        WebDriver driver = Driver.getDriver();

        //User opens browser page
        //User clicks on browser search bar
        //The user types the URL https://qa.hauseheaven.com/admin/login
        //The user searches (ENTER) for the URL typed into the search bar
        //The user sees the Hause Heaven admin login homepage open
        driver.get("https://qa.hauseheaven.com/admin/login");
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification failed!");

        ReusableMethods.bekle(2);

        //User sees Email/Username text field
        //User clicks on the Email/Username text field
        //The user writes "gokhanbicak_admin" in the Email/Username text field.
        Assert.assertTrue(hauseHeaven_gokhan.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_gokhan.emailInput.sendKeys(ConfigReader.getProperty("admin-gokhan"));

        //User sees Password text field
        //User clicks the Password text field
        //The user writes "021924" in the Password text field.
        Assert.assertTrue(hauseHeaven_gokhan.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_gokhan.passwordInput.sendKeys(ConfigReader.getProperty("admin-gokhan-password"));

        //The user sees the SIGN IN button
        //The user sees that the SIGN IN button is active.
        //User clicks on SIGN IN button
        Assert.assertTrue(hauseHeaven_gokhan.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_gokhan.signInButton
                .click();
        ReusableMethods.bekle(2);

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin
        //The user sees the Admin Dashboard homepage open
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification failed!");

        //The user sees the Accounts category in the left menu panel
        //The user sees the activity of the Accounts category from the left menu panel.
        //The user clicks the Accounts category from the left menu panel
        Assert.assertTrue(hauseHeaven_gokhan.accountButton.isDisplayed());
        hauseHeaven_gokhan.accountButton
                .click();

        //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/accounts
        //The user sees the Accounts page open
        //On the User Accounts page, you can see the columns "ID, IMAGE, NAME, EMAIL, PHONE, CREDITS, CREATED AT, OPERATIONS" and their activities.
        //The user sees the newly added account on the Accounts page.
        //On the Accounts page, the user sees the Delete button under the OPERATIONS column of the newly added account.
        //On the Accounts page, the user clicks the Delete button under the OPERATIONS column of the newly added account.
        hauseHeaven_gokhan.deleteButton
                .click();

        //On the User Accounts page, you will see the pop-up text "Do you really want to delete this record?" and the Cancel and Delete buttons.
        //The user sees the Cancel and Delete buttons active in the pop-up text that appears on the Accounts page.
        //Click the Delete button in the pop-up that appears on the User Accounts page.
        Driver.getDriver().findElement(By.xpath("//button[@class='float-end btn btn-danger delete-crud-entry']"))
                .click();

        //On the User Accounts page, you will see the text "Deleted successfully" in the bottom right corner of the screen.
        Driver.quitDriver();
    }
}
