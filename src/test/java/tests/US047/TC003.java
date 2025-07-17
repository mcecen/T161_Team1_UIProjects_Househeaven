package tests.US047;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
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

        Assert.assertTrue(hauseheavenAdminPages.packageCreateButton.isDisplayed());

        hauseheavenAdminPages.packageCreateButton.click();

        String expectedPackageCreateSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/packages/create";
        String actualPackageCreateSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPackageCreateSayfaUrl,actualPackageCreateSayfaUrl);
        ReusableMethods.bekle(2);

        Faker faker= new Faker();

        hauseheavenAdminPages.packageNameText.sendKeys(faker.book().title());
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packagePriceText.sendKeys(faker.number().numberBetween(88888, 99999) + "");
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packagePersentSaveText.sendKeys(faker.number().numberBetween(10, 90) + "");
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packageNumberOfListingText.sendKeys(faker.number().numberBetween(1000, 9999) + "");
        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packageSaveButton.click();

        hauseheavenAdminPages.packageSaveExitButton.click();
        ReusableMethods.bekle(2);

        String expectedPackageMainSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/packages";
        String actualPackageMainCreateSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPackageCreateSayfaUrl,actualPackageCreateSayfaUrl);

        ReusableMethods.bekle(2);

        hauseheavenAdminPages.packageEditButton.click();

        hauseheavenAdminPages.packageNameText.sendKeys(faker.book().title());
        ReusableMethods.bekle(2);
        hauseheavenAdminPages.packageSaveExitButton.click();

        Driver.quitDriver();
    }
}
