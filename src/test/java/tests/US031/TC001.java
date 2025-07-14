package tests.US031;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

//      Admin olarak sayfaya giriş yapılabilmesini istiyorum.
//      Kullanıcı tarayıcı sayfasını açar.
//      Kullanıcı tarayıcı arama çubuğuna tıklar.
//      Kullanıcı arama çubuğuna https://qa.hauseheaven.com/admin/login adresini yazar.
//      Kullanıcı arama çubuğuna yazılan URL için arama yapar.(Enter kullanılabilir)
//      Kullanıcı HOUSE HEAVEN admin login anasayfasını görür.
//      Kullanıcı email/username text alanını görür.
//      Kullanıcı email/username text alanını tıklar.
//      Kullanıcı email/username text alanına "yusufcelal_admin" verisini girer.
//      Kullanıcı Password text alanını görür.
//      Kullanıcı Password text alanını tıklar.
//      Kullanıcı Password text alanına 021924 verisini girer.
//      Kullanıcı Sign In butonunu görür.
//      Kullanıcı Sign In butonunu tıklar.
//      Sign in butonuna tıklama ile https://qa.hauseheaven.com/admin sayfasına erişebildiği görülür.
//      Kullanıcı Admin dashboard anasayfasının açıldığı görür.


    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {
        WebDriver driver = Driver.getDriver();

        // Go to the URL
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
        ReusableMethods.bekle(4);

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
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");

Driver.closeDriver();
    }
}
