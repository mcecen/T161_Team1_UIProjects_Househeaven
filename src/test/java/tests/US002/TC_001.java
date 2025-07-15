package tests.US002;

import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TC_001 {
    @Test
    public void userCanAccessHomePageAndTopMenus() {

        // 1. WebDriver başlat
        WebDriver driver = Driver.getDriver();

        // 2. URL'ye git
        driver.get(ConfigReader.getProperty("url"));

        // 3. URL'nin doğru açıldığını doğrula
        Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("url"), "URL eşleşmiyor!");

        // 4. Home menüsünün görünür olduğunu kontrol et
        WebElement logo = driver.findElement(By.className("logo"));
        Assert.assertTrue(logo.isDisplayed(), "Logo görünmüyor!");

        // 5. Tarayıcıyı kapat
        Driver.quitDriver();


    }

    }

