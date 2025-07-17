package tests.US054;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Erkan_AdminHouseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC_002 {

    Erkan_AdminHouseheavenPage erkan_adminHouseheavenPage = new Erkan_AdminHouseheavenPage();

    Faker faker = new Faker();


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
        Assert.assertTrue(erkan_adminHouseheavenPage.States.isDisplayed());


        //  Under the Locations category, the user clicks Countries.
        erkan_adminHouseheavenPage.States
                .click();

        //  When the user clicks on Countries under the Locations category, it displays the "https://qa.hauseheaven.com/admin/countries" page.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsStates.isDisplayed());

        // The user should display the "+Create" button on the States page that opens.
        Assert.assertTrue(erkan_adminHouseheavenPage.CreateButton.isDisplayed());



        // The user should be able to click the "+Create" button on the States page that opens.
        erkan_adminHouseheavenPage.CreateButton
                .click();

        // When the user clicks the "+Create" button, the States Page displays the "hhttps://qa.hauseheaven.com/admin/states/create" page.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsStatesNewstate.isDisplayed());


        // The user should display the "Name*(Textbox), Abbreviation*(Textbox), Country*(Dropdown), Order(Spin Box), Save(Button) fields on the States>New States page that opens.
        Assert.assertTrue(erkan_adminHouseheavenPage.NewstateNameBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.NewstateAbbreviationBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.NewstateCountryBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.NewstateOrderBaslik.isDisplayed());



        // The user should be able to enter data in the Name* Textbox field on the States>New States page that opens. (Alphabetical, Numeric, and Symbol)
        erkan_adminHouseheavenPage.NewstateNameTextBox.sendKeys(faker.address().state());

        // The user should be able to enter data in the Abbreviation* Textbox field on the States>New States page that opens. (Alphabetical, Numeric, and Symbol)
        erkan_adminHouseheavenPage.NewstateAbbreviationTextBox.sendKeys(faker.code() + "");

        // The user should be able to click on the Country>New States dropdown on the StatesNew States page that opens.
        // When the user clicks on the Country* dropdown on the States>New States page that opens, the registered countries are listed and should be able to choose.
        erkan_adminHouseheavenPage.NewstateCountryDrp
                .click();
        WebElement dropdownElement = driver.findElement(By.cssSelector("(//span[@class='select2-selection__rendered'])[1]"));
        dropdownElement.click();

        Select dropdown = new Select(dropdownElement);

        dropdown.selectByVisibleText("Canada");

        WebElement option = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1], 'Canada')]"));
        option.click();



        // On the States>New States page that opens, the user should be able to click on the directional arrows in the Order* Spin Box field.
        // The user should be able to manually enter data in the Order* Spin Box field on the States>New States page that opens. (Numerical)
        // The user should view the Status* Dropdown on the States>New States page that opens.
        // The user should be able to click on the States>New States page that opens.
        // When the user clicks Status* Dropdown on the States>New States page that opens, the Published, Draft Pending categories should be listed.
        // The user should view the Save button on the States>New States page that opens.
        // The user should be able to click the Save button on the States>New States page that opens.
        // When the user clicks the Save button on the States>New States page that opens, the information entered in the relevant fields is saved, it should remain on the "https://qa.hauseheaven.com/admin/states/create" page, it displays the text "Success Created Successfully" in the lower right corner of the page.
        // The user should view the States heading from the top menu headings on the States>New States page that opens.
        // The user should be able to click on the States heading from the top menu headings on the States>New States page that opens.
        // When the user clicks on the States heading from the top menu headings on the States>New States page, he should be directed to the "https://qa.hauseheaven.com/admin/states" page and view the information recorded on the "https://qa.hauseheaven.com/admin/states/create" page under the "NAME", "COUNTRY" column headings.














    }

}
