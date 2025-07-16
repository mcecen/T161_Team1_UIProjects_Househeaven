package tests.US003;

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

        // 4. Lokasyon menüsünün görünür olduğunu kontrol et
        WebElement lokasyon = driver.findElement(By.className("input-with-icon"));
        Assert.assertTrue(lokasyon.isDisplayed(), "lokasyon görünmüyor");

        // 5. Min Price menüsünün görünür olduğunu kontrol et
        WebElement minPriceElement = driver.findElement(By.xpath("//*[text()='Min Price']"));
        Assert.assertTrue(minPriceElement.isDisplayed(), "Min Price görünmüyor");

        // 6. Min Price menüsünün görünür olduğunu kontrol et
        WebElement maxPriceElement = driver.findElement(By.xpath("//*[text()='Max Price']"));
        Assert.assertTrue(maxPriceElement.isDisplayed(), "Max Price görünmüyor");

        // 6. Min Price menüsünün görünür olduğunu kontrol et
        WebElement propertyTypeElement = driver.findElement(By.xpath("//*[text()='Property Type']"));
        Assert.assertTrue(propertyTypeElement.isDisplayed(), " propertyTypeElement görünmüyor");



        // 7. Tarayıcıyı kapat
        Driver.quitDriver();


    }
}

