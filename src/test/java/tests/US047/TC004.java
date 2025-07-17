package tests.US047;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC004 {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String expectedUrlIcerik = "hauseheaven";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue
                (actualUrlIcerik.contains((expectedUrlIcerik)));

        CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());

        ReusableMethods.bekle(2);
        hauseheavenAdminPages.emailKutusu.click();
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa"));

        hauseheavenAdminPages.passwordKutusu.click();
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa-password"));

        hauseheavenAdminPages.signInButton.click();

        Assert.assertTrue(hauseheavenAdminPages.packageMenuAlanı.isDisplayed());

        hauseheavenAdminPages.packageMenuAlanı.click();

        String expectedPackageSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/packages";
        String actualPackageSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPackageSayfaUrl,actualPackageSayfaUrl);
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packageDeleteButton.click();

        ReusableMethods.bekle(1);
        hauseheavenAdminPages.packageDeletePopUpButton.click();
        ReusableMethods.bekle(2);

        Driver.quitDriver();
    }
}