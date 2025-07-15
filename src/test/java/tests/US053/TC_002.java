package tests.US053;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void CrateCountry (){

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



       // Kullanıcı açılan Countries sayfasında "+Create" butonunu görür.
        Assert.assertTrue(erkan_adminHouseheavenPage.CreateButton.isDisplayed());

       // Kullanıcı açılan Countries sayfasında "+Create" butonuna tıklar.
        erkan_adminHouseheavenPage.CreateButton
                .click();

       // Kullanıcı Countries Sayfası "+Create" butonuna tıkladığı zaman "https://qa.hauseheaven.com/admin/countries/create" sayfasını görüntüler.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsCountriesNewcountry.isDisplayed());
        ReusableMethods.bekle(2);

       // Kullanıcı açılan Countries>New Country sayfasında "Name*(Textbox), Nationality*(Textbox), Country ISO code*(Textbox), Dial code*(Textbox), Order(Spin Box), Status(dropdown), Save & Exit, Save(Button) alanlarını görüntüler.
        Assert.assertTrue(erkan_adminHouseheavenPage.NameBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.NationalityBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.CountryISOcodeBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.StatusTextbox.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.DialcodeBaslik.isDisplayed());
        Assert.assertTrue(erkan_adminHouseheavenPage.OrderBaslik.isDisplayed());

       // Kullanıcı açılan Countries>New Country sayfasında Name* Textbox alanına tıklar.
        Assert.assertTrue(erkan_adminHouseheavenPage.NameTextbox.isEnabled());


       // Kullanıcı açılan Countries>New Country sayfasında Name* Textbox alanına veri girişi yapar. (Alfabetik, Nümerik ve Simge)
        erkan_adminHouseheavenPage.NameTextbox.sendKeys(faker.country().name());


       // Kullanıcı açılan Countries>New Country sayfasında Nationality* Textbox alanına tıklar.
        Assert.assertTrue(erkan_adminHouseheavenPage.NationalityTextbox.isEnabled());


       // Kullanıcı açılan Countries>New Country sayfasında Nationality* Textbox alanına veri girişi yapar. (Alfabetik, Nümerik ve Simge)
        erkan_adminHouseheavenPage.NationalityTextbox.sendKeys(faker.nation().nationality());


       // Kullanıcı açılan Countries>New Country sayfasında Country ISO code* Textbox alanına tıklar.
        Assert.assertTrue(erkan_adminHouseheavenPage.CountryISOcodeTextbox.isEnabled());


        // Kullanıcı açılan Countries>New Country sayfasında Country ISO code* Textbox alanına veri girişi yapar. (Alfabetik, Nümerik ve Simge)
        erkan_adminHouseheavenPage.CountryISOcodeTextbox.sendKeys(faker.country().countryCode2());

       // Kullanıcı açılan Countries>New Country sayfasında Dial code* Textbox alanına tıklar.
        Assert.assertTrue(erkan_adminHouseheavenPage.DialcodeTextbox.isEnabled());

       // Kullanıcı açılan Countries>New Country sayfasında Dial code* Textbox alanına veri girişi yapar. (Alfabetik, Nümerik ve Simge)
        erkan_adminHouseheavenPage.DialcodeTextbox.sendKeys(faker.number().numberBetween(1,99) + "");

       // Kullanıcı açılan Countries>New Country sayfasında Order* Spin Box alanı aşağı yukaru yön oklarına tıklar.
        Assert.assertTrue(erkan_adminHouseheavenPage.OrderTextbox.isEnabled());

       // Kullanıcı açılan Countries>New Country sayfasında Order* Spin Box alanına Manuel veri girişi yapar. (Nümerik)
        erkan_adminHouseheavenPage.OrderTextbox.sendKeys(faker.number().numberBetween(1,27) + "");

       // Kullanıcı açılan Countries>New Country sayfasında Status* Dropdownunu görür.
        Assert.assertTrue(erkan_adminHouseheavenPage.StatusDropdownBaslik.isDisplayed());

       // Kullanıcı açılan Countries>New Country sayfasında StatusDropdownPublished Dropdownuna tıklar.
        erkan_adminHouseheavenPage.StatusDropdownPublished
                .click();

       // Kullanıcı açılan Countries>New Country sayfasında Status* Dropdownuna tıklandığı zaman Published, Draft Pending kategorilerinin listelendiğini görür.
        Assert.assertTrue(erkan_adminHouseheavenPage.StatusDropdownPublished.isDisplayed());


       // Kullanıcı açılan Countries>New Country sayfasında Save & Exit butonunu görür.
        Assert.assertTrue(erkan_adminHouseheavenPage.SaveExitButton.isDisplayed());

       // Kullanıcı açılan Countries>New Country sayfasında Save & Exit butonuna tıklar.
        erkan_adminHouseheavenPage.SaveExitButton
                .click();

       // Kullanıcı açılan Countries>New Country sayfasında Save & Exit butonuna tıkladığı zaman "https://qa.hauseheaven.com/admin/countries" sayfasına yönlendirilmeli ve "Success Created Successfully" yazısını sayfanın sağ alt köşesinde görüntüler.
        Assert.assertTrue(erkan_adminHouseheavenPage.DashboardLocationsCountries.isDisplayed());
        ReusableMethods.bekle(3);

        WebElement toastMessage = driver.findElement(By.cssSelector("div.toast-message"));
        Assert.assertTrue(toastMessage.isDisplayed());
        Assert.assertEquals(toastMessage.getText(), "Created successfully");

       // Kullanıcı açılan Countries sayfası New Country sayfasında girilen yeni Ülke kayıt bilgilerini "NAME, NATIONALITY, STATUS" kolonları altında ilk sırada görüntüler.


        Driver.quitDriver();















    }
}
