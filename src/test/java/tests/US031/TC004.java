package tests.US031;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC004 {

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

        WebDriver driver = Driver.getDriver();
                // Go to the URL
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
        ReusableMethods.bekle(1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Check the URL
        String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
        String actualUrl = driver.getCurrentUrl();

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


        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");


        // 8. Verify the Blog link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.blogLink.click();
        ReusableMethods.bekle(1);

        // 9. Verify the Categories link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.postsLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.postsLink.click();
        ReusableMethods.bekle(1);

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


        // 10.  Kayıtlı kullanıcı Categories anasayfasının tıklandığında üst menü Collapse all, +Creative alt menü Latest news, House architecture, House design, Building metarials görünmektedir.
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.categoriesLink.click();
        ReusableMethods.bekle(2);

        hauseHeaven_yusufcelal.addNewCtgrsCreateButton.click();
        ReusableMethods.bekle(2);

        hauseHeaven_yusufcelal.nameInputCtgrs.sendKeys(ConfigReader.getProperty("nameInputCtgrsTexts"));

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

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.saveAndExitButtonCtgrs);
        ReusableMethods.bekle(1);
        hauseHeaven_yusufcelal.saveAndExitButtonCtgrs.click();
        ReusableMethods.bekle(2);

        Actions PageUp = new Actions(driver);
        PageUp.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        Driver.closeDriver();

    }
}
