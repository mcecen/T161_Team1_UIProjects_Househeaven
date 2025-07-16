package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa=new Serpil_HauseHeavenAnasayfa();

    @Test

    public void TC001(){
        //1- Kayıtllı kullanıcı olarak anasayfaya girmek ve
        // anasayfanın gövde bölümüne erişmek istiyorum

        //Kullanıcı tarayıcı sayfasını acar

        //Kullanıcı arama cubuğuna hausehaeven "https://qa.hauseheaven.com"
        // URL'yi girer ve anasayfaya erişir

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);
        //anasayfaya gittiğini kontrol et

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));

        //Kullanıcı anasayfayı kapatır

        Driver.quitDriver();

    }

}
