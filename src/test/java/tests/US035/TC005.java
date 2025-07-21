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
import utilities.TestBaseRapor_Cennet;

public class TC005 extends TestBaseRapor_Cennet {


        CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Faker faker = new Faker();
         Actions actions = new Actions(Driver.getDriver());


        @Test
        public void test001(){
            extentTest=extentReports.createTest("Yeni ilan oluşturmada zorunlu alan testi",
                    "Kullanıcı zorunlu alanlardan birini boş bıraktığında uyarı mesajı almalı ");
            //    Kullanıcı tarayıcı arama çubuğuna hauseheaven "URL:https://qa.hauseheaven.com/admin/login" URL adresini yazar
            //    Kullanıcı Arama butonuna tıklar
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            extentTest.info("Kullanıcı adminUrl e gider");
            String expectedUrlIcerik = "hauseheaven";
            String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));
            extentTest.pass("Kullanıcı adminUrl e ulaştığını test eder");
             //    Kullanıcı email/username text alanını görür
            Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());
            extentTest.pass("Kullanıcı email/username text alanını görünür olduğunu rtest eder");
            //    Kullanıcı email/username text alanını tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.emailKutusu.click();
            extentTest.info(" Kullanıcı email/username text alanını tıklar");
            //    Kullanıcı email/username text alanına geçerli email/username girer
            hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-cennet"));
            extentTest.info(" Kullanıcı email/username text alanına geçerli email/username girer");
            //    Kullanıcı password text alanını tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.passwordKutusu.click();
            extentTest.info("Kullanıcı password text alanını tıklar");
            //    Kullanıcı password text alanına geçerli password girer
            hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-cennet-password"));
            extentTest.info("Kullanıcı password text alanına geçerli password girer");
            //    Kullanıcı sign in butonunu tıklar
            hauseheavenAdminPages.signInButton.click();
            extentTest.info(" Kullanıcı sign in butonunu tıklar");
            //    Kullanıcı Deshboard sayfasına eriştiğinde sağ en üstte (Cennet Atak) kullanıcı adında profil logosunu görür
            ReusableMethods.bekle(2);
            WebElement profilLogosu =hauseheavenAdminPages.profilLogosu;
            Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
            extentTest.pass("KUllanıcı deshboard sayfasına eriştiğinde (Cennet Atak) kullanıcı adında profil logosunun görünür olduğunu test eder");
            //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
            Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
            extentTest.pass("Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görünür olduğunu test eder");
            //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
            hauseheavenAdminPages.realEstateBasligi.click();
            extentTest.info("Kullanıcı Real Estate başlığını tıklar");
            //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını tıklar
            Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
            extentTest.pass("Kullanıcı properties başlığının görünür olduğunu test eder");
            hauseheavenAdminPages.propertiesBasligi.click();
            extentTest.info("Kullanıcı Properties başlığını tıklar");
            //    Kullanıcı properties başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/properties" sayfasına erişebildiğini görür
            String expectedPropertiesSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties";
            String actualPropertiesSayfaUrl= Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);
            extentTest.pass("Kullanıcı https://qa.hauseheaven.com/admin/real-estate/properties sayfasına eriştiğini test eder");


        }
        @Test
        public void test002() {

        // Kullanıcı sağ üst tarafta "Create" butonunu tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.createButton.click();
            extentTest.info("Kullanıcı sağ üst tarafta \"Create\" butonunu tıklar");
        // Kullanıcı sağ üst tarafta "Create" butonunu tıklaması ile"https://qa.hauseheaven.com/admin/real-estate/properties/create" url adresine ulaşır
            String expectedSayfaUrl = "https://qa.hauseheaven.com/admin/real-estate/properties/create";
            String actualSayfaUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(expectedSayfaUrl.equals(actualSayfaUrl));
            extentTest.pass("Kullanıcı https://qa.hauseheaven.com/admin/real-estate/properties/create url ine ulaştığını test eder");
        // Kullanıcı Create sayfasında zorunlu alanlardan olan "Title" textbox ını görür
           Assert.assertTrue(hauseheavenAdminPages.titleAlani.isDisplayed());
           extentTest.pass("Kullanıcı Create sayfasında zorunlu alanlardan olan \"Title\" textbox ını görünür olduğunu test eder");
        // Kullanıcı create sayfasında  zorunlu alanlardan title alanını boş bırakır
        //  Kullanıcı create sayfasında  zorunlu alanlardan Content alanını  tklar
            hauseheavenAdminPages.contentAlani.click();
            extentTest.info("Kullanıcı zorunlu alanlardan Content alanını  tklar");
        // Kullanıcı create sayfasında  zorunlu alanlardan Content alanına veri  yazar
            hauseheavenAdminPages.contentAlani.sendKeys(faker.job().title());
            extentTest.info("Kullanıcı Content alanına veri  yazar");
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            extentTest.info("Kullanıcı sayfayı aşağı kaydırır");
        // Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  tklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.propertyLocationAlani.click();
            extentTest.info("Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  tklar");
        // Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  veri yazar
            hauseheavenAdminPages.propertyLocationAlani.sendKeys(faker.job().title());
            extentTest.pass("Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  veri yazar");
         //Kullanıcı yukarı ok ıkonuna tıklayarak sayfanın en üst kısmına çıkar
            hauseheavenAdminPages.yukariOkIkonu.click();
            extentTest.info("Kullanıcı yukarı ok ıkonuna tıklayarak sayfanın en üst kısmına çıkar   ");
        // Kullanıcı  create sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.saveExitButton.click();
            extentTest.info("Kullanıcı Save&Exit   texbox ını tıklar");
        // Kullanıcı  create  sayfasındaki  sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak ile  title texbox ı altında "The name field is required." uyarısını görür
            Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
            extentTest.pass("Kullanıcı  title texbox ı altında \"The name field is required.\" uyarısının görünür olduğunu test eder");
        }

         @Test
         public void test003() {

        // Kullanıcı create sayfasında  zorunlu alanlardan Title alanını  tklar
             hauseheavenAdminPages.titleAlani.click();
             extentTest.info("Kullanıcı edit sayfasında  zorunlu alanlardan Title alanını  tklar");
        //   Kullanıcı create sayfasında  zorunlu alanlardan Title alanına veri  yazar
             hauseheavenAdminPages.titleAlani.sendKeys(faker.job().title());
             extentTest.info(" Kullanıcı edit sayfasında  zorunlu alanlardan Title alanına veri  yazar");
        // Kullanıcı create sayfasında  zorunlu alanlardan content  alanını tıklar ve boş bırakır
             hauseheavenAdminPages.contentAlani.click();
             extentTest.info("Kullanıcı create sayfasında  zorunlu alanlardan content  alanını tıklar");
            ReusableMethods.bekle(3);
             hauseheavenAdminPages.contentAlani.sendKeys(Keys.CONTROL +"a");
             hauseheavenAdminPages.contentAlani.sendKeys(Keys.BACK_SPACE);
             extentTest.info("Kullanıcı content alanını temizler");
             actions.sendKeys(Keys.PAGE_DOWN).perform();
             extentTest.info("Kullanıcı sayfayı aşağı kaydırır");
        // Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  tklar
             ReusableMethods.bekle(1);
             hauseheavenAdminPages.propertyLocationAlani.click();
             extentTest.info("Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  tklar");
        // Kullanıcı create sayfasında  zorunlu alanlardan Property location alanını  veri yazar
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(faker.job().title());
             extentTest.info("Kullanıcı roperty location alanını  veri yazar");
        //Kullanıcı yukarı ok ıkonuna tıklayarak sayfanın üst bölümüne çıkar
             hauseheavenAdminPages.yukariOkIkonu.click();
             extentTest.info("Kullanıcı yukarı ok ıkonuna tıklayarak sayfanın üst bölümüne çıkar");
        // Kullanıcı  create sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
             ReusableMethods.bekle(3);
             hauseheavenAdminPages.saveExitButton.click();
             extentTest.info("Kullanıcı Save&Exit   texbox ını tıklar");
        // Kullanıcı  create sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak ile  sayafnın sağ alt tarafında ekranda  "The content fıeld is required." uyarısını görür
             ReusableMethods.bekle(3);
            // Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
             WebElement toastMessage = Driver.getDriver().findElement(By.cssSelector("div.toast-message"));
             Assert.assertTrue(toastMessage.isDisplayed());
             Assert.assertEquals(toastMessage.getText(), "The content field is required.");
            extentTest.pass("Kullanıcı The content fıeld is required. uyarısını gördüğünü test eder");
         }
         @Test
         public void test004(){

        // Kullanıcı create sayfasında  zorunlu alanlardan Title alanını  tklar
             ReusableMethods.bekle(4);
             hauseheavenAdminPages.titleAlani.click();
             extentTest.info("Kullanıcı create sayfasında  zorunlu alanlardan Title alanını  tklar");
        // Kullanıcı create sayfasında  zorunlu alanlardan Title alanına veri  yazar
             hauseheavenAdminPages.titleAlani.sendKeys(faker.job().title());
             extentTest.info(" Kullanıcı create sayfasında  zorunlu alanlardan Title alanına veri  yazar");
        // Kullanıcı create sayfasında  zorunlu alanlardan Content alanını  tklar
             hauseheavenAdminPages.contentAlani.click();
             extentTest.info("Kullanıcı create sayfasında  zorunlu alanlardan Content alanını  tklar");
        // Kullanıcı create sayfasında  zorunlu alanlardan  Content  alanına  veri yazar
             hauseheavenAdminPages.contentAlani.sendKeys(faker.job().title());
             extentTest.info("Kullanıcı  Content  alanına  veri yazar");
             actions.sendKeys(Keys.PAGE_DOWN).perform();
             extentTest.info("Kullanıcı sayfayı aşağı kaydıır");
        // Kullanıcı create sayfasında  zorunlu alanlardan Property location  alanını  boş bırakır
             ReusableMethods.bekle(3);
         // Kullanıcı property location alanını temizler
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(Keys.CONTROL +"a");
             hauseheavenAdminPages.propertyLocationAlani.sendKeys(Keys.BACK_SPACE);
             extentTest.info("Kullanıcı property location alanını temizler");
        //Kullanıcı yukarı ok tuşuna tıklar
             hauseheavenAdminPages.yukariOkIkonu.click();
             extentTest.info("Kullanıcı yukarı ok tuşuna tıklar");
        // Kullanıcı  create sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklar
             ReusableMethods.bekle(3);
             hauseheavenAdminPages.saveExitButton.click();
             extentTest.info("Kullanıcı  Save&Exit   texbox ını tıklar");
         // Kullanıcı  create  sayfasındaki edit sayfasında sağ tarafta  "Publish" yazısı altında Save&Exit   texbox ını tıklamak   "The name field is required." uyarısını görür
             ReusableMethods.bekle(5);
           Assert.assertTrue(hauseheavenAdminPages.theNameFieldIsRequiredUYariMesaji.isDisplayed());
             ReusableMethods.bekle(5);
           extentTest.pass("Kullanıcı The name field is required.uyarı mesajını gördüğünü test eder");
           Driver.quitDriver();
           extentTest.info("Kullanıcı sayfayı kapatır");
        }}