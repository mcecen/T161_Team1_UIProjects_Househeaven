package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
    @Test
    HauseheavenAnasayfa hauseheavenAnasayfa = new HauseheavenAnasayfa();


    public void TC002() {


        //3-Kayıtlı kullanıcı olarak anasayfanın gövde bölümündeki
        //"açılır menü"'lerin işlevsel olduğunu test et

        //Kullanıcı tarayıcı sayfasını acar

        //Kullacı tarayıcı arama cubuğuna tıklar

        //Kullanıcı arama cubuğuna hausehaeven "https://qa.hauseheaven.com"
        // URL'yi girer ve anasayfaya erişir

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //  "sıgn ın " butonunun görünürlüğünü kontrol et ve tıkla
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isDisplayed());
        Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isEnabled());


        //  "Find accessible homes to rent" başlığının görüntülendiğini kontrol et

        // "Min Price" "acılır menusunun"" görünürlüğünü test et

        // " Max Price" "açılır menüsünün" görünürlüğünü test et

        // " Property Type" "açılır menüsünün" görünürlüğünü test et

        // " Bed Rooms " "açılır menüsünün" görünürlüğünü test et
        // " Property Location" "açılır menüsünün" görünürlüğünü test et

        // "Search Result" kutusununun görünülür olduğunutest et


        // Tarayıcıyı Kapat


    }
}