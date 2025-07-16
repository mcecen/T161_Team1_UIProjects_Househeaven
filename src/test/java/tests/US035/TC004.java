package tests.US035;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC004 {
    CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
    Faker faker = new Faker();
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
        ReusableMethods.bekle(2);
        WebElement profilLogosu =hauseheavenAdminPages.profilLogosu;
        Assert.assertTrue(hauseheavenAdminPages.profilLogosu.isDisplayed());
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını görür
        //    Kullanıcı deshboard sayfası sol menüde Real Estate başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.realEstateBasligi.isDisplayed());
        hauseheavenAdminPages.realEstateBasligi.click();
        //    Kullanıcı Real Estate başlığını tıklamak ile alt menude açılan Properties başlığını tıklar
        Assert.assertTrue(hauseheavenAdminPages.propertiesBasligi.isDisplayed());
        hauseheavenAdminPages.propertiesBasligi.click();
        //    Kullanıcı properties başlığını tıklamak ile "https://qa.hauseheaven.com/admin/real-estate/properties" sayfasına erişebildiğini görür
        String expectedPropertiesSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties";
        String actualPropertiesSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPropertiesSayfaUrl,actualPropertiesSayfaUrl);


    }
    @Test
    public void test002(){

// Kullanıcı sağ üst tarafta "Create" butonunu tıklar
        ReusableMethods.bekle(3);
    hauseheavenAdminPages.createButton.click();
// Kullanıcı sağ üst tarafta "Create" butonunu tıklaması ile"https://qa.hauseheaven.com/admin/real-estate/properties/create" url adresine ulaşır
    String expectedSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/properties/create" ;
    String actualSayfaUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(expectedSayfaUrl.equals(actualSayfaUrl));
// Kullanıcı Createsayfasında "Title" textbox ını tıklar
     hauseheavenAdminPages.titleAlani.click();
// Kullanıcı  Create sayfasında "Title" textbox ına title içeriğini yazar
   hauseheavenAdminPages.titleAlani.sendKeys(faker.toString());
// Kullanıcı  Create sayfasında "Description" butonunu  tıklar
 hauseheavenAdminPages.descriptionAlani.click();
// Kullanıcı Create sayfasında "Description" textbox ına istediği metni yazar
   hauseheavenAdminPages.descriptionAlani.sendKeys(faker.toString());
// Kullanıcı  Create sayfasında "Content" butonunu  tıklar
   hauseheavenAdminPages.contentAlani.click();
// Kullanıcı  Create sayfasında "Content" textbox ına istediği metni yazar
   hauseheavenAdminPages.contentAlani.sendKeys(faker.toString());
// Kullanıcı sayfayı aşağı kaydırarak ilerler
  Actions actions= new Actions(Driver.getDriver());
  actions.sendKeys(Keys.PAGE_DOWN).perform();
// Kullanıcı "Add ımage" butnunu tıklar
   ReusableMethods.bekle(3);
   hauseheavenAdminPages.addImageButton.click();
//        Kullanıcı "Add ımage" butnunu tıklaması ile "https://qa.hauseheaven.com/admin/real-estate/properties/create#"url ine ulaşır
//        Kullanıcı resim çözünürlüğü 1280x850px olan resimleri ekler
//        Kullanıcı create sayfasında "City" textbox ını görür
//        Kullanıcı create sayfasında "City" texbox ının altında açılan menüyu görür
//        Kullanıcı create sayfasında "City" texbox ının altında açılan menüyu tıklar
//        Kullanıcı create sayfasında "City" texbox ının altında açılan menüden mause u alta sürükleyerek  istediği şehri tıklayarak seçer
//        Kullanıcı Create sayfasında "Property Location" textbox ını görür
//        Kullanıcı Create sayfasında "Property Location" butonunu  tıklar
//        Kullanıcı Create sayfasında "Property Location" textbox ına mülkün konumunu yazar
//        Kullanıcı create sayfasında "Latitude" textbox ını görür
//        Kullanıcı create sayfasında "Latitude" texbox ını  tıklar
//        Kullanıcı create sayfasında "Latitude" textbox ına konumun enlem bilgisini  yazar
//        Kullanıcı create sayfasında "Longitude" textbox ını görür
//        Kullanıcı create sayfasında "Longitude" texbox ını  tıklar
//        Kullanıcı create sayfasında "Longitude" textbox ına konumun boylam bilgisini  yazar
//        Kullanıcı create sayfasında "Number bedrooms" textbox ını görür
//        Kullanıcı create sayfasında "Number bedrooms" texbox ını  tıklar
//        Kullanıcı create sayfasında "Number bedrooms" textbox ına yatak odası sayısını  yazar
//        Kullanıcı create sayfasında "Number bathrooms" textbox ını görür
//        Kullanıcı create sayfasında"Number bathrooms" texbox ını  tıklar
//        Kullanıcı create sayfasında "Number bathrooms" textbox ına banya sayısını  yazar
//        Kullanıcı create sayfasında "Number floors" textbox ını görür
//        Kullanıcı create sayfasında "Number floors" texbox ını  tıklar
//        Kullanıcı create sayfasında "Number floors" textbox ına kat sayısını  yazar
//        Kullanıcı create sayfasında "Square (ft2)" textbox ını görür
//        Kullanıcı create sayfasında"Square (ft2)" texbox ını  tıklar
//        Kullanıcı create sayfasında "Square (ft2)" textbox ına metrekare bilgisini  yazar
//        Kullanıcı create sayfasında "Price" textbox ını görür
//        Kullanıcı create sayfasında "Price" texbox ını  tıklar
//        Kullanıcı create sayfasında"Price" textbox ına fiyat bilgisini  yazar
//        Kullanıcı create sayfasında "Currency" textbox ını görür
//        Kullanıcı create sayfasında "Currency" texbox ını  tıklar
//        Kullanıcı create sayfasında "Currency" textbox ına para birimi  bilgisini  yazar
//        Kullanıcı create sayfasında Never Expired? textbox ını görür
//        Kullanıcı create sayfasında Never Expired? textbox ını ilanın süresiz yayınlanmasını istemiyor ise tıklar
//        Kullanıcı create sayfasında Never Expired? textbox ını tıklaması ile Renew automatically (you will be charged again in 45 days)? Butonu seçilmiş olarak görülür
//        Kullanıcı sayfayı aşağı kaydırarak ilerler
//        Kullanıcı create sayfasında"Distance key between facilities" yazısını görür
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında Select facility texbox ını görür
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında Select facility texbox ını tıklar
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında Select facility texbox ını tıklaması ile açılan menüden mause u hareket ettirerek  tesis seçer tıklar
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında Distance (km) texbox ını görür
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında Distance (km)texbox ını tıklar
//        Kullanıcı create sayfasında"Distance key between facilities" yazısının altında  Distance (km)texbox ını tıklar ve tesise km mesafesini yazar
//        Kullanıcı create sayfasında Add new butonunu  görür
//        Kullanıcı create sayfasında Add new butonunu  eğer yeni bir tesis mesafe yazmak isterse tıklar ve yazar
//        Kullanıcı  Create sayfasında "Type" textbox ını görür
//        Kullanıcı Create sayfasında "Type" textbox ını  tıklar
//        Kullanıcı  Create sayfasında "Type" textbox ını  tıklaması ile altta açılan menüyü görür
//        Kullanıcı  Create sayfasında "Type" textbox ını tıklaması ile altta açılan menüden (for sale,for rent ,It Doesn'tMatter) istediği seçeneği tıklar
//        Kullanıcı create sayfasında "Feature"yazısını görür
//        Kullanıcı create sayfasında "Feature"yazısının altında belirtilmiş seçenekleri görür
//        Kullanıcı create sayfasında Feature yazısı altındaki seçeneklerden istediklerini tıklayarak seçer
//        Kullanıcı sayfanın sonunda sağ altta bulunan yukarı ok ıkonunu görür
//        Kullanıcı sayfanın sonunda sağ altta bulunan yukarı ok ıkonunu tıklar ve sayfanın başına döner
//        Kullanıcı create sayfasının sağında bulunan "Custom layout "yazısı altında Header layout texbox ını görür
//        Kullanıcı create sayfasının sağında bulunan "Custom layout "yazısı altında Header layout texbox ını tıklar
//        Kullanıcı create sayfasının sağında bulunan "Custom layout "yazısı altında Header layout texbox ını tıklaması ile altta açılan menüden istediğini tıklayarak seçer
//        Kullanıcı sayfanın sol tarafında "Moderation Status" textbox ını  görür
//        Kullanıcı sayfanın sol tarafında "Moderation Status" textbox ını  tıklar
//        Kullanıcı  Create sayfasında "Moderation Status" alanını tıklaması ile altta açılan menüyü görür
//        Kullanıcı  Create sayfasında "Moderation Status" alanını tıklaması ile altta açılan menüden(pending,approved,rejected)istediği seçeneği tıklar
//        Kullanıcı create sayfasının sağında bulunan "Category "texbox ını görür
//        Kullanıcı create sayfasının sağında bulunan"Category " texbox ını tıklar
//        Kullanıcı create sayfasının sağında bulunan "Category " texbox ını tıklaması ile altta açılan menüden istediğini tıklayarak seçer
//        Kullanıcı sağ en üstte "publish" yazısını görür
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu görür
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu tıklar
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save" butonunu tıklama sonucu ekranda "Created successfully"ibaresini görür ve sayfa yenilenerek aynı sayfada kalır
//        Kullanıcı sol üstten geri ok tuşuna basar
//        Kullanıcı properties anasayfaya döner
//        Kullanıcı  properties anasayfada
//        Kullanıcı sağ üstte Create  ıkonunu görür
//        Kullanıcı sağ üstte Create  ıkonunu tıklar
//        Kullanıcı sağ üst tarafta "Create" butonunu tıklaması ile"https://qa.hauseheaven.com/admin/real-estate/properties/create" url adresine ulaşır
//        Kullanıcı create sayfasında "You are editing "English" version" ibaresini görür
//        Kullanıcı create sayfasında "Title" textbox ını görür
//        Kullanıcı create sayfasında "Title" textbox ını tıklar
//        Kullanıcı create sayfasında "Title" textbox ında var olan içeriği siler
//        Kullanıcı create sayfasında "Title" textbox ına title içeriğini yazar
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save&Exit" butonunu görür
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save&Exit" butonunu tıklar
//        Kullanıcı sağ en üstte "publish" yazısınının altında "Save&Exit" butonunu tıklama sonucu ekranda "Created successfully"ibaresini görür ve sayfa yenilenerek properties anasayfaya yönlendirilir




    }
}
