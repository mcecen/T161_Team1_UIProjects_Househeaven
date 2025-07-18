package tests.US019;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC001 {
   @Test
    public void TC001(){
        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

              // TC001- Kayıtlı kullanıcı olarak, anasayfanın
             // gövde bölümünde arama yapılabıldığını test et

        //Kullanıcı hauseheaven "https://qa.hauseheaven.com" URL adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

       //Giriş yapın

       hauseheavenAnasayfa.signInButonu.click();
       ReusableMethods.bekle(2);

       //Kullanıcı adını giriniz
       hauseheavenAnasayfa.usernameKutusu.sendKeys(ConfigReader.getProperty("user-serpil"));
       ReusableMethods.bekle(1);

       //şifrenizi girin
       hauseheavenAnasayfa.passwordKutusu.sendKeys(ConfigReader.getProperty("user-serpil-password"));
       ReusableMethods.bekle(1);

       //Login butonunu tıkla
       hauseheavenAnasayfa.loginButonu.click();
       ReusableMethods.bekle(1);
        //Anasayfada "Search for a location" texbox'ında "NewYork" için arama yapılabıldığını test et


       hauseheavenAnasayfa.SearchLocationButon.click();

       hauseheavenAnasayfa.SearchLocationButon.sendKeys("Ankara");
       ReusableMethods.bekle(1);

       JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       js.executeScript("window.scrollBy(0, 200);");
       ReusableMethods.bekle(1);


       hauseheavenAnasayfa.SearchResaultBox.click();

       ReusableMethods.bekle(1);

      JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
      js.executeScript("window.scrollBy(0, 200);");
      ReusableMethods.bekle(1);


      Assert.assertFalse(hauseheavenAnasayfa.Newark.isDisplayed(), "BUG: Ankara dışında farklı bir şehir görünüyor.");
      ReusableMethods.bekle(1);

      Driver.quitDriver();






    }

}


