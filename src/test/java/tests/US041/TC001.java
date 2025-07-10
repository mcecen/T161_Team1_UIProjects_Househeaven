package tests.US041;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_gokhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    HauseHeaven_gokhan hauseHeaven_gokhan = new HauseHeaven_gokhan();

    @Test
    public void test() {
        WebDriver driver = Driver.getDriver();

        //User opens browser page // User clicks on browser search bar //The user types the URL https://qa.hauseheaven.com/admin/login
        //The user searches (ENTER) for the URL typed into the search bar //The user sees the Hause Heaven admin login homepage open
        driver.get("https://qa.hauseheaven.com/admin/login");
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification failed!");

        //User sees Email/Username text field //User clicks on the Email/Username text field //The user writes "gokhanbicak_admin" in the Email/Username text field.
        Assert.assertTrue(hauseHeaven_gokhan.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_gokhan.emailInput.sendKeys(ConfigReader.getProperty("admin-gokhan"));

        //User sees Password text field //User clicks the Password text field //The user writes "021924" in the Password text field.
        Assert.assertTrue(hauseHeaven_gokhan.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_gokhan.passwordInput.sendKeys(ConfigReader.getProperty("admin-gokhan-password"));

        //The user sees the SIGN IN button //The user sees that the SIGN IN button is active //User clicks on SIGN IN button
        Assert.assertTrue(hauseHeaven_gokhan.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_gokhan.signInButton.click();
        ReusableMethods.bekle(2);

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin //The user sees the Admin Dashboard homepage open
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification failed!");
    }

    //The user will see the Real Estate dropdown category from the left menu panel
    //The user sees the Real Estate dropdown category active in the left menu panel.
    //User clicks on the Real Estate dropdown category from the left menu panel
    //The user sees the Categories category in the left menu panel
    //The user sees the activity of the Categories category from the left menu panel.
    //The user clicks on the Categories category from the left menu panel
    //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/categories
    //The user sees the Categories page open
    //The user sees the "ID, NAME, PARENT, CREATED AT, STATUS, OPERATIONS" columns and their activities on the Categories page.
    //The user sees the Create button on the Categories page.
    //The user clicks the Create button on the Categories page.
    //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/categories/create
    //The user sees the New category page open
    //On the New category page, the user sees the Name* (required field) text field.
    //User clicks on the Name* (required field) text field on the New category page
    //On the New category page, the user writes the required data in the Name* (required field) text field.
    //The user sees the Description text field on the New category page.
    //The user clicks on the Description text field on the New category page.
    //On the New category page, the user writes the necessary data in the Description text field.
    //The user sees the Order text field on the New category page
    //The user clicks on the Order text field on the New category page.
    //On the New category page, the user writes the necessary data in the Order text field.
    //User sees Status dropdown field on New category page
    //User clicks the Status dropdown field on the New category page
    //On the New category page, the user selects Published in the Status dropdown field
    //The user sees the Save&Exit button on the New category page.
    //The user sees the Save&Exit button active on the New category page.
    //The user clicks the Save&Exit button on the New category page.
    //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/categories
    //The user sees the Categories page open
    //On the Categories page, the user sees "Created successfully" in the bottom right corner of the screen.
    //The user sees the newly added category with ID number XX on the Categories page.
    //The user sees the Edit button under the OPERATIONS column of the newly added category with ID number XX on the Categories page.
    //The user clicks on the Edit button under the OPERATIONS column of the newly added category with ID number XX on the Categories page.
    //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/categories/edit/XX
    //The user sees the Edit category page open
    //The user makes the necessary changes in the "Name*, Decription, Order, Status" text fields on the Edit category page.
    //The user sees the Save button on the Edit category page.
    //The user sees the Save button active on the Edit category page.
    //The user clicks the Save button on the Edit category page.
    //The user sees that the Edit category page is Refreshed
    //On the Edit category page, the user sees "Updated successfully" in the bottom right corner of the screen.
    //The user sees the Categories category in the left menu panel
    //The user sees the activity of the Categories category from the left menu panel.
    //The user clicks on the Categories category from the left menu panel
    //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/categories
    //The user sees the Categories page open
    //The user sees the newly edited category with ID number XX on the Categories page.
    //The user sees the Delete button under the OPERATIONS column of the newly edited category with ID number XX on the Categories page.
    //The user clicks the Delete button under the OPERATIONS column of the newly edited category with ID number XX on the Categories page.
    //The user sees the text "Do you really want to delete this record?" and the Cancel and Delete buttons in the pop-up text that appears on the Categories page.
    //The user sees the Cancel and Delete buttons active in the pop-up text that appears on the Categories page.
    //The user clicks the Delete button in the pop-up that appears on the Categories page.
    //On the Categories page, the user sees "Deleted successfully" in the bottom right corner of the screen.
    //The user sees that the category with ID XX is not available on the Categories page.
}

