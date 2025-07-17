package tests.DEMO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.*;

import static utilities.Driver.driver;

public class HappyPath extends TestBaseRapor {

    @Test
    public void pozitifLogintesti() throws InterruptedException {

        DemoPage demoPage = new DemoPage();

        extentTest = extentReports.createTest("Happypath Publishing Ad Test",
                "Kullanıcı alanları doldurarak ilan yayınlayabilmeli");

        // 1- https://qa.hauseheaven.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanıcı Hauseheaven anasayfaya gider");
        ReusableMethods.bekle(1);

        //Add property butonuna tıkla
        demoPage.addPropertyButton.click();
        extentTest.info("Kullanıcı ilan eklemek için Add property butonuna tıklar");
        ReusableMethods.bekle(1);
        extentTest.info("Kullanıcının ilan ekleyebilmesi için önce Login olması gerekir");
        ReusableMethods.bekle(1);

        //Linke tıkladıktan sonra https://qa.hauseheaven.com/public/login sayfasının açıldığını görüntüle
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");
        extentTest.pass("Kullanıcı bağlantıya tıkladığında Login sayfasının açıldığını test eder.");
        ReusableMethods.bekle(1);


        // Username ve Password alanlarını doldur
     demoPage.usernameField.sendKeys("fulyanermin");
     demoPage.passwordField.sendKeys("Heaven.0620");
        extentTest.info("Kullanıcı username ve password alanlarını doldurur");
        ReusableMethods.bekle(3);

        //Login butonuna tıkla
        demoPage.loginButton.click();
        extentTest.info("Kullanıcı Login butonuna tıklar");

        ReusableMethods.bekle(2);

        //Title textbox'ına tıkla ve'geniş bahçeli dubleks villa' yaz.
        demoPage.titleTextbox.sendKeys("geniş bahçeli dubleks villa");
        extentTest.info("Kullanıcı Title alanına tıklar ve 'geniş bahçeli dubleks villa' yazar");
        ReusableMethods.bekle(3);
        PageNavigation.scrollDownWithJS(200);

        extentTest.info("Kullanıcı description textbox'ına ''Eşyasız' yazar ");
        Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
        eda_hauseheavenPage.descriptionTextbox.sendKeys("Eşyasız");
        ReusableMethods.bekle(1);

        //'Content' alanına tıkla ve 'iç-dış cephe boyaları yapıldı' yaz.
        demoPage.contentTextbox.sendKeys("iç-dış cephe boyaları yapıldı");
        extentTest.info("Kullanıcı 'Content' alanına tıklar ve 'iç-dış cephe boyaları yapıldı' yazar");
        ReusableMethods.bekle(3);
        PageNavigation.scrollDownWithJS(300);


        extentTest.info("Kullanıcı şehir olarak 'Eryaman' seçer");
        eda_hauseheavenPage.cityDropdown.click();
        ReusableMethods.bekle(1);

        PageNavigation.scrollDownWithJS(300);

        extentTest.info("Kullanıcı Property location bölümüne 'Ankara' yazar.");
        eda_hauseheavenPage.propertyLocationTextbox.sendKeys("Ankara");
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı Price textbox'ına '1.000.000' yazar .");
        eda_hauseheavenPage.priceTextbox.sendKeys("1.000.000");
        ReusableMethods.bekle(1);

        PageNavigation.scrollDownWithJS(200);

        extentTest.info("Kullanıcı Type dropdown'ından 'For Sale' seçeneğini seçer.");
        Select select = new Select(eda_hauseheavenPage.typeDropdown);
        select.selectByValue("1");
        ReusableMethods.bekle(1);

        PageNavigation.scrollDownWithJS(200);

        extentTest.info("Kullanıcı 'Wifi', 'Garden', 'Parking' seçer");
        eda_hauseheavenPage.wifiCheckbox.click();
        ReusableMethods.bekle(1);
        eda_hauseheavenPage.parkingCheckbox.click();
        ReusableMethods.bekle(1);
        eda_hauseheavenPage.gardenCheckbox.click();
        ReusableMethods.bekle(1);

        PageNavigation.scrollToTopWithJS();

        extentTest.info("Kullanıcı Category dropdown'ından 'Villa' seçeneğini seçer");
        eda_hauseheavenPage.categoryDropdown.click();
        ReusableMethods.bekle(1);


        //Save/Exit butonuna tıkla.
        //once sayfayı yukarı kaydırmamız lazım
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", demoPage.saveAndExitButton);
        Thread.sleep(1000);

        demoPage.saveAndExitButton.click();
        extentTest.info("Kullanıcı 'Save' butonuna tıklar");
        ReusableMethods.bekle(4);


        extentTest.info("Liste başlığında'geniş bahçeli dubleks villa' yazısını görüntüler");
        //Liste başlığında'geniş bahçeli dubleks villa' yazısını görüntüler.
        Assert.assertTrue(eda_hauseheavenPage.listingTitle.isDisplayed());
        ReusableMethods.bekle(1);


        extentTest.info("Kullanıcı Dashboard'a tıklar");
        eda_hauseheavenPage.dashboardLink.click();
        ReusableMethods.bekle(1);

        extentTest.info("'0 Approved properties' yazısını görür.");
        Assert.assertTrue(eda_hauseheavenPage.approvedProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.approvedProperties.getText(), "0\nApproved properties");
        ReusableMethods.bekle(1);

        extentTest.info("'1 Pending approve properties' yazısını görür.");
        Assert.assertTrue(eda_hauseheavenPage.pendingApproveProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.pendingApproveProperties.getText(), "1\nPending approve properties");
        ReusableMethods.bekle(1);


        // Admin url'ine https://qa.hauseheaven.com/admin/login git
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        extentTest.info("Kullanıcı Admin url'ine gider");
        ReusableMethods.bekle(1);

        extentTest.info("  Kullanıcı email/username text alanını tıklar ve text alanına geçerli email/username girer");
        CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        hauseheavenAdminPages.emailKutusu.click();
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-fulya"));
        ReusableMethods.bekle(1);

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.passwordKutusu.click();
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-fulya-password"));
        extentTest.info("Kullanıcı admin olarak username ve password'u girer");
        ReusableMethods.bekle(3);


        // Sign In butonuna tıkla
        extentTest.info("Kullanıcı sign in butonunu görür ve tıklar");
        hauseheavenAdminPages.signInButton.click();
        ReusableMethods.bekle(1);

        HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
        //Dashboard sayfasını görüntüle
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı Dashboard sayfasında Active properties,Pending properties,Expired properties ve Agents kategorilerini görür");
        // 7. Verify visibility of main dashboard elements and Active properties
        Assert.assertTrue(hauseHeaven_yusufcelal.activeProperties.isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(hauseHeaven_yusufcelal.pendingProperties.isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(hauseHeaven_yusufcelal.expiredProperties.isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(hauseHeaven_yusufcelal.agents.isDisplayed(), "Expired properties section is visible.");

        //Real Estate başlığına tıkla
        extentTest.info("Kullanıcı dashboard sayfası sol menüde Real Estate başlığını görür ve tıklar");
        Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
        hauseheavenAdminPages.realEstateBasligi.click();
        ReusableMethods.bekle(5);

        // Real Estate başlığını tıkladıktan sonra alt menude açılan Properties başlığına tıkla
        Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
        hauseheavenAdminPages.propertiesBasligi.click();
        extentTest.info("Kullanıcı Real Estate başlığını tıkladıktan sonra alt menude açılan Properties başlığını görür ve tıklar");
        ReusableMethods.bekle(2);


        extentTest.info("Kullanıcı admin sayfasında 'Pending' yazısını görüntüler");
        Assert.assertTrue(demoPage.pendingTextAdmin.isDisplayed());
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı admin sayfasında edit butonuna basar");
        demoPage.editTextAdmin.click();
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı \"Moderation status\" dropdown'ına tıklar.");
        demoPage.moderationStatusBox.click();
        ReusableMethods.bekle(1);


        //User selects "Approved" from the dropdown.
        Select select1 = new Select(demoPage.moderationStatusSelect);
        select1.selectByValue("approved");
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı Save and Exit butonuna basar");
        demoPage.adminSaveandExit.click();
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı Realestate menüsü altındaki properties sayfasına yönlendirilir");


        extentTest.info("Kullanıcı bu sayfada 'Approved' yazısını görüntüler");
        demoPage.approvedText.isDisplayed();

       extentTest.info("Kullanıcı tekrar Hauseheaven anasayfasına gider");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı tekrar profile tıklar");
        demoPage.dashboardProfile.click();
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);

        extentTest.info("'0 Approved properties' yazısını görür.");
        Assert.assertTrue(eda_hauseheavenPage.approvedProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.approvedProperties.getText(), "1\nApproved properties");
        ReusableMethods.bekle(1);

        extentTest.info("'1 Pending approve properties' yazısını görür.");
        Assert.assertTrue(eda_hauseheavenPage.pendingApproveProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.pendingApproveProperties.getText(), "0\nPending approve properties");
        ReusableMethods.bekle(1);

        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

       extentTest.info("Kullanıcı Listing butonuna tıklar");
        hauseheavenAnasayfa.ListingButonu.click();
        ReusableMethods.bekle(3);

        extentTest.info("Kullanıcı açılan sayfada Search For Location textbox'ına tıklar");
        demoPage.searchForaLocation.click();
        ReusableMethods.bekle(1);


        extentTest.info("Kullanıcı Search for a Location textbox'ına 'Ankara' yazar");
        demoPage.searchForaLocation.sendKeys("Ankara");
        ReusableMethods.bekle(1);


        extentTest.info("Kullanıcı 'Find new home' butonuna basar");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", demoPage.findNewHome);
        Thread.sleep(1000);

        demoPage.findNewHome.click();
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı 'geniş bahçeli villa yazısını görüntüler");
        demoPage.genisBahceliVillaText.isDisplayed();
        ReusableMethods.bekle(1);

        extentTest.info("Kullanıcı 'geniş bahçeli villa ilanının ayrıntısı için View butonuna tıklar");
        demoPage.viewButton.click();
        ReusableMethods.bekle(1);

        Driver.quitDriver();
























    }
}



