package tests.US052;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenAdmin_Mustafa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String expectedUrlIcerik = "hauseheaven";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));

        HauseheavenAdmin_Mustafa hauseheavenAdminPages = new HauseheavenAdmin_Mustafa();
        Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.emailKutusu.click();
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa"));

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.passwordKutusu.click();
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa-password"));

        hauseheavenAdminPages.signInButton.click();

        Assert.assertTrue(hauseheavenAdminPages.locationMenuAlani.isDisplayed());
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.locationMenuAlani.click();
        ReusableMethods.bekle(3);

        hauseheavenAdminPages.countriesMenuAlani.click();
        ReusableMethods.bekle(2);

        String expectedCountriesSayfaUrl="https://qa.hauseheaven.com/admin/countries";
        String actualCountriesSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedCountriesSayfaUrl,actualCountriesSayfaUrl);

        Driver.quitDriver();
    }
}