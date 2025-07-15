package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
    @Test
    public void signInButonTests() {

        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();;

        //3-Kayıtlı kullanıcı olarak anasayfanın gövde bölümündeki
        //"açılır menü"'lerin işlevsel olduğunu test et

        //Kullanıcı tarayıcı sayfasını acar
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //  "sıgn ın " butonunun işlevselliğini kontrol et ve tıkla

        Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isEnabled());

        ReusableMethods.bekle(2);

        //  "Find accessible homes to rent" başlığının işlevselliğini kontrol et
        Assert.assertTrue(hauseheavenAnasayfa.HomePageLogo.isEnabled());

        // "Min Price" "acılır menusunun"" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.minPriceTextbox.isEnabled());

        // " Max Price" "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.maxPriceText.isEnabled());

        // " Property Type" "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyLocation.isEnabled());

        // " Bed Rooms " "açılır menüsünün" işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.bedRoomsTextbox.isEnabled());

        // " Property Location" "yazılır menüsünün " işlevselliğini test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyLocation.isEnabled());

        // "Search Result" kutusununun tıklanabilir  olduğunutest et
        Assert.assertTrue(hauseheavenAnasayfa.SearchButon.isEnabled());

        // Tarayıcıyı Kapat
        Driver.quitDriver();

    }
}