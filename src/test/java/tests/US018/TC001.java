package tests.US018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC001 {

    HauseheavenAnasayfa hauseheavenAnasayfa=new HauseheavenAnasayfa();

    @Test

    public void TC001(){
        //1- Kayıtllı kullanıcı olarak anasayfaya girmek ve
        // anasayfanın gövde bölümüne erişmek istiyorum

        //Kullanıcı tarayıcı sayfasını acar

        //Kullacı tarayıcı arama cubuğuna tıklar

        //Kullanıcı arama cubuğuna hausehaeven "https://qa.hauseheaven.com"
        // URL'yi girer ve anasayfaya erişir

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //  "sıgn ın " butonunun görünürlüğünü kontrol et ve tıkla
        ReusableMethods.bekle(2);
       Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isDisplayed());
      Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isEnabled());


        Driver.closeDriver();

    }

}
