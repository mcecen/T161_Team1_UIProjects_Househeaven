package tests.US031;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertEquals;

public class TC003 {

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
        hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
        // Go to the URL
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
        ReusableMethods.bekle(4);

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

        // 12. Page Down ile aşağı kaydır
        Actions Pagedown = new Actions(Driver.getDriver());
        Pagedown.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

        // 13. Save & Exit butonu görünür ve doğru metin içeriyor olmalı
        Assert.assertTrue(hauseHeaven_yusufcelal.saveAndExitButton.isDisplayed(), "'Save & Exit' butonu görünmüyor!");
        ReusableMethods.bekle(2);

        // 14. Save butonu görünür ve doğru metin içeriyor olmalı
        Assert.assertTrue(hauseHeaven_yusufcelal.SaveButton.isDisplayed(), "'Save' butonu görünmüyor!");
        ReusableMethods.bekle(2);

        // 15.   Kayıtlı kullanıcı olarak page up yaparak sağ üste kullanıcı bilgileri aktif olarak görünmektedir.
        Actions PageUp = new Actions(Driver.getDriver());
        PageUp.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();
        ReusableMethods.bekle(2);

        Driver.quitDriver();
    }
}

