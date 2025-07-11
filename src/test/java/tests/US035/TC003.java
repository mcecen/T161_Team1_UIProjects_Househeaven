package tests.US035;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {

    CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
    @Test
    public void test001(){

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
        ReusableMethods.bekle(2);
        WebElement profilLogosu =hauseheavenAdminPages.profilLogosu;
        Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
        hauseheavenAdminPages.realEstateBasligi.click();
        //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
        hauseheavenAdminPages.propertiesBasligi.click();
        //    Kullanıcı properties başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/properties" sayfasına erişebildiğini görür
        String expectedPropertiesSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties";
        String actualPropertiesSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);


    }

    @Test
    public void test002(){
//  Kullanıcı silmek istediği ilan üzerinde sayfanın en solunda Operations başlığı altındaki  delete ikonunu (çöp kovası) tıklar
        hauseheavenAdminPages.deleteIkonu.click();

//  Kullanıcı delete ikonuna tıklaması ile  ekranda "Do you really want to delete this record ? İbaresi altında "Delete" butonuna tıklar
        hauseheavenAdminPages.deleteButton.click();
//  Kullanıcı Delete butonuna basması ile sayfa yenilenir ve sağ altta "Deleted Successfully" ibaresini görür
     String expectedMesajIcerik ="Deleted Successfully";
     String actualMesajIcerik= hauseheavenAdminPages.createdSuccessfullyMesaji.getText();
     Assert.assertTrue(expectedMesajIcerik.equals(actualMesajIcerik));

    }
}
