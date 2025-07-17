package tests.US021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Serpil_HauseHeavenAnasayfa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

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

        //Filtreleme yapınız
        //  hauseheavenAnasayfa.searchLocationButon.sendKeys(ConfigReader.getProperty("serpilLocation"));
        ReusableMethods.bekle(1);

        hauseheavenAnasayfa.ListingCityBox.click();
        ReusableMethods.bekle(1);

        WebElement cityOption = driver.findElement(By.xpath("//*[@data-select2-id='select2-data-85-jv9p']"
        ));
        cityOption.click();

        // aşağı indirme kodu
       /* javascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollBy(0, 100);"); */
        hauseheavenAnasayfa.minAreaButonu.sendKeys(ConfigReader.getProperty("serpilMinArea"));
        hauseheavenAnasayfa.maxAreaButonu.sendKeys(ConfigReader.getProperty("serpilMaxArea"));

        ReusableMethods.bekle(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 1800);");
        ReusableMethods.bekle(1);

        hauseheavenAnasayfa.filtrelemeKaydetButonu.click();
        ReusableMethods.bekle(1);





        softAssert.assertAll();
        Driver.quitDriver();


    }
}
