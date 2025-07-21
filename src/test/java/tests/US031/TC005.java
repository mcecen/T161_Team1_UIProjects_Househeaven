package tests.US031;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

public class TC005 extends TestBaseRapor_Yusuf {

//         Kullanıcı tarayıcı sayfasını açar.
//         Kullanıcı tarayıcı arama çubuğuna tıklar.
//         Kullanıcı arama çubuğuna https://qa.hauseheaven.com/admin/login yazar.
//         Kullanıcı arama çubuğuna yazdığı URL'yi arar. (Enter kullanılabilir)
//         Kullanıcı HOUSE HEAVEN admin giriş anasayfasını görür.
//         Kullanıcı e-posta/kullanıcı adı metin alanını görür.
//         Kullanıcı e-posta/kullanıcı adı metin alanına tıklar.
//         Kullanıcı e-posta/kullanıcı adı metin alanına veri girer.
//         Kullanıcı Şifre (Password) metin alanını görür.
//         Kullanıcı Şifre metin alanına tıklar.
//         Kullanıcı Şifre metin alanına veri girer.
//         Kullanıcı Giriş Yap (Sign In) butonunu görür.
//         Kullanıcı Giriş Yap butonuna tıklar.
//         Giriş Yap butonuna tıklanarak sayfaya erişildiği görülür.
//         Kullanıcı Admin dashboard anasayfasının açıldığını görür.
//         Admin kullanıcı https://qa.hauseheaven.com/admin/ adresinin görüntülendiğini görür.
//         Kayıtlı kullanıcı "Categories" anasayfasına tıkladığında, üst menünün görüntülendiği görülür.
//         Kayıtlı kullanıcı "Latest news" anasayfasına tıkladığında, üst menüde "Collapse all", +Creative alt menü "Latest news" olarak görüntülenir.
//         Kayıtlı kullanıcı "Building materials" anasayfasına tıkladığında, üst menüde "Collapse all", +Creative alt menü "Building materials" olarak görüntülenir.
//         Kayıtlı kullanıcı "Yusuf Celal" başlığına tıkladığında çöp kutusu (silme) ikonu görünür ve bu ikona tıklandığında "Silme işlemini gerçekten istiyor musunuz?" yazılı onay penceresi ("Cancel" ve "Delete" seçenekleriyle) görünür.
//         Kayıtlı kullanıcı "Yusuf Celal" başlığına tıkladığında çöp kutusu ikonu görünür, bu ikona tıklandığında onay silme penceresi açılır ve "Cancel Delete" tıklandığında "Bu kaydı gerçekten silmek istiyor musunuz?" sorusu başarıyla silindi mesajı ile birlikte görünür.
//         Kayıtlı kullanıcı silme işlemi sonrası, yeni işlem ekranı "+ create" işlemi tıklanmış gibi görünür.
//         Kayıtlı kullanıcı için işlemin başarılı olduğu görülür.
//         Kayıtlı kullanıcı için işlemin başarılı olduğu ve çalıştığı görülür.

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US031 - Kayıt Silme ve Kategori Doğrulama Testi",
                "Admin kullanıcının kategori silme ve görüntüleme fonksiyonları test edilir.");

        try {
            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

            // 1. Admin login sayfasına git
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(2);
            extentTest.info("Admin login sayfasına gidildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));

            // 2. URL doğrulama
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("URL doğrulandı: " + actualUrl);

            // 3. Email input
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.pass("Email alanına kullanıcı adı girildi.");

            // 4. Password input
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Şifre girildi.");

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

            // 7. Dashboard bölümleri doğrulama
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed());
            extentTest.pass("Dashboard bölümleri doğrulandı.");

            // 8. Blog link
            Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed(), "Blog link is not visible.");
            hauseHeaven_yusufcelal.blogLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Blog linkine tıklandı.");

            // 9. Categories link
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Categories link is not visible.");
            hauseHeaven_yusufcelal.categoriesLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Categories sayfasına geçildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("CategoriesPage"));

            // 10. Collapse all kontrol
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
            hauseHeaven_yusufcelal.categoriesLink.click();
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.addNewCategoryButton.click(); //  Collapse all click.
            ReusableMethods.bekle(2);
            extentTest.pass("Collapse All butonu tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("CategoriesPage"));


            // 11. Expand All doğrulama
            Assert.assertTrue(hauseHeaven_yusufcelal.expandAllButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
            String expectedText = hauseHeaven_yusufcelal.ExpandAll;
            String actualText = hauseHeaven_yusufcelal.expandAllTextWrite.getText().trim();
            Assert.assertEquals(actualText, expectedText, "Sayfadaki yazı eşleşmiyor!");
            extentTest.pass("'Expand All' butonu doğrulandı.");

            // 12. Latest news kontrol
            hauseHeaven_yusufcelal.latestNewscollapseAll.click();
            ReusableMethods.bekle(1);
            hauseHeaven_yusufcelal.latestNewscollapseAllIcon.click();
            ReusableMethods.bekle(1);
            extentTest.pass("'Latest news' menüsü kontrol edildi.");

            // 13. Building materials kontrol
            hauseHeaven_yusufcelal.BuildingMaterialscollapseAll.click();
            ReusableMethods.bekle(1);
            extentTest.pass("'Building materials' menüsü kontrol edildi.");

            // 14. Kayıt seçimi ve silme
            hauseHeaven_yusufcelal.latestNewsRecord.click();
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.DeleteDisplayed.isDisplayed(), "Delete icon is not visible.");
            extentTest.pass("Kayıt seçildi ve silme ikonu göründü.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("BeforeDelete"));

            // 15. Yeni Create ekranı
            hauseHeaven_yusufcelal.NewCreateLink.click();
            ReusableMethods.bekle(2);
            extentTest.pass("+ Create ekranına geçildi.");

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC005"));
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