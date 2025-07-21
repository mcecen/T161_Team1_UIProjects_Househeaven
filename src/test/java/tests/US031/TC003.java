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

public class TC003 extends TestBaseRapor_Yusuf {

//        Admin olark Blog altındaki Categories sayfasına erişerek mevcut kategorilerin aktif olmasını istiyorum
//        Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görür
//        Kayıtlı kullanıcı dashboard anasayfasının açıldığı görür.
//        Kayıtlı kullanıcı dashboard anasayfasının Sol menü Blog menüsü görünür.
//        Kayıtlı kullanıcı dashboard anasayfasının tıklandığında üst menü Collapse all, +Creative alt menü Latest news, House architecture, House design, Building metarials görüğnmektedir.
//        Kayıtlı kullanıcı "You are editing "English" version üst yazsısı altındaki kayıt sayfası görünmektedir.
//        Kayıtlı kullanıcı page down yapılarak Save & Exit ve Save yazıları görünmektedir.
//        Kayıtlı kullanıcı olarak sayfalara arasında gezinince aktif olduğu görünmektedir.
//        Kayıtlı kullanıcı olarak page up yaparak sağ üste kullanıcı bilgileri aktif olarak görünmektedir.

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US031 - Blog > Categories Aktiflik Testi",
                "Admin kullanıcının Blog > Categories sayfasındaki kategorileri ve butonları doğrulaması");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Admin login sayfasına git
            extentTest.info("Admin login sayfasına gidiliyor.");
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(3);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));

            // 2. URL doğrulama
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulandı: " + actualUrl);

            // 3. Email alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email alanına kullanıcı adı girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("EmailInput"));

            // 4. Password alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Password alanına şifre girildi.");

            // 5. Sign In
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

            // 9. Categories link
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Categories link is not visible.");
            hauseHeaven_yusufcelal.categoriesLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Categories sayfasına geçiş yapıldı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("CategoriesPage"));

            // 10. Collapse all ve alt menü kontrol
            hauseHeaven_yusufcelal.addNewCategoryButton.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Collapse all butonuna tıklandı.");

            // 11. Expand All buton
            Assert.assertTrue(hauseHeaven_yusufcelal.expandAllButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
            String expectedText = hauseHeaven_yusufcelal.ExpandAll;
            String actualText = hauseHeaven_yusufcelal.expandAllTextWrite.getText().trim();
            Assert.assertEquals(actualText, expectedText, "Expand All metni hatalı!");
            extentTest.pass("'Expand All' butonu doğrulandı.");

            // 12. Page Down
            Actions pageDown = new Actions(Driver.getDriver());
            pageDown.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(2);

            // 13. Save & Exit
            Assert.assertTrue(hauseHeaven_yusufcelal.saveAndExitButton.isDisplayed(), "'Save & Exit' butonu görünmüyor!");
            extentTest.pass("'Save & Exit' butonu doğrulandı.");

            // 14. Save
            Assert.assertTrue(hauseHeaven_yusufcelal.SaveButton.isDisplayed(), "'Save' butonu görünmüyor!");
            extentTest.pass("'Save' butonu doğrulandı.");

            // 15. Page Up & kullanıcı bilgisi kontrol
            Actions pageUp = new Actions(Driver.getDriver());
            pageUp.sendKeys(Keys.PAGE_UP).perform();
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Page up sonrası kullanıcı paneli kontrol edildi.");

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC003"));
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