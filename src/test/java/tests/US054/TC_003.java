package tests.US054;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_003 {



    Erkan_AdminHouseheavenPage erkan_adminHouseheavenPage = new Erkan_AdminHouseheavenPage();

    @Test
    public void Test (){

        //  The user sees the HOUSE HEAVEN admin login homepage.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        ReusableMethods.bekle(3);

        //  The user sees the email/username textbox.
        Assert.assertTrue(erkan_adminHouseheavenPage.UsernameTextbox.isDisplayed());

        //  The user clicks on the email/username textbox field.
        Assert.assertTrue(erkan_adminHouseheavenPage.UsernameTextbox.isEnabled());

        //  The user enters the data "erkanbinici_admin" in the email/username textbox field.
        erkan_adminHouseheavenPage.UsernameTextbox.sendKeys(ConfigReader.getProperty("admin-erkan"));

        //  The user sees the Password textbox.
        Assert.assertTrue(erkan_adminHouseheavenPage.PasswordTextbox.isDisplayed());

        //  The user clicks on the Password textbox field.
        Assert.assertTrue(erkan_adminHouseheavenPage.PasswordTextbox.isEnabled());

        //  The user enters the data "021924" in the Password textbox field.
        erkan_adminHouseheavenPage.PasswordTextbox.sendKeys(ConfigReader.getProperty("admin-erkan-password"));

        //  The user sees the Sign In button.
        Assert.assertTrue(erkan_adminHouseheavenPage.SignInButton.isDisplayed());

        //  The user clicks the Sign In button.
        erkan_adminHouseheavenPage.SignInButton
                .click();


        //  After clicking the Shelter In button, it displays the "https://qa.hauseheaven.com/admin" page.
        //  The user sees the Admin dashboard homepage open.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLogo.isDisplayed());
        ReusableMethods.bekle(2);

        //  The user sees the Locations category listed under the Dashboard heading in the left menu.
        Assert.assertTrue(erkan_adminHouseheavenPage.LocationsDropdown.isDisplayed());

        //  The user clicks on the Locations category.
        erkan_adminHouseheavenPage.LocationsDropdown
                .click();

        //  Under the Locations category, the user sees Countries, States, Cities listed.
        Assert.assertTrue(erkan_adminHouseheavenPage.Countries.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.States.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.Cities.isDisplayed());
        // Under the Locations category, the user clicks States.
       // When the user clicks States under the Locations category, it displays the "https://qa.hauseheaven.com/admin/states" page.
       // The user will see the registered countries listed under the "ID, NAME, NATIONALITY, CREATED AT, STATUS, OPERATIONS" columns.
       // The user will see the Delete button under the relevant Country OPERATIONS heading from the Listed Countries on the States page that opens.
       // When the user clicks on the Delete button under the relevant Country OPERATIONS heading from the Listed Countries on the States page that opens, a "Confirm delete" warning pop-up appears.
       // In the "Confirm delete" warning pop-up content, the user sees the text "Do you really want to delete this record?", the Cross (x) Icon, Cancel and Delete buttons.
       // The user clicks the Cancel button on the "Confirm delete" warning pop-up.
       // When the user clicks the "Confirm delete" warning pop-up Delete button, the relevant country continues to be displayed in the registered countries table and the Confirm delete pop-up is closed.
       // The user clicks the "Confirm delete" warning pop-up Delete button.
       // When the "Confirm delete" warning pop-up Delete button is clicked, the user sees that the relevant country has been removed from the registered countries table and displays the text "Success Deleted Successfully" in the lower right corner of the page.








    }
}
