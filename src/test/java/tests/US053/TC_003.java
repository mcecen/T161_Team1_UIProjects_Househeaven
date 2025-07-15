package tests.US053;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_003 {

    Erkan_AdminHouseheavenPage erkan_adminHouseheavenPage = new Erkan_AdminHouseheavenPage();


    @Test
    public void SearchBoxTest (){

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

        //  The user sees the Locations category listed under the Dashboard heading in the left menu.
        Assert.assertTrue(erkan_adminHouseheavenPage.LocationsDropdown.isDisplayed());

        //  The user clicks on the Locations category.
        erkan_adminHouseheavenPage.LocationsDropdown
                .click();

        //  Under the Locations category, the user sees Countries,listed.
        Assert.assertTrue(erkan_adminHouseheavenPage.Countries.isDisplayed());


        //  Under the Locations category, the user clicks Countries.
        erkan_adminHouseheavenPage.Countries
                .click();

        //  When the user clicks on Countries under the Locations category, it displays the "https://qa.hauseheaven.com/admin/countries" page.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsCountries.isDisplayed());

        // The user will see the "Search Box" field on the Countries page that opens.
        Assert.assertTrue(erkan_adminHouseheavenPage.SearchBox.isDisplayed());

        // On the Countries page that opens, the user enters data in the "Search Box" field. (Alphabetical, Numeric)
        Assert.assertTrue(erkan_adminHouseheavenPage.SearchBox.isEnabled());

       erkan_adminHouseheavenPage.SearchBox.sendKeys(ConfigReader.getProperty("Thailand"));

        // When the user enters data in the "Search Box" field on the Countries page that opens, the Country or countries suitable for the relevant data are listed. (For example: When we type "IR" in the Serach Box field, if Iraq and Iran are registered countries, both countries are listed.)
        Assert.assertTrue(erkan_adminHouseheavenPage.Thailand.isDisplayed());

        Driver.quitDriver();






    }
}
