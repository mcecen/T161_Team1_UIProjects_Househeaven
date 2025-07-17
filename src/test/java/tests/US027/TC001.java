package tests.US027;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHaven_Mahmut_AdminLoginPage;
import utilities.Driver;

import java.time.Duration;

@Test
public class TC001 {
    public class HauseHaven_Mahmut_AdminLoginTest {

        @Test
        public void adminLoginTest() {

            HauseHaven_Mahmut_AdminLoginPage adminPage = new HauseHaven_Mahmut_AdminLoginPage();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

            // Admin giriş sayfasına git
            Driver.getDriver().get("https://qa.hauseheaven.com/admin/login");

            // Email ve şifre kutuları görünür mü?
            Assert.assertTrue(adminPage.UsernameTextbox.isDisplayed());
            Assert.assertTrue(adminPage.PasswordTextbox.isDisplayed());

            // Bilgileri gir
            adminPage.UsernameTextbox.sendKeys("admin@hauseheaven.com");
            adminPage.PasswordTextbox.sendKeys("12345678");

            // Sign In butonuna tıkla
            adminPage.SignInButton.click();

            // Dashboard sayfası yüklendi mi kontrol et
            wait.until(ExpectedConditions.visibilityOf(adminPage.DashboardLogo));
            Assert.assertTrue(adminPage.DashboardLogo.isDisplayed());

            Driver.closeDriver();
        }
    }
}
