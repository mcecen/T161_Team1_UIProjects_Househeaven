package tests.US006;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC003 {
    @Test
    public void test01() {
        // 1. Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // 2. Cookie banner varsa kapat
        try {
            WebElement cookieAcceptButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(@class,'js-cookie-consent-agree')]")));
            cookieAcceptButton.click();
            ReusableMethods.bekle(1);
            System.out.println("Cookie banner kapatıldı.");
        } catch (Exception e) {
            System.out.println("Cookie banner görünmedi, devam ediliyor.");
        }

        // 3. Listing sayfasına geç
        Driver.getDriver().findElement(By.linkText("Listing")).click();
        ReusableMethods.bekle(2); // sayfa yüklenmesi için bekle

        // 4. Sayfayı aşağı kaydır
        js.executeScript("window.scrollBy(0,500);");
        ReusableMethods.bekle(1);

        // 5. Category dropdown'ını JS ile aç
        WebElement categoryDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@id='select2-ptypes-container']/ancestor::span[@role='combobox']")));
        js.executeScript("arguments[0].scrollIntoView(true);", categoryDropdown);
        js.executeScript("arguments[0].click();", categoryDropdown);
        ReusableMethods.bekle(1);

        // 6. Apartment seçeneğine JS ile tıkla
        WebElement apartmentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@id,'select2-ptypes-result') and normalize-space()='Apartment']")));
        js.executeScript("arguments[0].scrollIntoView(true);", apartmentOption);
        js.executeScript("arguments[0].click();", apartmentOption);
        ReusableMethods.bekle(1);

        // 7. Seçilen değeri kontrol et
        WebElement selectedValue = Driver.getDriver().findElement(By.id("select2-ptypes-container"));
        String actualSelectedText = selectedValue.getText().trim();
        System.out.println("Seçilen kategori: " + actualSelectedText);
        Assert.assertEquals(actualSelectedText, "Apartment");

        // 8. Sayfayı kapat
        Driver.closeDriver();
    }
}