package tests.US031;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC005 {

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
        hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
        // Go to the URL
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
        ReusableMethods.bekle(2);

        // Check the URL
        String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");


        // 3. Locate and click the Email/Username input field
        Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));


        // 4. Locate and click the Password input field
        Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));

        // 5. Locate and click the Sign In button
        Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_yusufcelal.signInButton.click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");


        // 8. Verify the Blog link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.blogLink.click();
        ReusableMethods.bekle(2);

        // 9. Verify the Categories link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.categoriesLink.click();
        ReusableMethods.bekle(2);

        // 10.  Kayıtlı kullanıcı Categories anasayfasının tıklandığında üst menü Collapse all, +Creative alt menü Latest news, House architecture, House design, Building metarials görünmektedir.
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.categoriesLink.click();
        ReusableMethods.bekle(2);
        hauseHeaven_yusufcelal.addNewCategoryButton.click(); //  Collapse all click.
        ReusableMethods.bekle(2);

        // 11. Expand all butonu görünür olmalı
        Assert.assertTrue(hauseHeaven_yusufcelal.expandAllButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
        String expectedText = hauseHeaven_yusufcelal.ExpandAll;
        String actualText = hauseHeaven_yusufcelal.expandAllTextWrite.getText().trim();
        Assert.assertEquals(actualText, expectedText, "Sayfadaki yazı eşleşmiyor!");
        ReusableMethods.bekle(2);

        // 12. Kayıtlı kullanıcı "Latest news" anasayfasına tıkladığında, üst menüde "Collapse all", +Creative alt menü "Latest news" olarak görüntülenir.
        hauseHeaven_yusufcelal.latestNewscollapseAll.click();
        ReusableMethods.bekle(1);
        // 12. Kayıtlı kullanıcı "Latest news" anasayfasına tıkladığında, üst menüde "Collapse all", +Creative alt menü "Latest news" olarak görüntülenir.
        hauseHeaven_yusufcelal.latestNewscollapseAllIcon.click();
        ReusableMethods.bekle(1);

        // 13. Kayıtlı kullanıcı "Building materials" anasayfasına tıkladığında, üst menüde "Collapse all", +Creative alt menü "Building materials" olarak görüntülenir.
        hauseHeaven_yusufcelal.BuildingMaterialscollapseAll.click();
        ReusableMethods.bekle(1);

        // 14. Kayıtlı kullanıcı "Yusuf Celal" başlığına tıkladığında çöp kutusu (silme) ikonu görünür ve bu ikona tıklandığında "Silme işlemini gerçekten istiyor musunuz?" yazılı onay penceresi ("Cancel" ve "Delete" seçenekleriyle) görünür.
        hauseHeaven_yusufcelal.latestNewsRecord.click();
        ReusableMethods.bekle(2);

        //  15. Kayıtlı kullanıcı "Yusuf Celal" başlığına tıkladığında çöp kutusu ikonu görünür, bu ikona tıklandığında onay silme penceresi açılır ve "Cancel Delete" tıklandığında "Bu kaydı gerçekten silmek istiyor musunuz?" sorusu başarıyla silindi mesajı ile birlikte görünür.
        Assert.assertTrue(hauseHeaven_yusufcelal.DeleteDisplayed.isDisplayed(), "Delete icon is not visible.");
        ReusableMethods.bekle(2);

        //  16. Kayıtlı kullanıcı silme işlemi sonrası, yeni işlem ekranı "+ create" işlemi tıklanmış gibi görünür.
        hauseHeaven_yusufcelal.NewCreateLink.click();
        ReusableMethods.bekle(2);
//         Kayıtlı kullanıcı için işlemin başarılı olduğu görülür.

    Driver.quitDriver();
    }
}
