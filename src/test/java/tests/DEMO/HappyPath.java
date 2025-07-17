package tests.DEMO;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class HappyPath extends TestBaseRapor {

    @Test
    public void pozitifLogintesti() {

        DemoPage demoPage = new DemoPage();

        extentTest = extentReports.createTest("Happypath Publishing Ad Test",
                "Kullanıcı sadece zorunlu alanları doldurarak ilan yayınlayabilmeli");

        // 1- https://qa.hauseheaven.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanıcı Hauseheaven anasayfaya gider");
        ReusableMethods.bekle(2);


        //2- Add property butonuna tıkla
        demoPage.addPropertyButton.click();
        extentTest.info("Kullanıcı ilan eklemek için Add property butonuna tıklar");
        ReusableMethods.bekle(2);
        extentTest.info("Kullanıcının ilan ekleyebilmesi için önce Login olması gerekir");
        ReusableMethods.bekle(2);

        //3-Linke tıkladıktan sonra https://qa.hauseheaven.com/public/login sayfasının açıldığını görüntüle
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");
        extentTest.pass("Kullanıcı bağlantıya tıkladığında https://qa.hauseheaven.com/public/login sayfasının açıldığını test eder.");
        ReusableMethods.bekle(3);

        //4-Login formunu görüntüle
        Assert.assertTrue(demoPage.loginForm.isDisplayed());
        extentTest.pass("Kullanıcı login formunun görünürlüğünü test eder.");
        ReusableMethods.bekle(2);



        // 4- Username ve Password alanlarını doldur
        demoPage.usernameField.sendKeys(ConfigReader.getProperty("fulyanermin"));
        demoPage.passwordField.sendKeys(ConfigReader.getProperty("Heaven.0620"));
        extentTest.info("Kullanıcı username ve password alanlarını doldurur");
        ReusableMethods.bekle(3);

        //5- Login butonuna tıkla
        demoPage.loginButton.click();
        extentTest.info("Kullanıcı Login butonuna tıklar");

        ReusableMethods.bekle(2);






    }
}



