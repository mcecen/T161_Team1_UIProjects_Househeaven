package tests.US004;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC001 {

    @Test
    public void selectWithJS_StableVersion() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // ========== Min Price ==========
        WebElement minDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-minprice-container")));
        js.executeScript("arguments[0].scrollIntoView(true);", minDropdown);
        js.executeScript("arguments[0].click();", minDropdown);
        Thread.sleep(1000);
        js.executeScript("""
                    const interval = setInterval(() => {
                        let li = document.querySelector("li[id*='select2-minprice'][id$='-5000']");
                        if (li) {
                            li.click();
                            clearInterval(interval);
                        }
                    }, 300);
                """);
        Thread.sleep(2000); // click sonrası bekleme

        // ========== Max Price ==========
        WebElement maxDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-maxprice-container")));
        js.executeScript("arguments[0].scrollIntoView(true);", maxDropdown);
        js.executeScript("arguments[0].click();", maxDropdown);
        Thread.sleep(1000);
        js.executeScript("""
                    const interval2 = setInterval(() => {
                        let li = document.querySelector("li[id*='select2-maxprice'][id$='-10000']");
                        if (li) {
                            li.click();
                            clearInterval(interval2);
                        }
                    }, 300);
                """);
        Thread.sleep(2000);

        // ========== Property Type: Villa ==========
        WebElement propertyDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-ptypes-container")));
        js.executeScript("arguments[0].scrollIntoView(true);", propertyDropdown);
        js.executeScript("arguments[0].click();", propertyDropdown);
        Thread.sleep(1000);
        js.executeScript("""
                    const interval3 = setInterval(() => {
                        let lis = document.querySelectorAll("li[id*='select2-ptypes']");
                        for (let li of lis) {
                            if (li.textContent.trim() === 'Villa') {
                                li.click();
                                clearInterval(interval3);
                                break;
                            }
                        }
                    }, 300);
                """);
        Thread.sleep(2000);

        // ========== Search ==========
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='submit' and contains(text(),'Search Result')]")));
        js.executeScript("arguments[0].scrollIntoView(true);", searchBtn);
        js.executeScript("arguments[0].click();", searchBtn);

        // ========== Result doğrulama ==========
        WebElement resultText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h4[contains(text(),'Found')]")));
        System.out.println("Görünen sonuç metni: " + resultText.getText());
        Assert.assertTrue(resultText.isDisplayed());

        Driver.quitDriver();
    }
}
