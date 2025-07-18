package tests.US028;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.*;

public class TC002 extends TestBaseRapor_Yusuf {


//    The user opens the browser page.
//    The user clicks on the browser search bar.
//    The user types into the search bar.
//    The user searches for the URL typed into the search bar. (Enter can be used)
//    The user sees the HOUSE HEAVEN admin login homepage.
//    The user sees the email/username text field.
//    The user clicks on the email/username text field.
//    The user enters into the email/username text field.
//    The user sees the Password text field.
//    The user clicks on the Password text field.
//    The user enters into the Password text field.
//    The user sees the Sign In button.
//    The user clicks on the Sign In button.
//    It is seen that the page can be accessed by clicking on the Sign In button.
//    The user sees that the Admin dashboard homepage has opened.
//    Admin user sees address displayed
//    Admin dashboard homepage opened
//    Active properties of User Admin dashboard homepage visible
//    Pending properties of User Admin dashboard homepage visible
//    Expired properties of User Admin dashboard homepage visible
//    Agents of User Admin dashboard homepage visible

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest(
                "Admin Giriş ve Dashboard Doğrulama",
                "Admin kullanıcının sisteme giriş yapması ve dashboard bölümlerinin görünürlüğünü doğrular."
        );

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Admin giriş sayfasına git
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(2);
            extentTest.info("Admin giriş sayfasına gidildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AdminLoginPage"));

            // 2. URL doğrulama
            String expectedUrl = hauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulandı: " + actualUrl);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("URLCheck"));

            // 3. Email alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(),
                    "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email input alanına bilgi girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("EmailInput"));

            // 4. Şifre alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(),
                    "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Password input alanına bilgi girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("PasswordInput"));

            // 5. Giriş butonu
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(),
                    "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            extentTest.pass("Sign In butonuna tıklandı.");
            ReusableMethods.bekle(3);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("SignInClick"));

            // 6. Dashboard doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(),
                    "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard sayfası açıldı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("DashboardOpened"));

            // 7. Dashboard içeriği doğrulama
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(),
                    "Active properties section is not visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(),
                    "Pending properties section is not visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(),
                    "Expired properties section is not visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(),
                    "Agents section is not visible.");
            extentTest.pass("Dashboard üzerindeki tüm bölümler başarıyla görüntülendi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("DashboardSections"));

        } catch (AssertionError | Exception e) {
            extentTest.fail("Test adımlarında hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("TestFailure"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            throw e;
        } finally {
            // 8. Driver kapat
            Driver.quitDriver();
            extentTest.info("Driver kapatıldı.");
        }
    }
}