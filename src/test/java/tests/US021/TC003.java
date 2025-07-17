package tests.US021;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
    @Test
    public void TC003(){
        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

        //TC003- kayıtlı kullanıcı olarak  listelenen ilanların
        // ayrıntılarına erişilebilmek için
        // gerekli fonksiyonların bulunduğunu test et
        //kullanıcı "qa.hauseheaven anasayfasına" gider

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //"hauseheaven" anasayfsına gittiğini doğrula
        SoftAssert softAssert = new SoftAssert();

        String expectedUrl = ConfigReader.getProperty("url");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "url expectedUrl'den farklı!");

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

        //Listing sayfasına geçiş
        hauseheavenAnasayfa.ListingButonu.click();
        ReusableMethods.bekle(1);



        softAssert.assertAll();
        Driver.quitDriver();


    }
}
