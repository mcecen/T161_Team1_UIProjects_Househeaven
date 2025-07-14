package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {

    @Test
    public void TC002() {

        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

        // 2-Kayıtlı kullanıcı olarak anasayfanın gövde bölümündeki
        //"acılır kutuların" görünürlüğünü test et


        //Kullanıcı hausehaeven "https://qa.hauseheaven.com" URL adresine gider

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //  "sıgn ın " butonunun görünürlüğünü test et
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseheavenAnasayfa.signInButonu.isDisplayed());;
        ReusableMethods.bekle(1);

        //  "Find accessible homes to rent" başlığının görüntülendiğini kontrol et
       Assert.assertTrue(hauseheavenAnasayfa.HomePageLogo.isDisplayed());

       //"serach location butonunun görunurluğunu test et
        Assert.assertTrue(hauseheavenAnasayfa.searchLocation.isDisplayed());

        // "Min Price" "acılır menusunun"görünürlüğünü test et
        Assert.assertTrue(hauseheavenAnasayfa.minPriceTextbox.isDisplayed());

        // " Max Price" "açılır menüsünün" görünürlüğünü test et
        Assert.assertTrue(hauseheavenAnasayfa.maxPriceText.isDisplayed());

        // " Property Type" "açılır menüsünün" görünürlüğünü test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyType.isDisplayed());

        // " Bed Rooms " "açılır menüsünün" görünürlüğünü test et
        Assert.assertTrue(hauseheavenAnasayfa.bedRoomsTextbox.isDisplayed());

        // " Property Location" "açılır menüsünün" görünürlüğünü test et
        Assert.assertTrue(hauseheavenAnasayfa.propertyLocation.isDisplayed());

        // "Search Result" kutusununun görünülür olduğunutest et
        Assert.assertTrue(hauseheavenAnasayfa.SearchButon.isDisplayed());

        // Tarayıcıyı Kapat
        Driver.quitDriver();

    }


    }

