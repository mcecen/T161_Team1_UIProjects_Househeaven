package tests.US053;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_005 {


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


        //  Under the Locations category, the user clicks Countries.
        erkan_adminHouseheavenPage.Countries
                .click();

        //  When the user clicks on Countries under the Locations category, it displays the "https://qa.hauseheaven.com/admin/countries" page.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsCountries.isDisplayed());


       // The user will see the registered countries listed under the "ID, NAME, NATIONALITY, CREATED AT, STATUS, OPERATIONS" columns.
       // The user will see the Edit button on the Countries page that opens, under the heading Country OPERATIONS from the Listed Countries.
       // The user clicks the Edit button under the relevant Country OPERATIONS heading from the Countries page that opens.
       // When the user clicks on the Edit button under the relevant Country OPERATIONS heading from the Countries page that opens, he is directed to the "https://qa.hauseheaven.com/admin/countries/edit/" page.
       // On the Countries>Edit Country page that opens, the user displays the previously generated data in the "Name*(Textbox), Nationality*(Textbox), Country ISO code*(Textbox), Dial code*(Textbox), Order(Spin Box), Status(dropdown), Save & Exit, Save(Button) fields.
       // On the Countries>Edit Country page that opens, the user clicks the Name* Textbox field.
       // On the Countries>Edit Country page that opens, the user deletes the old data in the Name* Textbox field and enters the current data. (Alphabetical, Numeric, and Symbol)
       // On the Countries>Edit Country page that opens, the user clicks the Nationality* Textbox field.
       // On the Countries>Edit Country page that opens, the user deletes the old data in the Nationality* Textbox field and enters the current data. (Alphabetical, Numeric, and Symbol)
       // On the Countries>Edit Country page that opens, the user clicks the Country ISO code* Textbox field.
       // On the Countries>Edit Country page that opens, the user deletes the old data in the Country ISO code* Textbox field and enters the current data. (Alphabetical, Numeric, and Symbol)
       // On the Countries>Edit Country page that opens, the user clicks the Dial code* Textbox field.
       // On the Countries>Edit Country page that opens, the user deletes the old data in the Dial code* Textbox field and enters the current data. (Alphabetical, Numeric, and Symbol)
       // On the Countries>Edit Country page that opens, the user clicks the directional arrows up and down in the Order* Spin Box field.
       // On the Countries>Edit Country page that opens, the user enters Current data in the Order* Spin Box field. (Numerical)
       // The user sees the Status* Dropdown on the Countries>Edit Country page that opens.
       // On the Countries>Edit Country page that opens, the user clicks Status* Dropdown.
       // When the user clicks Status* Dropdown on the Countries>Edit Country page that opens, he sees that the Published, Draft Pending categories are listed and selects the current data option.
       // The user will see the Save & Exit button on the Countries>Edit Country page that opens.
       // The user clicks the Save & Exit button on the Countries>Edit Country page that opens.
       // When the user clicks the Save & Exit button on the Countries>Edit Country page that opens, they should be directed to the "https://qa.hauseheaven.com/admin/countries" page and will display the text "Success Updated Successfully" in the lower right corner of the page.
       // The Countries page that opens displays the updated Country registration information on the Edit Country page with the updated information in the relevant order under the "NAME, NATIONALITY, STATUS" columns.







    }
}
