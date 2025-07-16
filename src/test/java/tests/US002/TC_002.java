package tests.US002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_002 {

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

        WebElement logoResmi = driver.findElement(By.className("logo"));
        logoResmi.click();


        // 6. Tarayıcıyı kapat
        Driver.quitDriver();

    }
}