package tests.US034;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

public class TC001 extends TestBaseRapor_Yusuf {

//        Admin dashboard’a giriş yapmak
//        Kullanıcı tarayıcı sayfasını açar.
//        Kullanıcı tarayıcı arama çubuğuna tıklar.
//        Kullanıcı arama çubuğuna https://qa.hauseheaven.com/admin/login adresini yazar.
//        Kullanıcı arama çubuğuna yazılan URL için arama yapar.(Enter kullanılabilir)
//        Kullanıcı HOUSE HEAVEN admin login anasayfasını görür.
//        Kullanıcı email/username text alanını görür.
//        Kullanıcı email/username text alanını tıklar.
//        Kullanıcı email/username text alanına "yusufcelal_admin" verisini girer.
//        Kullanıcı Password text alanını görür.
//        Kullanıcı Password text alanını tıklar.
//        Kullanıcı Password text alanına 021924 verisini girer.
//        Kullanıcı Sign In butonunu görür.
//        Kullanıcı Sign In butonunu tıklar.
//        Sign in butonuna tıklama ile https://qa.hauseheaven.com/admin sayfasına erişebildiği görülür.
//        Kullanıcı Admin dashboard anasayfasının açıldığı görür.


    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest(
                "US034 - Admin Dashboard Login Testi",
                "Admin kullanıcının dashboard giriş ve ana panel doğrulaması"
        );

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

            // 1. Admin Login sayfasına git
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(2);
            extentTest.info("Admin login sayfasına gidildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));

            // 2. URL Kontrolü
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulandı: " + actualUrl);

            // 3. Email input
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email input alanına kullanıcı adı girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("EmailInput"));

            // 4. Password input
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Password input alanına şifre girildi.");

            // 5. Sign In
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(3);
            extentTest.pass("Sign In butonuna tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AfterLogin"));

            // 6. Dashboard doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard açıldı.");

            // 7. Dashboard elemanları kontrolü
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed());
            extentTest.pass("Dashboard üzerindeki tüm bölümler doğrulandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("DashboardElements"));

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata oluştu: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC001"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            throw e;
        } finally {
            Driver.quitDriver();
            extentTest.info("Tarayıcı kapatıldı.");
        }
    }
}