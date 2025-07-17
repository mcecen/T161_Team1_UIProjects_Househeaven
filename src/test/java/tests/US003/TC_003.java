package tests.US003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_003 {

    @Test
    public void userCanAccessHomePageAndTopMenus() {

        // 1. WebDriver başlat
        WebDriver driver = Driver.getDriver();

        // 2. URL'ye git
        driver.get(ConfigReader.getProperty("url"));

        // 3. Arama alanını bul (örnek olarak class, id veya placeholder’a göre)
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for a location']"));

        // 4. SearchBox Tıkla
        searchBox.click();

        // 5. SearchBox'a "Texas" yaz
        searchBox.sendKeys("Texas");

        // 6. Tarayiciyi kapat
        Driver.quitDriver();



    }
}
