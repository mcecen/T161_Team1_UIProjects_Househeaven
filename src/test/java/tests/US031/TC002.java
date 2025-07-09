package tests.US031;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
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

public class TC002 {


//      Admin olark Blog altındaki Categories sayfasına
//      erişerek mevcut kategorilerin görünür olmasını istiyorum.
//      Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görür
//      Kayıtlı kullanıcı dashboard anasayfasının açıldığı görür.
//      Kayıtlı kullanıcı dashboard anasayfasının Sol menü Blog menüsü görünür.


    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        WebDriver driver = Driver.getDriver();

        // 1. Navigate to the URL
        driver.get("https://qa.hauseheaven.com/admin/login");
        ReusableMethods.bekle(2);

        // 2. Verify the URL
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(actualUrl, expectedUrl, "URL verification failed!");

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
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification failed!");

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");


        // 8. Verify the Blog link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.blogLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.blogLink.click();
        ReusableMethods.bekle(2);

//        // . Verify the Post link in the left menu
//        Assert.assertTrue(hauseHeaven_yusufcelal.postsLink.isDisplayed(), "Blog link is not visible.");
//        hauseHeaven_yusufcelal.postsLink.click();
//        ReusableMethods.bekle(2);

        // 9. Verify the Categories link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.categoriesLink.click();
        ReusableMethods.bekle(2);

//        // . Verify the Tags link in the left menu
//        Assert.assertTrue(hauseHeaven_yusufcelal.tagsLink.isDisplayed(), "Blog link is not visible.");
//        hauseHeaven_yusufcelal.tagsLink.click();
//        ReusableMethods.bekle(2);

        // 10.  Kayıtlı kullanıcı Categories anasayfasının tıklandığında üst menü Collapse all, +Creative alt menü Latest news, House architecture, House design, Building metarials görünmektedir.
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.categoriesLink.click();
        ReusableMethods.bekle(2);
        hauseHeaven_yusufcelal.addNewCategoryButton.click(); //  Collapse all click.
        ReusableMethods.bekle(2);

        // 11. When the registered user clicks the Categories homepage, the "Expand all" button appears at the top menu.

        Assert.assertTrue(hauseHeaven_yusufcelal.expandAllButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
        String expectedText = hauseHeaven_yusufcelal.ExpandAll;
        String actualText = hauseHeaven_yusufcelal.expandAllTextWrite.getText().trim();
        assertEquals(actualText, expectedText, "Sayfadaki yazı eşleşmiyor!");
        ReusableMethods.bekle(2);


        //  12. Kayıtlı kullanıcı "You are editing "English" version üst yazsısı altındaki kayıt sayfası görünmektedir.
        Actions Pagedown = new Actions(driver);
        Pagedown.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();        // Page Down
        ReusableMethods.bekle(2);


       //  13.  Kayıtlı kullanıcı page down yapılarak Save & Exit yazıları görünmektedir.
        Assert.assertTrue(hauseHeaven_yusufcelal.saveAndExitButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
        String expectedSaveAndExit = hauseHeaven_yusufcelal.SaveAndExitWrite;
        String actualSaveAndExit = hauseHeaven_yusufcelal.SaveAndExit.getText().trim();
        assertEquals(actualSaveAndExit, expectedSaveAndExit, "Sayfadaki yazı eşleşmiyor!");
        ReusableMethods.bekle(2);

        //  14.  Kayıtlı kullanıcı page down yapılarak Save yazıları görünmektedir.
        Assert.assertTrue(hauseHeaven_yusufcelal.SaveButton.isDisplayed(), "'Expand all' butonu görünmüyor!");
        String expectedSave = hauseHeaven_yusufcelal.SaveWrite;
        String actualSave = hauseHeaven_yusufcelal.Save.getText().trim();
        assertEquals(actualSave, expectedSave, "Sayfadaki yazı eşleşmiyor!");
        ReusableMethods.bekle(2);



//      Kayıtlı kullanıcı page down yapılarak Save & Exit yazıları görünmektedir.


    }
}


