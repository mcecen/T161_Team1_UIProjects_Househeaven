package tests.US055;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_002 {

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

        // Under the Locations category, the user clicks Cities.
        //        When the user clicks Cities under the Locations category, it displays the "https://qa.hauseheaven.com/admin/Cities" page.
        //        On the Cities page that opens, the user will see the "+Create" button.
        //        On the Cities page that opens, the user clicks the "+Create" button.
        //        When the user clicks on the "+Create" button on the Cities Page, it displays the "hhttps://qa.hauseheaven.com/admin/Cities/create" page.
        //        On the Cities>New city page that opens, the user displays the fields "Name*(Textbox), Slug*(Textbox), State(Dropdown), Country*(Dropdown), Order(Spin Box), Featured(Radio Button), Status(dropdown), Edit SEO meta(Button), Save & Exit, Save(Button), Choose image(Button).
        // On the Cities>New city page that opens, the user clicks the Name* Textbox field.
        // On the Cities>New city page that opens, the user enters data in the Name* Textbox field. (Alphabetical, Numeric, and Symbol)
        // On the Cities>New city page that opens, the user clicks the Slug* Textbox field.
        // On the Cities>New city page that opens, the user enters data in the Slug* Textbox field. (Alphabetical, Numeric, and Symbol)
        // The user clicks State dropdown on the Cities>New city page that opens.
        //        When the user clicks on the State dropdown on the Cities>New city page that opens, the registered countries are listed and the selection is made.
        //        On the Cities>New city page that opens, the user clicks on the Country* dropdown.
        //        When the user clicks on the Country* dropdown on the Cities>New city page that opens, the registered countries are listed and the selection is made.
        //        On the Cities>New city page that opens, the user clicks the directional arrows in the Order* Spin Box field.
        //        On the Cities>New city page that opens, the user enters Manual data in the Order* Spin Box field. (Numerical)
        //        The user sees the Status* Dropdown on the Cities>New city page that opens.
        //        On the Cities>New city page that opens, the user clicks on the Status* Dropdown.
        //        When the user clicks Status* Dropdown on the Cities>New city page that opens, he sees that the Published, Draft Pending categories are listed.
        //  The user will see the Featured Radio button on the Cities>New city page that opens.
        // The user clicks the Featured Radio button on the Cities>New city page that opens.
        //        When the user clicks the Featured Radio button on the Cities>New city page that opens, the button slides to the right and appears in red.
        //        The user sees the Edit SEO meta button on the Cities>New city page that opens.
        //        The user clicks the Edit SEO meta button on the Cities>New city page that opens.
        //        When the user clicks the Edit SEO meta button on the Cities>New city page that opens, SEO Title, SEO description Textboxes open.
        //        The user clicks on the SEO Title texbox field on the Cities>New city page that opens and enters data. (Alphabetical, Numeric, Symbol)
        //  When the user clicks on the SEO Title field on the Cities>New city page and enters data, the relevant data is seen under Search Engine Optimize and the date the relevant data was created is reflected. ( Ex: Jun 30,2025 - ) (Alphabetical, Numeric, Symbol)
        //  The user clicks on the SEO description texbox field on the Cities>New city page and enters data. (Alphabetical, Numeric, Symbol)
        // When the user clicks on the SEO description texbox field on the Cities>New city page that opens and enters data, the relevant data is seen under Search Engine Optimize and is seen to the right of the date the relevant data was created. (Ex: Jun 30,2025 - CEO) (Alphabetical, Numeric, Symbol)
        // The user sees the Save button on the Cities>New city page that opens.
        // The user clicks the Save button on the Cities>New city page that opens.
        // When the user clicks the Save button on the Cities>New city page that opens, the information entered in the relevant fields is saved, it should remain on the "https://qa.hauseheaven.com/admin/Cities/create" page, it displays the text "Success Created Successfully" in the lower right corner of the page.
        // The user sees the Cities banner from the top menu headings on the Cities>New city page that opens.
        //        The user clicks on the Cities heading from the top menu headings on the Cities>New city page that opens.
        //        When the user clicks on the Cities heading from the top menu headings on the Cities>New city page, he is directed to the "https://qa.hauseheaven.com/admin/Cities" page and sees the information recorded on the "https://qa.hauseheaven.com/admin/cities/create" page under the "NAME", "COUNTRY" column headings.



    }
}
