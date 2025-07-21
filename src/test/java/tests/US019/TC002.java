package tests.US019;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {
    @Test
    public void  TC002(){

        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

        //Kayıtlı kullanıcı olarak anasayfanın gövde bölümünde
        // arama yaparak sonuç sayısının
        // göruntulenebildiğini test et

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

        //Login butonunu tıklayın
        hauseheavenAnasayfa.loginButonu.click();
        ReusableMethods.bekle(1);
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

Assert.assertTrue(hauseheavenAnasayfa.ListSonucSayisi.isDisplayed());

Driver.quitDriver();







    }



}
