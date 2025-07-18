package tests.US028;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

import java.io.IOException;

public class TC001 extends TestBaseRapor_Yusuf {

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() throws IOException {
        extentTest = extentReports.createTest("TC001 - Admin Dashboard URL Testi",
                "Admin paneline giriş yapıldığında doğru URL açılıyor mu?");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Sayfaya git
            extentTest.info("Admin dashboard URL'ine gidiliyor.");
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(4);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AdminPage")); // Sayfa screenshot

            // 2. URL kontrolü
            extentTest.info("Beklenen URL ile mevcut URL karşılaştırılıyor.");
            String expectedUrl = hauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();

            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulaması başarılı: " + actualUrl);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("URLCheck")); // URL sonrası screenshot

        } catch (AssertionError e) {
            extentTest.fail("URL doğrulaması başarısız!");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Fail-URL")); // Hatalı durum screenshot
            throw e;
        } finally {
            // 3. Tarayıcı kapatma
            extentTest.info("Tarayıcı kapatılıyor.");
            Driver.quitDriver();
        }
    }
}
