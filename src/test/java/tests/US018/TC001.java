package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpıl_HauseheavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {

    Serpıl_HauseheavenAnasayfa hauseheavenAnasayfa=new Serpıl_HauseheavenAnasayfa();

    @Test

    public void TC001(){
        //1- Kayıtllı kullanıcı olarak anasayfaya girmek ve
        // anasayfanın gövde bölümüne erişmek istiyorum

        //Kullanıcı tarayıcı sayfasını acar

        //Kullacı tarayıcı arama cubuğuna tıklar

        //Kullanıcı arama cubuğuna hausehaeven "https://qa.hauseheaven.com"
        // URL'yi girer ve anasayfaya erişir

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //anasayfaya gittiğini kontrol et

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));



        Driver.quitDriver();

    }

}
