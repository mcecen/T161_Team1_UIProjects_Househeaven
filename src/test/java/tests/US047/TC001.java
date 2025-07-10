package tests.US047;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CennetHauseheavenAdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    /*
The user opens the browser page.
The user clicks on the browser search bar.
The user types https://qa.hauseheaven.com/admin/login into the search bar.
The user searches for the URL typed into the search bar. (Enter can be used)
The user sees the HOUSE HEAVEN admin login homepage.
The user sees the email/username text field.
The user clicks on the email/username text field.
The user enters "mustafacecen_admin" into the email/username text field.
The user sees the Password text field.
The user clicks on the Password text field.
The user enters 021924 into the Password text field.
The user sees the Sign In button.
The user clicks on the Sign In button.
By clicking on the Sign In button, it is seen that the https://qa.hauseheaven.com/admin page can be accessed.
The user sees that the Admin dashboard homepage opens.
The user sees the Packages category from the left menu panel.
The user clicks on the Packages category from the left menu panel.
When the user clicks on the package category, the user sees that she can access the page https://qa.hauseheaven.com/admin/real-estate/packages.
Create butonuna tıklanır ve https://qa.hauseheaven.com/admin/real-estate/packages/create sayfasına ulaşıldığı görülür.
Name text alanına "deneme paket" yazılır.
Status alanı "Published" olarak seçilir.
Price alanına 100 değeri girilir
Percent save alanına 1, number of listings alanına 1 değeri girilir.
Save butonuna tıklanır ve created successfully başarılı mesajı görülür.
Tarayıcı sayfasında geri gidilir ve oluşturulan kayıt kontrol edilir.
edit butonuna tıklanır

     */
    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String expectedUrlIcerik = "hauseheaven";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrlIcerik.contains((expectedUrlIcerik)));

        CennetHauseheavenAdminPages hauseheavenAdminPages = new CennetHauseheavenAdminPages();
        Assert.assertTrue(hauseheavenAdminPages.emailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.emailKutusu.click();
        hauseheavenAdminPages.emailKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa"));

        ReusableMethods.bekle(3);
        hauseheavenAdminPages.passwordKutusu.click();
        hauseheavenAdminPages.passwordKutusu.sendKeys(ConfigReader.getProperty("admin-mustafa-password"));

        hauseheavenAdminPages.signInButton.click();

        Assert.assertTrue(hauseheavenAdminPages.packageMenuAlanı.isDisplayed());

        hauseheavenAdminPages.packageMenuAlanı.click();

        String expectedPackageSayfaUrl="https://qa.hauseheaven.com/admin/real-estate/packages";
        String actualPackageSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPackageSayfaUrl,actualPackageSayfaUrl);

        Driver.quitDriver();


    }
}