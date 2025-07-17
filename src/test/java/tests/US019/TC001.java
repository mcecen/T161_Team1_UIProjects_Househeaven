package tests.US019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TC001 {
   @Test
    public void TC001(){
        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

              // TC001- Kayıtlı kullanıcı olarak, anasayfanın
        // gövde bölümünde arama yapılabıldığını test et

        //Kullanıcı hauseheaven "https://qa.hauseheaven.com" URL adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Anasayfada "Search for a location" texbox'ında "NewYork" için arama yapılabıldığını test et






    }

}


