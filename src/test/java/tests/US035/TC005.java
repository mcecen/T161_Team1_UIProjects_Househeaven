package tests.US035;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC005 {


        CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Faker faker = new Faker();
         Actions actions = new Actions(Driver.getDriver());

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
        public void test002() {

        // Kullanıcı sağ üst tarafta "Create" butonunu tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.createButton.click();
        // Kullanıcı sağ üst tarafta "Create" butonunu tıklaması ile"https://qa.hauseheaven.com/admin/real-estate/properties/create" url adresine ulaşır
            String expectedSayfaUrl = "https://qa.hauseheaven.com/admin/real-estate/properties/create";
            String actualSayfaUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(expectedSayfaUrl.equals(actualSayfaUrl));
// Kullanıcı Create sayfasında zorunlu alanlardan olan "Title" textbox ını görür
           Assert.assertTrue(hauseheavenAdminPages.titleAlani.isDisplayed());
// Kullanıcı create sayfasında  zorunlu alanlardan title alanını boş bırakır
//  Kullanıcı create sayfasında  zorunlu alanlardan Content alanını  tklar
            hauseheavenAdminPages.contentAlani.click();
// Kullanıcı create sayfasında  zorunlu alanlardan Content alanına veri  yazar
            hauseheavenAdminPages.contentAlani.sendKeys(faker.job().title());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
// Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  tklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.propertyLocationAlani.click();
// Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  veri yazar
            hauseheavenAdminPages.propertyLocationAlani.sendKeys(faker.job().title());
            hauseheavenAdminPages.yukariOkIkonu.click();
// Kullanıcı  create sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.saveExitButton.click();
// Kullanıcı  create  sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak ile  title texbox ı altında "The name field is required." uyarısını görür
            Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
        }

         @Test
         public void test003() {

// Kullanıcı edit sayfasında  zorunlu alanlardan Title alanını  tklar
             hauseheavenAdminPages.titleAlani.isDisplayed();
             hauseheavenAdminPages.titleAlani.click();
//   Kullanıcı edit sayfasında  zorunlu alanlardan Title alanına veri  yazar
             hauseheavenAdminPages.titleAlani.sendKeys(faker.job().title());
// Kullanıcı edit sayfasında  zorunlu alanlardan content  alanını görür ve boş bırakır
             hauseheavenAdminPages.contentAlani.click();
            ReusableMethods.bekle(3);
             hauseheavenAdminPages.contentAlani.sendKeys(Keys.CONTROL +"a");
             hauseheavenAdminPages.contentAlani.sendKeys(Keys.BACK_SPACE);
             actions.sendKeys(Keys.PAGE_DOWN).perform();
// Kullanıcı edit sayfasında  zorunlu alanlardan Property location alanını  tklar
             ReusableMethods.bekle(1);
             hauseheavenAdminPages.propertyLocationAlani.click();
// Kullanıcı edit sayfasında  zorunlu alanlardan Property location alanını  veri yazar
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(faker.job().title());
//Kullanıcı yukarı ok ıkonuna tıklayarak sayfanın üst bölümüne çıkar
             hauseheavenAdminPages.yukariOkIkonu.click();
// Kullanıcı  edit sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
             ReusableMethods.bekle(3);
             hauseheavenAdminPages.saveExitButton.click();
// Kullanıcı  edit  sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak ile  sayafnın sağ alt tarafında ekranda  "The content fıeld is required." uyarısını görür
             ReusableMethods.bekle(3);
            // Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
             WebElement toastMessage = Driver.getDriver().findElement(By.cssSelector("div.toast-message"));
             Assert.assertTrue(toastMessage.isDisplayed());
             Assert.assertEquals(toastMessage.getText(), "The content field is required.");
           //  Driver.quitDriver();
         }
         @Test
         public void test004(){

// Kullanıcı edit sayfasında  zorunlu alanlardan Title alanını  tklar
             ReusableMethods.bekle(4);
             hauseheavenAdminPages.titleAlani.click();
// Kullanıcı edit sayfasında  zorunlu alanlardan Title alanına veri  yazar
             hauseheavenAdminPages.titleAlani.sendKeys(faker.job().title());
// Kullanıcı edit sayfasında  zorunlu alanlardan Content alanını  tklar
             hauseheavenAdminPages.contentAlani.click();
// Kullanıcı edit sayfasında  zorunlu alanlardan  Content location alanını  veri yazar
             hauseheavenAdminPages.contentAlani.sendKeys(faker.job().title());
             actions.sendKeys(Keys.PAGE_DOWN).perform();
// Kullanıcı edit sayfasında  zorunlu alanlardan Property location  alanını  boş bırakır
             ReusableMethods.bekle(3);
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(Keys.CONTROL +"a");
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(Keys.BACK_SPACE);
 //Kullanıcı yukarı ok tuşuna tıklar
             hauseheavenAdminPages.yukariOkIkonu.click();
 // Kullanıcı  edit sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
             ReusableMethods.bekle(3);
             hauseheavenAdminPages.saveExitButton.click();
// Kullanıcı  edit  sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak   "The name field is required." uyarısını görür
           Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
           Driver.quitDriver();
        }}