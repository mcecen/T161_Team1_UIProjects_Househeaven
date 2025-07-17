package tests.US019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC003 {

    @Test
    public void TC003(){

        Serpil_HauseHeavenAnasayfa hauseheavenAnasayfa = new Serpil_HauseHeavenAnasayfa();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kayıtlı kullanıcı olarakanasayfanın gövde bölümünde
        // arama yaparak arama fonksiyonunun
        // göruntulenebildiğini test et

        //Giriş yapın

        hauseheavenAnasayfa.signInButonu.click();
        ReusableMethods.bekle(1);

        //Kullanıcı adını giriniz
        hauseheavenAnasayfa.usernameKutusu.sendKeys(ConfigReader.getProperty("user-serpil"));
        ReusableMethods.bekle(1);

        //şifrenizi girin
        hauseheavenAnasayfa.passwordKutusu.sendKeys(ConfigReader.getProperty("user-serpil-password"));
        ReusableMethods.bekle(1);

        //Login butonunu tıkla
        hauseheavenAnasayfa.loginButonu.click();
        ReusableMethods.bekle(1);

        //açılan paneldeki minPrice'a data girmek
        hauseheavenAnasayfa.minPriceTextbox.click();
        WebElement minSayi= driver.findElement(By.xpath("//*[@id=\"select2-minprice-result-7mey-1000\"]"));
        minSayi.click();

        hauseheavenAnasayfa.maxPriceText.click();;
        WebElement maxSayi= driver.findElement(By.xpath("//*[@id=\"select2-maxprice-result-dhm1-5000\"]"));
        maxSayi.click();

        ReusableMethods.bekle(1);




    }

}
