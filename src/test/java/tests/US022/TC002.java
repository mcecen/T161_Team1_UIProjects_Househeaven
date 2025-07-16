package tests.US022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHaven_Mahmut;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

@Test
public class TC002 {
    public void saveListingToWishlist() {
        HauseHaven_Mahmut mahmutPage = new HauseHaven_Mahmut();
        WebDriver driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Siteye git
        driver.get("https://qa.hauseheaven.com/");

        // 2. Sign In tıkla ve login işlemi
        mahmutPage.signInButton.click();
        mahmutPage.emailInput.sendKeys("mahmutas100@gmail.com");
        mahmutPage.passwordInput.sendKeys("326588.Ma");
        mahmutPage.loginButton.click();
        ReusableMethods.bekle(2);

        // 3. Cookie bildirimi varsa kapat
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(@class,'cookie-consent__agree')]")));
            if (cookieButton.isDisplayed()) {
                cookieButton.click();
                ReusableMethods.bekle(1);
            }
        } catch (Exception e) {
            System.out.println("Çerez bildirimi görünmedi.");
        }

        // 4. Sayfanın en altına scroll
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.bekle(1);

        // 5. İlk ilana scroll ve JavaScript ile tıkla
        js.executeScript("arguments[0].scrollIntoView(true);", mahmutPage.firstListing);
        ReusableMethods.bekle(1);
        js.executeScript("arguments[0].click();", mahmutPage.firstListing);
        ReusableMethods.bekle(2);

        // 6. Yeni sekmeye geç (varsa)
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // 7. Save butonuna scroll ve JS click
        js.executeScript("arguments[0].scrollIntoView(true);", mahmutPage.saveButton);
        ReusableMethods.bekle(1);
        js.executeScript("arguments[0].click();", mahmutPage.saveButton);

        // 8. Toast mesajını kontrol et
        wait.until(ExpectedConditions.visibilityOf(mahmutPage.getToastMessage()));
        String actualMessage = mahmutPage.getToastMessage().getText();
        Assert.assertTrue(actualMessage.contains("Added to wishlist successfully!"),
                "Toast mesajı bulunamadı: " + actualMessage);

        // 9. Tarayıcıyı kapat
        Driver.quitDriver();
    }
}
