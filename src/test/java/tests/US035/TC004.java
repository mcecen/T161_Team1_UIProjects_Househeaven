package tests.US035;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Cennet;

public class TC004 extends TestBaseRapor_Cennet {
    CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
    Faker faker = new Faker();

    @Test
    public void test001(){

        extentTest=extentReports.createTest("Yeni ilan oluşturma testi",
                               "Kullanıcı bütün alanları doldurarak yeni ilan oluşturabilmeli ");

        //    Kullanıcı tarayıcı arama çubuğuna hauseheaven "URL:https://qa.hauseheaven.com/admin/login" URL adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        extentTest.info("Kullanıcı  hauseheaven \"URL:https://qa.hauseheaven.com/admin/login\" URL adresine gider");
        String expectedUrlIcerik = "hauseheaven";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));
        extentTest.pass("Url in hauseheaven içerdiğini test eder");

        //    Kullanıcı email/username text alanını görür
        //    Kullanıcı email/username text alanını tıklar
        //    Kullanıcı email/username text alanına geçerli email/username girer
        hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());
        extentTest.pass("Email kutusunun görünürlüğünü test eder");
        ReusableMethods.bekle(3);
        hauseheavenAdminPages.emailKutusu.click();
        extentTest.info(" Kullanıcı email/username text alanını tıklar");
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-cennet"));
        extentTest.info("Kullanıcı email/username text alanına geçerli email/username girer");
        //    Kullanıcı password text alanını görür
        Assert.assertTrue(hauseheavenAdminPages.passwordKutusu.isDisplayed());
        extentTest.pass("Kullanıcı password text alanının görünür olduğunu test eder ");
        //    Kullanıcı password text alanını tıklar
        ReusableMethods.bekle(3);
        hauseheavenAdminPages.passwordKutusu.click();
        extentTest.info("Kullanıcı password text alanını tıklar");
        //    Kullanıcı password text alanına geçerli password girer
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-cennet-password"));
        extentTest.info(" Kullanıcı password text alanına geçerli password girer");
        //    Kullanıcı sign in butonunu tıklar
        hauseheavenAdminPages.signInButton.click();
        extentTest.info("Kullanıcı sign in butonunu tıklar");
        //    Kullanıcı sign in butonunu tıklama ile" https://qa.hauseheaven.com/admin"sayfasına erişir
        //    Kullanıcı Deshboard sayfasına eriştiğini görür
        //    Kullanıcı sağ en üstte (Cennet Atak) kullanıcı adında profil logosunu görür
        ReusableMethods.bekle(2);
        WebElement profilLogosu =hauseheavenAdminPages.profilLogosu;
        Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
        extentTest.pass("Kullanıcı sağ en üstte (Cennet Atak) kullanıcı adında profil logosunu görünür olduğunu test eder");
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
        Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
        extentTest.pass(" Kullanıcı deshboard sayfası sol menüde Real Estate başlığının görünürlüğünü test eder");
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
        hauseheavenAdminPages.realEstateBasligi.click();
        extentTest.info("Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar");


        //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını tıklar
        hauseheavenAdminPages.propertiesBasligi.click();
        extentTest.info("Properties başlığını tıklar");
        //    Kullanıcı properties başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/properties" sayfasına erişebildiğini görür
        String expectedPropertiesSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties";
        String actualPropertiesSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);
     extentTest.pass("Kullanıcı 'https://qa.hauseheaven.com/admin/real-estate/properties' sayfasına erişebildiğini test eder");

    }
    @Test
    public void test002(){
       // Kullanıcı create butonunu görür
   Assert.assertTrue(hauseheavenAdminPages.createButton.isDisplayed());
   extentTest.pass("Kullanıcı create butonunun görünürlüğünü test eder");
// Kullanıcı sağ üst tarafta "Create" butonunu tıklar
        ReusableMethods.bekle(3);
    hauseheavenAdminPages.createButton.click();
    extentTest.info("Kullanıcı sağ üst tarafta 'Create' butonunu tıklar");
// Kullanıcı sağ üst tarafta "Create" butonunu tıklaması ile"https://qa.hauseheaven.com/admin/real-estate/properties/create" url adresine ulaşır
    String expectedSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties/create" ;
    String actualSayfaUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(expectedSayfaUrl.equals(actualSayfaUrl));
    extentTest.pass("Kullanıcı https://qa.hauseheaven.com/admin/real-estate/properties/create sayfasına eriştiğini test eder");
// Kullanıcı Createsayfasında "Title" textbox ını tıklar
     hauseheavenAdminPages.titleAlani.click();
     extentTest.info("Kullanıcı Createsayfasında \"Title\" textbox ını tıklar");
// Kullanıcı  Create sayfasında "Title" textbox ına title içeriğini yazar
   hauseheavenAdminPages.titleAlani.sendKeys(faker.toString());
   extentTest.info("Kullanıcı title içeriğini yazar");
// Kullanıcı  Create sayfasında "Description" butonunu  tıklar
 hauseheavenAdminPages.descriptionAlani.click();
 extentTest.info("Kullanıcı  Create sayfasında \"Description\" butonunu  tıklar");
// Kullanıcı Create sayfasında "Description" textbox ına istediği metni yazar
   hauseheavenAdminPages.descriptionAlani.sendKeys(faker.toString());
   extentTest.info("istediği metni yazar");
// Kullanıcı  Create sayfasında "Content" butonunu  tıklar
   hauseheavenAdminPages.contentAlani.click();
   extentTest.info("Kullanıcı  Create sayfasında \"Content\" butonunu  tıklar");
// Kullanıcı  Create sayfasında "Content" textbox ına istediği metni yazar
   hauseheavenAdminPages.contentAlani.sendKeys(faker.toString());
   extentTest.info(" istediği metni yazar");
// Kullanıcı sayfayı aşağı kaydırarak ilerler
  Actions actions= new Actions(Driver.getDriver());
  actions.sendKeys(Keys.PAGE_DOWN).perform();
  extentTest.info("Kullanıcı sayfayı aşağı kaydırarak ilerler");
// Kullanıcı "Add ımage" butnunu tıklar
    ReusableMethods.bekle(3);
   JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("arguments[0].click();", hauseheavenAdminPages.addImageButton);
    extentTest.info("Kullanıcı Add Image butonuna tıklar");
// MediaGallery URL kontrolü
    ReusableMethods.bekle(2);
     String expectedMediaGalleryUrl = "https://qa.hauseheaven.com/admin/real-estate/properties/create/mediagallery";
     String actualUrl = Driver.getDriver().getCurrentUrl();
     System.out.println("Gidilen URL: " + actualUrl);
     ReusableMethods.bekle(3);
     Assert.assertEquals(actualUrl, expectedMediaGalleryUrl);
     ReusableMethods.bekle(2);
     extentTest.pass("Kullanıcı 'mediagallery' sayfasına yönlendirildiğini doğrular");


        }
}
