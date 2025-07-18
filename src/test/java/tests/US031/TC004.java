package tests.US031;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

import java.time.Duration;

public class TC004 extends TestBaseRapor_Yusuf {

//        Admin olarak yeni kategoriler ekleye bilme fonksiyonun çalışır olmasını istiyorum.
//        Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görünüyor
//        Kayıtlı kullanıcı dashboard anasayfasının açıldığı görünür.
//        Kayıtlı kullanıcı dashboard anasayfasının Sol menü Blog menüsü görünür.
//        Kayıtlı kullanıcı dashboard Blog tıklandığında üst menü Collapse all, +Creative alt menü Latest news, House architecture, House design, Building metarials görünmektedir.
//        Kayıtlı kullanıcı olarak + Create menüsüne tıklayınca metin giriş bölümleri açılan sayfada “You are editing "English" version”  Name, Parent, Description, Is default? , Icon, Order, Is featured?, Status, Search Engine Optimize, Publish, Save & Exit, Save çıkmalı.
//        Kayıtlı kullanıcı olarak mecburi alanlar doldurulmassa Name "The name field is required.", Parent "The selected parent id is invalid.", yazıyı vermeli.
//        Kayıtlı kullanıcı olarak kırmızı yıldız mecburi doldurulmalı bunlar Name, Parent, Status menüleri kesinlikle doludurulmalı ve Save tıklanarak kayıt işlemi başarılı olduğu görünmektedir.
//        Kayıtlı kullanıcı olarak kırmızı yıldız mecburi doldurulmalı bunlar Name, Parent, Status menüleri kesinlikle doludurulmalı ve Save & Exit tıklanarak yeni menüye otamatik geçmiş olduğu görünmekte.
//        Kayıtlı kullanıcı olarak Name, Parent'de Lates news olarak seçilince kayıt menüler altında kayıt olduğu görünmekte.
//        Kayıtlı kullanıcı olarak Name, Parent'de House architecture olarak seçilince kayıt menüler altında kayıt olduğu görünmekte.
//        Kayıtlı kullanıcı olarak Name, Parent'de House designs olarak seçilince kayıt menüler altında kayıt olduğu görünmekte.
//        Kayıtlı kullanıcı olarak Name, Parent'de Building metarials olarak seçilince kayıt menüler altında kayıt olduğu görünmekte.
//        Kayıtlı kullanıcı işlem sonunda successfully update successfully yazısı çıkmatadır.

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US031 - Yeni Kategori Ekleme Testi",
                "Admin kullanıcı yeni kategori ekleyebilmeli ve doğrulamalar yapılmalı.");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Admin login sayfasına git
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(2);
            extentTest.info("Admin login sayfasına gidildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

            // 2. URL doğrulama
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulandı: " + actualUrl);

            // 3. Email alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("EmailInput"));

            // 4. Password alanı
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Şifre girildi.");

            // 5. Sign In butonu
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(3);
            extentTest.pass("Sign In butonuna tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("AfterLogin"));

            // 6. Dashboard doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard açıldı.");

            // 7. Dashboard elementleri doğrulama
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed());
            extentTest.pass("Dashboard bölümleri doğrulandı.");

            // 8. Blog link
            Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed());
            hauseHeaven_yusufcelal.blogLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Blog linkine tıklandı.");

            // 9. Posts link
            Assert.assertTrue(hauseHeaven_yusufcelal.postsLink.isDisplayed());
            hauseHeaven_yusufcelal.postsLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Posts sayfasına geçildi.");

            // 10. Yeni Post oluşturma
            hauseHeaven_yusufcelal.addNewCreateButton.click();
            hauseHeaven_yusufcelal.nameInput.sendKeys(ConfigReader.getProperty("nameInputText"));
            hauseHeaven_yusufcelal.descriptionInput.sendKeys(ConfigReader.getProperty("descriptionInputText"));
            hauseHeaven_yusufcelal.Content.sendKeys(ConfigReader.getProperty("ContentInputText"));
            hauseHeaven_yusufcelal.statusDropdown.sendKeys(ConfigReader.getProperty("statusDropdownText"));
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.LatestNewsCheckbox.click();
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.TagsWrite.sendKeys(ConfigReader.getProperty("tagsText"));
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.saveCreateButton.click();
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.saveAndExitCreateButton.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Yeni post oluşturuldu.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("NewPostCreated"));

            // 11. Categories sayfasına geçiş
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed());
            hauseHeaven_yusufcelal.categoriesLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Categories sayfasına geçildi.");

            // 12. Yeni kategori ekleme
            hauseHeaven_yusufcelal.addNewCtgrsCreateButton.click();
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.nameInputCtgrs.sendKeys(ConfigReader.getProperty("nameInputCtgrsTexts"));
            ReusableMethods.bekle(1);

            // Parent dropdown'a tıkla
            hauseHeaven_yusufcelal.dropdownInputCtgrs.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.searchBoxCtgrs));
            hauseHeaven_yusufcelal.searchBoxCtgrs.sendKeys(ConfigReader.getProperty("houseDesignText"));

            hauseHeaven_yusufcelal.searchBoxCtgrs.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(2);

            // Açıklama alanına veri yaz
            hauseHeaven_yusufcelal.descriptionInputCtgrs.sendKeys(ConfigReader.getProperty("descriptionInputCtgrsText"));
            ReusableMethods.bekle(2);

            // Status dropdown'a tıkla
            hauseHeaven_yusufcelal.statusdropdownInputCtgrs.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.statussearchBoxCtgrs));
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.statussearchBoxCtgrs.sendKeys(ConfigReader.getProperty("statusText"));
            hauseHeaven_yusufcelal.statussearchBoxCtgrs.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(2);

            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.saveAndExitButtonCtgrs);
            ReusableMethods.bekle(1);
            hauseHeaven_yusufcelal.saveAndExitButtonCtgrs.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Yeni kategori eklendi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("NewCategoryCreated"));

            // 13. Dashboard'a geri dönüş
            Actions PageUp = new Actions(Driver.getDriver());
            PageUp.sendKeys(Keys.PAGE_UP).perform();
            ReusableMethods.bekle(2);

            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard sayfasına geri dönüldü.");

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC004"));
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