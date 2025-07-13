package tests.US037;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {

    CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
    Faker faker = new Faker();

    @Test
    public void test001() {

        //    Kullanıcı tarayıcı arama çubuğuna hauseheaven "URL:https://qa.hauseheaven.com/admin/login" URL adresini yazar
        //    Kullanıcı Arama butonuna tıklar
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String expectedUrlIcerik = "hauseheaven";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));
        hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());
        //    Kullanıcı email/username text alanını görür
        //    Kullanıcı email/username text alanını tıklar
        //    Kullanıcı email/username text alanına geçerli email/username girer

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.emailKutusu.click();
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-cennet"));
        //    Kullanıcı password text alanını görür
        //    Kullanıcı password text alanını tıklar
        //    Kullanıcı password text alanına geçerli password girer
        ReusableMethods.bekle(3);
        hauseheavenAdminPages.passwordKutusu.click();
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-cennet-password"));
        //    Kullanıcı sign in butonunu görür
        //    Kullanıcı sign in butonunu tıklar
        hauseheavenAdminPages.signInButton.click();
        //    Kullanıcı sign in butonunu tıklama ile" https://qa.hauseheaven.com/admin"sayfasına erişir
        //    Kullanıcı Deshboard sayfasına eriştiğini görür
        //    Kullanıcı sağ en üstte (Cennet Atak) kullanıcı adında profil logosunu görür
        Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
        //    Kullanıcı Deshboard sayfasında Active properties,Pending properties,Expired properties ve Agents kategorilerini görür
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
        hauseheavenAdminPages.realEstateBasligi.click();
        // Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Features başlığını görür
        // Kullanıcı Real Estate başlığı altında açılan alt menude çıkan Features başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.featuresBasligi.isDisplayed());
        hauseheavenAdminPages.featuresBasligi.click();
        // Kullanıcı Features başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/property-features" sayfasına erişebildiğini görür
        String expectedFeaturesSayfaUrl = "https://qa.hauseheaven.com/admin/real-estate/property-features";
        String actualFeaturesSayfaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedFeaturesSayfaUrl, actualFeaturesSayfaUrl);
        Driver.quitDriver();

    }

    @Test
    public void test002() {

// Kullanıcı Features sayfasında sağ üstte Create butonunu görür
// Kullanıcı Features sayfasında sağ üstte Create butonunu tıklar
        Assert.assertTrue(hauseheavenAdminPages.createButton.isDisplayed());
        hauseheavenAdminPages.createButton.click();
// Kullanıcı Features sayfasında sağ üstte Create butonunu tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/property-features/create"url ine ulaşır
        String expectedCreateSayfaUrl = "https://qa.hauseheaven.com/admin/real-estate/property-features/create";
        String actualCreateSayfaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedCreateSayfaUrl.equals(actualCreateSayfaUrl));
// Kullanıcı  Features sayfasındaki create sayfasında "Title" texbox ını görür
// Kullanıcı  Features sayfasındaki create  sayfasında "Title" texbox ını tıklar
        hauseheavenAdminPages.titleAlani.click();
// Kullanıcı  Features sayfasındaki create  sayfasında "Title" texbox ına eklemek istediği özellik içeriğini yazar
        hauseheavenAdminPages.titleAlani.sendKeys(faker.toString());
// Kullanıcı  Features sayfasındaki create sayfasında "Icon" texbox ını görür
// Kullanıcı  Featuressayfasındaki create sayfasında "Icon" texbox ını tıklar
// Kullanıcı  Features sayfasındaki create  sayfasında "Icon" texbox ını tıklar ve altta açılan menüden birini tıklayarak seçer
        hauseheavenAdminPages.iconAlaniDdm.click();
        Select select = new Select(hauseheavenAdminPages.iconAlaniDdm);
        select.selectByValue("ti-flickr");

// Kullanıcı Features sayfasındaki create sayfasında sağ tarafta  "Publish" yazısı altında Save   texbox ını görür
// Kullanıcı  Features sayfasındaki create sayfasında sağ tarafta  "Publish" yazısı altında Save   texbox ını tıklar
// Kullanıcı  Features sayfasındaki create sayfasında sağ tarafta  "Publish" yazısı altında Save   texbox ını tıklamak ile sayfa yenilenir , aynı sayfada kalır ve "Created successfully" ibaresi görülür
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, -600)");
        hauseheavenAdminPages.saveButton.click();
        String expectedSonucMesajIcerik = "Created successfully";
        String actualSonucMesajIcerik = hauseheavenAdminPages.createdSuccessfullyMesaji.getText();
        Assert.assertTrue(actualSonucMesajIcerik.contains(expectedSonucMesajIcerik));
        ReusableMethods.bekle(3);
// Kullanıcı features anasayfaya geri döner
        Driver.getDriver().get("https://qa.hauseheaven.com/admin/real-estate/property-features");
        Assert.assertTrue(hauseheavenAdminPages.createButton.isDisplayed());
        hauseheavenAdminPages.createButton.click();
// Kullanıcı Features sayfasında sağ üstte Create butonunu tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/property-features/create"url ine ulaşır
        String expectedCreateSayfaUrl2 = "https://qa.hauseheaven.com/admin/real-estate/property-features/create";
        String actualCreateSayfaUrl2 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedCreateSayfaUrl2.equals(actualCreateSayfaUrl2));
// Kullanıcı  Features sayfasındaki create sayfasında "Title" texbox ını görür
// Kullanıcı  Features sayfasındaki create  sayfasında "Title" texbox ını tıklar
        hauseheavenAdminPages.titleAlani.click();
        // Kullanıcı  Features sayfasındaki create  sayfasında "Title" texbox ına eklemek istediği özellik içeriğini yazar
        hauseheavenAdminPages.titleAlani.sendKeys(faker.toString());
// Kullanıcı  Features sayfasındaki create sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit  texbox ını görür
// Kullanıcı Features sayfasındaki create sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
// Kullanıcı  Features sayfasındaki create  sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak ile sayfa yenilenir Features anasayfaya yönlendirilir ve ve "Created successfully" ibaresi görülür
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, -600)");
        hauseheavenAdminPages.saveExitButton.click();
        String expectedSonucMesajIcerik2 = "Created successfully";
        String actualSonucMesajIcerik2 = hauseheavenAdminPages.createdSuccessfullyMesaji.getText();
        Assert.assertTrue(actualSonucMesajIcerik.contains(expectedSonucMesajIcerik));
        ReusableMethods.bekle(3);

    }

}
