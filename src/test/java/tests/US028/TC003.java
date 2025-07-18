package tests.US028;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

public class TC003 extends TestBaseRapor_Yusuf {

    // The admin user should see that the address https://qa.hauseheaven.com/admin/ is displayed.
    // The user should see that the Admin Dashboard homepage is opened and accessible,
    // and that the Blog link on the left menu is reachable by clicking.
    // The user should see that their username "Yusuf Celal" is displayed in the top right menu.

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("TC003 - Admin Dashboard Testi",
                "Admin kullanıcısının dashboard ve menü öğelerini görüntüleme testi");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Admin Dashboard URL'e git
            extentTest.info("Admin dashboard sayfasına gidiliyor.");
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(4);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AdminPage"));

            // 2. URL Kontrolü
            extentTest.info("URL doğrulaması yapılıyor.");
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulaması başarılı: " + actualUrl);

            // 3. Email Input
            extentTest.info("Email input alanı kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email input alanına kullanıcı adı girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("EmailInput"));

            // 4. Password Input
            extentTest.info("Password input alanı kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Password input alanına şifre girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("PasswordInput"));

            // 5. Sign In
            extentTest.info("Sign In butonu kontrol ediliyor ve tıklanıyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(3);
            extentTest.pass("Sign In butonuna tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AfterSignIn"));

            // 6. Dashboard Link
            extentTest.info("Dashboard link görünürlüğü kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard linki başarıyla görüntülendi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("DashboardPage"));

            // 7. Active Properties
            extentTest.info("Active properties sekmesi kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.activeProperties.isDisplayed(), "Active properties section is not visible.");
            hauseHeaven_yusufcelal.activeProperties.click();
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(2);
            extentTest.pass("Active properties sekmesi doğrulandı.");

            // 8. Pending Properties
            extentTest.info("Pending properties sekmesi kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.pendingProperties.isDisplayed(), "Pending properties section is not visible.");
            hauseHeaven_yusufcelal.pendingProperties.click();
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(2);
            extentTest.pass("Pending properties sekmesi doğrulandı.");

            // 9. Expired Properties
            extentTest.info("Expired properties sekmesi kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.expiredProperties.isDisplayed(), "Expired properties section is not visible.");
            hauseHeaven_yusufcelal.expiredProperties.click();
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(2);
            extentTest.pass("Expired properties sekmesi doğrulandı.");

            // 10. Agents
            extentTest.info("Agents sekmesi kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.agents.isDisplayed(), "Agents section is not visible.");
            hauseHeaven_yusufcelal.agents.click();
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(2);
            extentTest.pass("Agents sekmesi doğrulandı.");

            // 11. User Name
            extentTest.info("Kullanıcı adı kontrol ediliyor.");
            Assert.assertTrue(hauseHeaven_yusufcelal.userName.isDisplayed(), "User name field is not visible.");
            String expectedUserName = "Yusuf Celal";
            String actualUserName = hauseHeaven_yusufcelal.userName.getText();
            Assert.assertEquals(actualUserName, expectedUserName, "User name is not displayed correctly!");
            extentTest.pass("Kullanıcı adı doğrulandı: " + actualUserName);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("UserName"));

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC003"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            throw e;
        } finally {
            ReusableMethods.bekle(3);
            extentTest.info("Tarayıcı kapatılıyor.");
            Driver.quitDriver();
        }
    }
}