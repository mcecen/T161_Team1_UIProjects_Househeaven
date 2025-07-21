package tests.DEMO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoPage;
import pages.Eda_HauseheavenPage;
import utilities.*;

import static utilities.Driver.driver;

public class NegatifTest extends TestBaseRapor {
    @Test
    public void negatifIlanYayinlamaTesti() throws InterruptedException {

        DemoPage demoPage = new DemoPage();

        extentTest = extentReports.createTest("Negatif Ilan Yayınlama Testi",
                "Kullanıcı Content alanını boş bırakarak ilan yayınlamalı");

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
        extentTest.info("Kullanıcı Title alanına tıklar ve 'geniş bahçeli dubleks ev' yazar");
        ReusableMethods.bekle(3);
        PageNavigation.scrollDownWithJS(200);

        extentTest.info("Kullanıcı description textbox'ına ''Eşyasız' yazar ");
        Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
        eda_hauseheavenPage.descriptionTextbox.sendKeys("Eşyasız");
        ReusableMethods.bekle(1);

        //'Content' alanını boş bırak
        demoPage.contentTextbox.sendKeys("");
        extentTest.info("Kullanıcı 'Content' alanını boş bırakır");
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

        demoPage.saveAndExitButton.click();
        extentTest.info("Kullanıcı 'Save and exit' butonuna tıklar");
        ReusableMethods.bekle(5);

        extentTest.info("Content field is required uyarısını görüntüler");
        ReusableMethods.bekle(4);

        extentTest.info("Sayfayı kapatır");
        Driver.quitDriver();

    }
}


