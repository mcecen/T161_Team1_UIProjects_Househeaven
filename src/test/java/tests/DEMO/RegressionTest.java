package tests.DEMO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.*;

import static utilities.Driver.driver;


    public class RegressionTest extends TestBaseRapor {

        @Test
        public void regresyonIlanYayinlamaTesti() throws InterruptedException {

            DemoPage demoPage = new DemoPage();

            extentTest = extentReports.createTest("Ilan yayınlama testi",
                    "Kullanıcı alanları doldurarak ilan yayınlayabilmeli");

            // 1- https://qa.hauseheaven.com/ anasayfasina gidin
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            extentTest.info("Kullanıcı Hauseheaven anasayfaya gider");
            ReusableMethods.bekle(3);

            //Add property butonuna tıkla
            demoPage.addPropertyButton.click();
            extentTest.info("Kullanıcı ilan eklemek için Add property butonuna tıklar");
            ReusableMethods.bekle(3);
            extentTest.info("Kullanıcının ilan ekleyebilmesi için önce Login olması gerekir");
            ReusableMethods.bekle(3);

            //Linke tıkladıktan sonra https://qa.hauseheaven.com/public/login sayfasının açıldığını görüntüle
            Assert.assertEquals(Driver.getDriver().getTitle(), "Login");
            extentTest.pass("Kullanıcı bağlantıya tıkladığında Login sayfasının açıldığını test eder.");
            ReusableMethods.bekle(1);


            // Username ve Password alanlarını doldur
            demoPage.usernameField.sendKeys("fulyanermin");
            demoPage.passwordField.sendKeys("Heaven.0620");
            extentTest.info("Kullanıcı username ve password alanlarını doldurur");
            ReusableMethods.bekle(4);

            //Login butonuna tıkla
            demoPage.loginButton.click();
            extentTest.info("Kullanıcı Login butonuna tıklar");

            ReusableMethods.bekle(2);

            //Title textbox'ına tıkla ve'geniş bahçeli dubleks ev' yaz.
            demoPage.titleTextbox.sendKeys("geniş bahçeli dubleks ev");
            extentTest.info("Kullanıcı Title alanına tıklar ve 'geniş bahçeli dubleks villa' yazar");
            ReusableMethods.bekle(5);
            PageNavigation.scrollDownWithJS(200);

            extentTest.info("Kullanıcı description textbox'ına ''Eşyasız' yazar ");
            Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
            eda_hauseheavenPage.descriptionTextbox.sendKeys("Eşyasız");
            ReusableMethods.bekle(3);

            //'Content' alanına tıkla ve 'iç-dış cephe boyaları yapıldı' yaz.
            demoPage.contentTextbox.sendKeys("iç-dış cephe boyaları yapıldı");
            extentTest.info("Kullanıcı 'Content' alanına tıklar ve 'iç-dış cephe boyaları yapıldı' yazar");
            ReusableMethods.bekle(4);
            PageNavigation.scrollDownWithJS(300);


            extentTest.info("Kullanıcı şehir olarak 'Eryaman' seçer");
            eda_hauseheavenPage.cityDropdown.click();

            ReusableMethods.bekle(1);

            Actions actions = new Actions(Driver.getDriver());

            actions.click(eda_hauseheavenPage.citySearchTextbox)
                    .sendKeys("Eryaman")
                    .build()
                    .perform();
            ReusableMethods.bekle(1);
            actions.sendKeys(Keys.ENTER).perform();
            ReusableMethods.bekle(2);

            PageNavigation.scrollDownWithJS(300);

            extentTest.info("Kullanıcı Property location bölümüne 'Ankara' yazar.");
            eda_hauseheavenPage.propertyLocationTextbox.sendKeys("Ankara");
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı latitude ve longitude değerlerini girer.");
            eda_hauseheavenPage.latitude.sendKeys("8.6360");
            eda_hauseheavenPage.longitude.sendKeys("98.2460");
            PageNavigation.scrollDownWithJS(200);

            extentTest.info("Kullanıcı oda sayısını girer");
            demoPage.bedroomNumber.sendKeys("5");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı banyo sayısını girer");
            demoPage.bathroomNumber.sendKeys("3");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı kat sayısını girer");
            demoPage.floor.sendKeys("3");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı metre kareyi girer");
            demoPage.square.sendKeys("300");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı Price textbox'ına '1.000.000' yazar .");
            eda_hauseheavenPage.priceTextbox.sendKeys("1.000.000");
            ReusableMethods.bekle(4);

            PageNavigation.scrollDownWithJS(200);

            extentTest.info("Kullanıcı Type dropdown'ından 'For Sale' seçeneğini seçer.");
            Select select = new Select(eda_hauseheavenPage.typeDropdown);
            select.selectByValue("1");

            PageNavigation.scrollDownWithJS(300);


            //Save/Exit butonuna tıkla.
            //once sayfayı yukarı kaydırmamız lazım
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", demoPage.saveAndExitButton);
            Thread.sleep(1000);

            extentTest.info("Kullanıcı önce Save butonuna tıklar");
            demoPage.saveButton.click();
            ReusableMethods.bekle(3);

            demoPage.saveAndExitButton.click();
            extentTest.info("Kullanıcı 'Save and exit' butonuna tıklar");
            ReusableMethods.bekle(4);


            extentTest.info("Liste başlığında'geniş bahçeli dubleks ev' yazısını görüntüler");
            //Liste başlığında'geniş bahçeli dubleks villa' yazısını görüntüler.

            ReusableMethods.bekle(4);

            extentTest.info("Moderation status'u pending olarak görüntüler");
            ReusableMethods.bekle(3);


            extentTest.info("Dashboard'a tıklar");
            eda_hauseheavenPage.dashboardLink.click();
            ReusableMethods.bekle(3);

            extentTest.info("Approved properties'i 0, pending approve propertiesi 1 olarak görüntüler");
            ReusableMethods.bekle(6);


            // Admin url'ine https://qa.hauseheaven.com/admin/login git
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            extentTest.info("Kullanıcı Admin url'ine gider");
            ReusableMethods.bekle(2);

            extentTest.info("  Kullanıcı email/username text alanını tıklar ve text alanına geçerli email/username girer");
            CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
            hauseheavenAdminPages.emailKutusu.click();
            hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-fulya"));
            ReusableMethods.bekle(2);

            ReusableMethods.bekle(1);
            hauseheavenAdminPages.passwordKutusu.click();
            hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-fulya-password"));
            extentTest.info("Kullanıcı admin olarak username ve password'u girer");
            ReusableMethods.bekle(2);


            // Sign In butonuna tıkla
            extentTest.info("Kullanıcı sign in butonunu görür ve tıklar");
            hauseheavenAdminPages.signInButton.click();
            ReusableMethods.bekle(2);

            HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

            ReusableMethods.bekle(2);

            extentTest.info("Kullanıcı Dashboard sayfasında Active properties,Pending properties,Expired properties ve Agents kategorilerini görür");
            // 7. Verify visibility of main dashboard elements and Active properties
            Assert.assertTrue(hauseHeaven_yusufcelal.activeProperties.isDisplayed(), "Active properties section is visible.");
            Assert.assertTrue(hauseHeaven_yusufcelal.pendingProperties.isDisplayed(), "Pending properties section is visible.");
            Assert.assertTrue(hauseHeaven_yusufcelal.expiredProperties.isDisplayed(), "Expired properties section is visible.");
            Assert.assertTrue(hauseHeaven_yusufcelal.agents.isDisplayed(), "Expired properties section is visible.");
            ReusableMethods.bekle(5);

            //Real Estate başlığına tıkla
            extentTest.info("Kullanıcı dashboard sayfası sol menüde Real Estate başlığını görür ve tıklar");
            Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
            hauseheavenAdminPages.realEstateBasligi.click();
            ReusableMethods.bekle(3);

            // Real Estate başlığını tıkladıktan sonra alt menude açılan Properties başlığına tıkla
            Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
            hauseheavenAdminPages.propertiesBasligi.click();
            extentTest.info("Kullanıcı Real Estate başlığını tıkladıktan sonra alt menude açılan Properties başlığını görür ve tıklar");
            ReusableMethods.bekle(4);


            extentTest.info("Kullanıcı admin sayfasında 'Pending' yazısını görüntüler");

            ReusableMethods.bekle(4);

            extentTest.info("Kullanıcı admin sayfasında edit butonuna basar");
            demoPage.editTextAdmin.click();
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı Moderation status dropdown'ına tıklar.");
            demoPage.dDApproved.click();
            ReusableMethods.bekle(3);


            //User selects "Approved" from the dropdown.
            Select select1 = new Select(demoPage.moderationStatusSelect);
            select1.selectByValue("approved");
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı önce 'Save' butonuna basar");
            demoPage.saveButton.click();
            ReusableMethods.bekle(4);

            extentTest.info("Kullanıcı Save and Exit butonuna basar");
            demoPage.adminSaveandExit.click();
            ReusableMethods.bekle(4);

            extentTest.info("Kullanıcı Realestate menüsü altındaki properties sayfasına yönlendirilir");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı bu sayfada 'Approved' yazısını görüntüler");

            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı tekrar Hauseheaven anasayfasına gider");
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            ReusableMethods.bekle(4);

            extentTest.info("Kullanıcı ad-soyad'a tıklayarak dashboard'a gelir");
            demoPage.dashboardProfile.click();
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı approved properties'i 1 , pending'i 0 olarak görüntüler");

            ReusableMethods.bekle(5);

            Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

            extentTest.info("Kullanıcı Listing butonuna tıklar");
            hauseheavenAnasayfa.ListingButonu.click();
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı açılan sayfada Search For Location textbox'ına tıklar");
            demoPage.searchForaLocation.click();
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı Search for a Location textbox'ına 'Ankara' yazar");
            demoPage.searchForaLocation.sendKeys("Ankara");
            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı 'Find new home' butonuna basar");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", demoPage.findNewHome);
            Thread.sleep(1000);

            demoPage.findNewHome.click();
            ReusableMethods.bekle(3);

            extentTest.info("Kullanıcı 'geniş bahçeli ev yazısını görüntüler");
            PageNavigation.scrollDownWithJS(200);

            ReusableMethods.bekle(3);


            extentTest.info("Kullanıcı 'geniş bahçeli villa ilanının ayrıntısı için View butonuna tıklar");
            demoPage.viewButton.click();
            ReusableMethods.bekle(4);

            Driver.quitDriver();


        }
    }










