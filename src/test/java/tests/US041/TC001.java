package tests.US041;

import org.openqa.selenium.By;
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

        //User opens browser page
        //User clicks on browser search bar
        //The user types the URL https://qa.hauseheaven.com/admin/login
        //The user searches (ENTER) for the URL typed into the search bar
        // The user sees the Hause Heaven admin login homepage open
        driver.get("https://qa.hauseheaven.com/admin/login");
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification failed!");

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

        //The user sees the SIGN IN button //The user sees that the SIGN IN button is active
        //User clicks on SIGN IN button
        Assert.assertTrue(hauseHeaven_gokhan.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_gokhan.signInButton
                .click();
        ReusableMethods.bekle(2);

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin
        //The user sees the Admin Dashboard homepage open
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification failed!");

        //The user will see the Real Estate dropdown category from the left menu panel
        //The user sees the Real Estate dropdown category active in the left menu panel.
        //User clicks on the Real Estate dropdown category from the left menu panel
        hauseHeaven_gokhan.clickRealEstate
                .click();

        //The user sees the Types category in the left menu panel
        //The user sees the Types category active from the left menu panel.
        //The user clicks the Types category from the left menu panel
        hauseHeaven_gokhan.clickTypes
                .click();

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin/real-estate/types
        //The user sees the Types page open
        //The user sees the "ID, NAME, OPERATIONS" columns and their activities on the page that opens.
        //The user sees the Create button on the page that opens.
        //The user clicks the Create button on the page that opens.
        Assert.assertTrue(hauseHeaven_gokhan.createButton
                .isDisplayed());
        hauseHeaven_gokhan.createButton
                .click();

        //The user sees that they can access the URL https://qa.hauseheaven.com/admin/real-estate/types/create
        //The user sees the New type page open
        //The user sees the Name* (required field) text field on the New type page.
        //The user clicks the Name* (required field) text field on the New type page.
        //On the New type page, the user writes the required data in the Name* (required field) text field.
        //The user sees the Code text field on the New type page.
        //The user clicks on the Code text field on the New type page.
        //The user writes the necessary data in the Code text field on the New type page.
        hauseHeaven_gokhan.nameTextArea.sendKeys("New Type");

        //The user sees the Slug* (required field) text field on the New type page.
        //The user clicks the Slug* (required field) text field on the New type page.
        //The user writes the required data in the Slug* (required field) text field on the New type page.
        //The user sees the Order text field on the New type page.
        //The user clicks the Order text field on the New type page.
        //The user writes the necessary data in the Order text field on the New type page.
        hauseHeaven_gokhan.slugTextArea.sendKeys("5");

        //The user sees the Save&Exit button on the New type page.
        //The user sees the Save&Exit button active on the New type page.
        //The user clicks the Save&Exit button on the New type page.
        hauseHeaven_gokhan.saveexitButton
                .click();
        ReusableMethods.bekle(2);
        hauseHeaven_gokhan.saveexitButton
                .click();

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin/real-estate/types
        //The user sees the Types page open
        //On the Types page, the user will see "Created successfully" in the bottom right corner of the screen.
        //The user sees the newly added type with ID number XX on the Types page.
        //On the Types page, the user sees the Edit button under the OPERATIONS column of the newly added type with ID number XX.
        //On the Types page, the user clicks the Edit button under the OPERATIONS column of the newly added type with ID number XX.
        hauseHeaven_gokhan.editButton
                .click();

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin/real-estate/types/edit/XX
        //The user sees the Edit type page open
        //The user makes the necessary changes in the "Name*, Code, Slug*, Order" text fields on the Edit type page.
        hauseHeaven_gokhan.nameTextArea
                .clear();
        hauseHeaven_gokhan.slugTextArea
                .clear();
        hauseHeaven_gokhan.nameTextArea.sendKeys("Type New");
        hauseHeaven_gokhan.slugTextArea.sendKeys("4");

        //The user sees the Save button on the Edit type page.
        //The user sees the Save button active on the Edit type page.
        //The user clicks the Save button on the Edit type page.
        hauseHeaven_gokhan.saveButton
                .click();

        //The user sees that the Edit type page is Refreshed
        //On the Edit type page, the user sees "Updated successfully" in the bottom right corner of the screen.
        //The user sees the Types category in the left menu panel
        //The user sees the Types category active from the left menu panel.
        //The user clicks the Types category from the left menu panel
        hauseHeaven_gokhan.clickTypes
                .click();

        //The user sees that he can access the URL https://qa.hauseheaven.com/admin/real-estate/types
        //The user sees the Types page open
        //The user sees the newly edited type with ID number XX on the Types page.
        //On the Types page, the user sees the Delete button under the OPERATIONS column of the newly edited type with ID number XX.
        //On the Types page, the user clicks the Delete button under the OPERATIONS column of the newly edited type with ID number XX.
        hauseHeaven_gokhan.deleteButton
                .click();

        //On the User Types page, you will see the pop-up text "Do you really want to delete this record?" and the Cancel and Delete buttons.
        //The user sees the Cancel and Delete buttons active in the pop-up text that appears on the Types page.
        //Click the Delete button in the pop-up that appears on the User Types page.
        Driver.getDriver().findElement(By.xpath("//button[@class='float-end btn btn-danger delete-crud-entry']"))
                .click();

        //On the Types page, the user sees "Deleted successfully" in the bottom right corner of the screen.
        //The user sees that the category with ID XX is not available on the Types page.
        Driver.quitDriver();
    }
}

