package tests.US053;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC_001 {

    Erkan_AdminHouseheavenPage erkan_adminHouseheavenPage = new Erkan_AdminHouseheavenPage();

  @Test

  public void AdminLogin (){



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

      //  On the Countries page that opens, the user sees that there are columns "ID, NAME, NATIONALITY, CREATED AT, STATUS, OPERATIONS".
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesID.isDisplayed());
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesName.isDisplayed());
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesNationality.isDisplayed());
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesCreatedAt.isDisplayed());
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesStatus.isDisplayed());
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesOperations.isDisplayed());


      //  The User Countries page sees that under the "NAME" column, the Country of "United States of America" are listed.
      Assert.assertTrue(erkan_adminHouseheavenPage.CountriesNameUnitedStatesofAmerica.isDisplayed());

      Driver.quitDriver();





  }

    }

