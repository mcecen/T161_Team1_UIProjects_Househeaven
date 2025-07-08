package tests.US018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TC001 {
    @Test
    public void TC001(){

        // 1. Kullanıcı arama cubuğuna hausehaeven "https://qa.hauseheaven.com" URL'yi girer ve anasayfaya erişir
        Driver.quitDriver().get(ConfigReader.getProperty("adminURL"));
        HauseheavenAnasayfa anasayfa=new HauseheavenAnasayfa();

        //2.  "sıgn ın " butonunun görünürlüğünü kontrol et ve tıkla
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(anasayfa.  )).click();

        //3.  "Find accessible homes to rent" başlığının görüntülendiğini kontrol et
        wait.until(ExpectedConditions.visibilityOf(anasayfa.findHomesTitle));

        //4.  "Min Price" kutusunu bul ve tıkla
        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.minPrice)).click();

        //5. " Max Price" kutusunu bul ve tıkla
        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.maxPrice)).click();

       //6. " Property Type" kutusunu bul ve tıkla

        //7. " Bed Rooms " kutusunu bul ve tıkla

        //8. " Property Location" kutusunu bul ve tıkla

        //9. "Search Result" kutusunu bul ve , tıklanabılır olduğunu kontrol et ve tıkla
        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.searchButton)).click();

        //10. Tarayıcıyı Kapat

        Driver.closeDriver();

    }

}
