package tests.US031;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

public class TC002 extends TestBaseRapor_Yusuf {


//      Admin olark Blog altındaki Categories sayfasına
//      erişerek mevcut kategorilerin görünür olmasını istiyorum.
//      Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görür
//      Kayıtlı kullanıcı dashboard anasayfasının açıldığı görür.
//      Kayıtlı kullanıcı dashboard anasayfasının Sol menü Blog menüsü görünür.


    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US031 - Blog > Categories Sayfası Testi",
                "Admin kullanıcının Blog > Categories sayfasındaki öğeleri doğrulaması");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Admin login sayfasına git
            extentTest.info("Admin login sayfasına gidiliyor.");
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(3);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));

            // 2. URL kontrolü
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

            // 5. Sign In butonu
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(3);
            extentTest.pass("Sign In butonuna tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AfterLogin"));

            // 6. Dashboard doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard sayfası açıldı.");

            // 7. Dashboard öğeleri doğrulama
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed());
            extentTest.pass("Dashboard üzerindeki tüm öğeler doğrulandı.");

            // 8. Blog link
            Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed(), "Blog link is not visible.");
            hauseHeaven_yusufcelal.blogLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Blog linkine tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("BlogLink"));

            // 9. Categories link
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Categories link is not visible.");
            hauseHeaven_yusufcelal.categoriesLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Categories sayfasına geçiş yapıldı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("CategoriesPage"));

            // 10. Collapse/Expand işlemleri
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Categories sayfası görünmüyor.");
            hauseHeaven_yusufcelal.addNewCategoryButton.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Collapse işlemi yapıldı.");

            // 11. Expand All doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.expandAllButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
            String expectedText = hauseHeaven_yusufcelal.ExpandAll;
            String actualText = hauseHeaven_yusufcelal.expandAllTextWrite.getText().trim();
            Assert.assertEquals(actualText, expectedText, "Expand All metni hatalı!");
            extentTest.pass("'Expand All' butonu doğrulandı.");

            // 12. Sayfada Page Down
            Actions Pagedown = new Actions(Driver.getDriver());
            Pagedown.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(2);

            // 13. Save & Exit butonu
            Assert.assertTrue(hauseHeaven_yusufcelal.saveAndExitButton.isDisplayed(), "'Save & Exit' butonu görünmüyor!");
            extentTest.pass("'Save & Exit' butonu görünür durumda.");

            // 14. Save butonu
            Assert.assertTrue(hauseHeaven_yusufcelal.SaveButton.isDisplayed(), "'Save' butonu görünmüyor!");
            extentTest.pass("'Save' butonu görünür durumda.");
            ReusableMethods.bekle(2);

            // 15. Dashboard'a geri dön
            Actions Pageup = new Actions(Driver.getDriver());
            Pageup.sendKeys(Keys.PAGE_UP).perform();
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard sayfasına geri dönüldü.");

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC002"));
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