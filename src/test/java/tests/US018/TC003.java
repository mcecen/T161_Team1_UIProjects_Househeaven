package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpıl_HauseheavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
    @Test
    public void signInButonTests() {


        Serpıl_HauseheavenAnasayfa hauseheavenAnasayfa = new Serpıl_HauseheavenAnasayfa();


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


        //  "Find accessible homes to rent" başlığının işlevselliğini kontrol et
        Assert.assertFalse(hauseheavenAnasayfa.hauseheavenAnasyfaTitleText.isEnabled());

        // "Min Price" "acılır menusunun"" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.minPriceText.isEnabled());

        // " Max Price" "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.minPriceText.isEnabled());

        // " Property Type" "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyLocation.isEnabled());

        // " Bed Rooms " "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.bedRoomsTextbox.isEnabled());

        // " Property Location" "yazılır menüsünün " işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyLocation.isEnabled());

        // "Search Result" kutusununun tıklanabilir  olduğunutest et
        Assert.assertTrue(hauseheavenAnasayfa.serarchResaultButon.isDisplayed());

        // Tarayıcıyı Kapat
        Driver.quitDriver();

    }
}