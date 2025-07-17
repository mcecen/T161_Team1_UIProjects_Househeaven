package tests.US026;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHaven_Mahmut;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.driver;

@Test
public class TC001 {
    HauseHaven_Mahmut page = new HauseHaven_Mahmut();

    @Test
    public void testContactFormWithScrollAndCookies() {

        // 1. Siteye git
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        // 2. Cookies bildirimi varsa kapat
        try {
            WebElement cookieClose = Driver.getDriver().findElement(By.cssSelector("button[class*='cookie']"));
            if (cookieClose.isDisplayed()) {
                cookieClose.click();
            }
        } catch (Exception e) {
            System.out.println("Cookie bildirimi bulunamadı.");
        }

        // 3. Sign In butonuna tıkla
        page.signInButton.click();

        // 4. Giriş bilgilerini gir
        page.emailInput.sendKeys("test@example.com");
        page.passwordInput.sendKeys("password123");

        // 5. Login butonuna tıkla
        page.loginButton.click();

        // 6. Contact butonuna tıklamadan önce görünürlüğü bekle
        ReusableMethods.waitForVisibility(page.contactButton, 5);
        page.contactButton.click();

        // 7. Form bölümüne scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", page.nameInput);

        // 8. Form alanlarının aktif olduğunu kontrol et
        Assert.assertTrue(page.nameInput.isEnabled());
        Assert.assertTrue(page.contactEmailInput.isEnabled());
        Assert.assertTrue(page.subjectInput.isEnabled());
        Assert.assertTrue(page.phoneInput.isEnabled());
        Assert.assertTrue(page.messageInput.isEnabled());

        // 9. Alanları doldur
        page.nameInput.sendKeys("Mahmut Tester");
        page.contactEmailInput.sendKeys("mahmut@example.com");
        page.subjectInput.sendKeys("Selenium Test");
        page.phoneInput.sendKeys("5554443322");
        page.messageInput.sendKeys("Bu bir otomasyon test mesajıdır.");

        // 10. Scroll ve Send Message tıkla
        js.executeScript("arguments[0].scrollIntoView(true);", page.sendMessageButton);
        page.sendMessageButton.click();

        // 11. Get In Touch görünür mü
        ReusableMethods.waitForVisibility(page.getInTouchSection, 5);
        Assert.assertTrue(page.getInTouchSection.isDisplayed());

        // 12. Sayfa kaydır ve Directions alanını kontrol et
        js.executeScript("arguments[0].scrollIntoView(true);", page.directionsSection);
        Assert.assertTrue(page.directionsSection.isDisplayed());

        // 13. Harita iframe'ine geç
        Driver.getDriver().switchTo().frame(page.mapFrame);
        WebElement mapBody = Driver.getDriver().findElement(By.tagName("body"));
        Assert.assertTrue(mapBody.isDisplayed());
        mapBody.click();

        // Ana sayfaya geri dön
        Driver.getDriver().switchTo().defaultContent();
    }

}
