package tests.US035;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {
    CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
    @Test
    public void test001(){
            //    Kullanıcı tarayıcı arama çubuğuna hauseheaven "URL:https://qa.hauseheaven.com/admin/login" URL adresini yazar
            //    Kullanıcı Arama butonuna tıklar
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            String expectedUrlIcerik = "hauseheaven";
            String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));
             hauseheavenAdminPages = new CennetHauseheavenAdminPages();
            Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());
            //    Kullanıcı email/username text alanını görür
            //    Kullanıcı email/username text alanını tıklar
            //    Kullanıcı email/username text alanına geçerli email/username girer

            ReusableMethods.bekle(3);
            hauseheavenAdminPages.emailKutusu.click();
            hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-cennet"));
            //    Kullanıcı password text alanını görür
            //    Kullanıcı password text alanını tıklar
            //    Kullanıcı password text alanına geçerli password girer
            ReusableMethods.bekle(3);
            hauseheavenAdminPages.passwordKutusu.click();
            hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-cennet-password"));
            //    Kullanıcı sign in butonunu görür
            //    Kullanıcı sign in butonunu tıklar
            hauseheavenAdminPages.signInButton.click();
            //    Kullanıcı sign in butonunu tıklama ile" https://qa.hauseheaven.com/admin"sayfasına erişir
            //    Kullanıcı Deshboard sayfasına eriştiğini görür
            //    Kullanıcı sağ en üstte (Cennet Atak) kullanıcı adında profil logosunu görür
        ReusableMethods.bekle(3);
            Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
            //    Kullanıcı Deshboard sayfasında Active properties,Pending properties,Expired properties ve Agents kategorilerini görür
            //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
            //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
            Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
             hauseheavenAdminPages.realEstateBasligi.click();
            //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını görür
            //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını tıklar
            Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
             hauseheavenAdminPages.propertiesBasligi.click();
            //    Kullanıcı properties başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/properties" sayfasına erişebildiğini görür
        String expectedPropertiesSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties";
        String actualPropertiesSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);

        //        Kullanıcı OPERATIONS başlığı altında edit ıkonunu tıklar
        hauseheavenAdminPages.editIkonu.click();
        //        Kullanıcı OPERATIONS başlığı altında edit ıkonunu  tıklaması ile  "https://qa.hauseheaven.com/admin/real-estate/properties/edit/62"sayfasına ulaşır
        String expectedEditSayfaUrl = "https://qa.hauseheaven.com/admin/real-estate/properties/edit/62";
        String actualEditSayfaUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);
        //        Kullanıcı edit sayfasında "Title" textbox ını görür
        //        Kullanıcı edit sayfasında "Title" textbox ını tıklar
        ReusableMethods.bekle(3);
        hauseheavenAdminPages.titleAlani.click();
        //        Kullanıcı edit sayfasında "Title" textbox ında var olan içeriği siler (isteğe bağlı)
        hauseheavenAdminPages.titleAlani.clear();
        //        Kullanıcı edit sayfasında "Title" textbox ına title içeriğini yazar(isteğe bağlı)
        Faker faker= new Faker();
        hauseheavenAdminPages.titleAlani.sendKeys(faker.toString());
        //
        //        Kullanıcı edit sayfasında "Description" textbox ını görür
        //        Kullanıcı edit sayfasında "Description" textbox ını görür
        //        Kullanıcı edit sayfasında "Description" butonunu  tıklar
        hauseheavenAdminPages.descriptionAlani.click();
        //        Kullanıcı edit sayfasında "Description" textbox ında var olan metni siler(isteğe bağlı)
        hauseheavenAdminPages.descriptionAlani.clear();
        //        Kullanıcı edit sayfasında "Description" textbox ına istediği metni yazar(isteğe bağlı)
        hauseheavenAdminPages.descriptionAlani.sendKeys(faker.random().toString());
        //        Kullanıcı edit sayfasında "Content" textbox ını görür
        //        Kullanıcı edit sayfasında "Content" butonunu  tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        hauseheavenAdminPages.contentAlani.click();
        //        Kullanıcı edit sayfasında "Content" textbox ında var olan metni siler(isteğe bağlı)
        hauseheavenAdminPages.contentAlani.clear();
        //        Kullanıcı edit sayfasında "Content" textbox ına istediği metni yazar(isteğe bağlı)
        hauseheavenAdminPages.contentAlani.sendKeys(faker.random().toString());
        //        Kullanıcı sayfayı aşağı kaydırarak ilerler
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
               //        Kullanıcı edit sayfasında "Property Location" textbox ını görür
        //        Kullanıcı edit sayfasında "Property Location" butonunu  tıklar
        hauseheavenAdminPages.propertyLocationAlani.click();
        hauseheavenAdminPages.propertyLocationAlani.clear();
        //        Kullanıcı edit sayfasında "Property Location" textbox ında var olan metni siler(isteğe bağlı)
        ReusableMethods.bekle(2);
        //        Kullanıcı edit sayfasında "Property Location" textbox ına istediği metni yazar(isteğe bağlı)
        hauseheavenAdminPages.propertyLocationAlani.sendKeys(faker.random().toString());
        //        Kullanıcı sayfayı aşağı kaydırarak ilerler
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        //        Kullanıcı edit sayfasında "Type" textbox ını görür
        //        Kullanıcı edit sayfasında "Type" textbox ını  tıklar
        //        Kullanıcı edit sayfasında "Type" textbox ını  tıklaması ile altta açılan menüyü görür
        //        Kullanıcı edit sayfasında "Type" textbox ını tıklaması ile altta açılan menüden (for sale,for rent ,It Doesn'tMatter) istediği seçeneği tıklar(isteğe bağlı)
        hauseheavenAdminPages.typeAlaniDdm.click();
        Select select =new Select(hauseheavenAdminPages.typeAlaniDdm);
        select.selectByValue("2");
        //        Kullanıcı sayfanın sonunda sol altta bulunan yukarı ok ıkonunu görür
        //        Kullanıcı sayfanın sonunda sol altta bulunan yukarı ok ıkonunu tıklar ve sayfanın başına döner
        hauseheavenAdminPages.yukariOkIkonu.click();
        ReusableMethods.bekle(4);
        //        Kullanıcı sayfanın sol tarafında "Moderation Status" textbox ını  görür
        //        Kullanıcı sayfanın sol tarafında "Moderation Status" textbox ını  tıklar

        //        Kullanıcı edit sayfasında "Moderation Status" alanını tıklaması ile altta açılan menüyü görür
        //        Kullanıcı edit sayfasında "Moderation Status" alanını tıklaması ile altta açılan menüden(pending,approved,rejected)istediği seçeneği tıklar(isteğe bağlı)
        ReusableMethods.bekle(4);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, -600)");
        //şimdi de sayfa aşağıda kaldığı için locate yerini görmüyor napacağız burda birde sayfayı yukarı çekmesi için kod ekleyeceğiz :D
        WebElement element=hauseheavenAdminPages.moderationStatusDdm;
        //elementi görünür yapıyor
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        // buda java scrit ile tıklama yapıyor
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value = 'approved'; arguments[0].dispatchEvent(new Event('change'));", element);

        // Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu görür
        // Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu tıklar
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, -600)");
        hauseheavenAdminPages.saveButton.click();
        System.out.println(hauseheavenAdminPages.createdSuccessfullyMesaji.getText());
        // Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu tıklama sonucu ekranda ""Created successfully""ibaresini görür ve sayfa yenilenerek aynı sayfada kalır
       String expectedSonucMesajIcerik= "Created successfully";
        String actualSonucMesajIcerik= hauseheavenAdminPages.createdSuccessfullyMesaji.getText();
        Assert.assertTrue(actualSonucMesajIcerik.contains(expectedSonucMesajIcerik));
      ReusableMethods.bekle(3);
        // Kullanıcı properties anasayfaya döner
                Driver.getDriver().get("https://qa.hauseheaven.com/admin/real-estate/properties");
        // Kullanıcı  properties anasayfada
        // Kullanıcı OPERATIONS başlığı altında edit ıkonunu tıklar
                hauseheavenAdminPages.editIkonu.click();
        // Kullanıcı OPERATIONS başlığı altında edit ıkonunu  tıklaması ile  "https://qa.hauseheaven.com/admin/real-estate/properties/edit/62"sayfasına ulaşır
        String expectedEditSayfaUrl2 = "https://qa.hauseheaven.com/admin/real-estate/properties/edit/62";
        String actualEditSayfaUrl2=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);
        //        Kullanıcı edit sayfasında "Title" textbox ını görür
        //        Kullanıcı edit sayfasında "Title" textbox ını tıklar
        ReusableMethods.bekle(3);
        hauseheavenAdminPages.titleAlani.click();
        //        Kullanıcı edit sayfasında "Title" textbox ında var olan içeriği siler (isteğe bağlı)
        hauseheavenAdminPages.titleAlani.clear();
        //        Kullanıcı edit sayfasında "Title" textbox ına title içeriğini yazar(isteğe bağlı)

        hauseheavenAdminPages.titleAlani.sendKeys(faker.book().title());

       //Kullanıcı sağ en üstte "publish" yazısınının altında "Save&Exit" butonunu görür
        //Kullanıcı sağ en üstte "publish" yazısınının altında "Save&Exit" butonunu tıklar
        hauseheavenAdminPages.saveExitButton.click();
       // Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu tıklama sonucu ekranda "Created successfully"ibaresini görür ve sayfa yenilenerek properties anasayfaya yönlendirilir
        String expectedSonucMesaji2= "Created successfully";
        String actualSonucMesaji2= hauseheavenAdminPages.createdSuccessfullyMesaji.getText();
        Assert.assertTrue(actualSonucMesaji2.equals(expectedSonucMesaji2));
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
    }

