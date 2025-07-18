package tests.US034;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor_Yusuf;

import java.io.IOException;
import java.time.Duration;

public class TC002 extends TestBaseRapor_Yusuf {

//        Admin olarak, Real Estate başlığının altındaki menülerin görünür olmasını istiyorum.
//        Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görür
//        Kayıtlı kullanıcı dashboard anasayfasının açıldığı görür.
//        Kayıtlı kullanıcı dashboard anasayfasının Sol menü Real Estate menüsü görünür.
//        Kayıtlı kullanıcı olarak bu başlık altındaki tüm alt menüler Properties, Features, Facilities, Categories, Types görünür olduğu görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Propertiestıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/properties görüntülenmektedir.
//        Kayıtlı kullanıcı olarak bu başlık altındaki Properties sayfasına tıklandığında Properties  Bulk Actions, Filters ve Serach, Create, Export, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Features tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/property-features görüntülenmektedir.
//        Kayıtlı kullanıcı olarak bu başlık altındaki Features sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Facilities tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/facilities görüntülenmektedir.
//        Kayıtlı kullanıcı olarak bu başlık altındaki Facilities sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Categories tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/categories görüntülenmektedir.
//        Kayıtlı kullanıcı olarak bu başlık altındaki Categories sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Types tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/types görüntülenmektedir.
//        Kayıtlı kullanıcı olarak bu başlık altındaki Types sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.


    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() throws IOException {

        extentTest = extentReports.createTest(
                "TC002",
                "Real Estate alt menülerinin görünürlük ve işlevsellik testi");

        try {

            hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            JavascriptExecutor jsdown = (JavascriptExecutor) Driver.getDriver();
            JavascriptExecutor jsup = (JavascriptExecutor) Driver.getDriver();

            // Go to the URL
            extentTest.info("Admin giriş sayfasına gidiliyor.");
            Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(1);

            // Check the URL
            String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");
            extentTest.pass("Admin giriş URL'i doğrulandı.");

            // Email Input
            Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
            hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
            extentTest.info("Admin email adresi girildi.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("emailInput"));

            // Password Input
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.info("Admin şifresi girildi.");

            // Sign In
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Admin paneline giriş yapıldı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("signInButton"));

            // Dashboard
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();

            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed());
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed());
            extentTest.pass("Dashboard üzerindeki ana bileşenler doğrulandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Dash Board"));

            // Real Estate Link
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateLink.isDisplayed(), "Real Estate link is not visible.");
            hauseHeaven_yusufcelal.realEstateLink.click();
            extentTest.pass("Real Estate menüsüne tıklandı.");
            ReusableMethods.bekle(1);
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("RealEstate"));

            // 9. Verify the Property link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.propertyLink.isDisplayed(), "Property link is not visible.");
            extentTest.pass("Property link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.propertyLink.click();
            extentTest.pass("Property link'e tıklandı.");
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.propertyCategoriesLink.click();
            extentTest.pass("Property Categories link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBox.isDisplayed(), "Property search box is not visible.");
            extentTest.pass("Property arama kutusu görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.PropertysearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.PropertysearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInput.isDisplayed(), "Property search box input is not visible.");
            extentTest.pass("Property arama kutusu input alanı görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.PropertysearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.PropertysearchBoxInputNext.click();
            extentTest.pass("Property search next butonuna tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInputSelect.isDisplayed(), "Property search box select is not visible.");
            extentTest.pass("Property arama kutusu select alanı görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.PropertysearchBoxInputSelect.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.isDisplayed(), "Property Next Button görünür değil!");
            extentTest.pass("Property Next Button görünür durumda doğrulandı.");

            hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton));
            extentTest.pass("Property Next Button tıklandı.");
            ReusableMethods.bekle(2);

            hauseHeaven_yusufcelal.PropertysearchBoxInputPreviousButton.click();
            extentTest.pass("Property Previous Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featureLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Feature link görünür değil!");
            extentTest.pass("Feature link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featureLink.click();
            extentTest.pass("Feature link'e tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Veri Kaydedildi"));

            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featureLink));
            ReusableMethods.bekle(2);

// 10. Verify the Feature link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Feature link is not visible.");
            extentTest.pass("Feature link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featureLink.click();
            extentTest.pass("Feature link'e tıklandı.");
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.featureCategoriesLink.click();
            extentTest.pass("Feature Categories link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBox.isDisplayed(), "Feature search box is not visible.");
            extentTest.pass("Feature arama kutusu görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featuresearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.featuresearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInput.isDisplayed(), "Feature search box input is not visible.");
            extentTest.pass("Feature arama kutusu input alanı görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featuresearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.featuresearchBoxInputNext.click();
            extentTest.pass("Feature search next butonuna tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputSelect.isDisplayed(), "Feature search box select is not visible.");
            extentTest.pass("Feature arama kutusu select alanı görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featuresearchBoxInputSelect.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            // Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featuresearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Feature Next Button görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.click();
            extentTest.pass("Feature Next Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

            hauseHeaven_yusufcelal.featuresearchBoxInputPreviousButton.click();
            extentTest.pass("Feature Previous Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featureLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Feature link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.featureLink.click();
            extentTest.pass("Feature link'e tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Feature link'e tıklandı."));

            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featureLink));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

// 11. Verify the Facility Link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link is not visible.");
            extentTest.pass("Facility link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilityLink.click();
            extentTest.pass("Facility link'e tıklandı.");
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.facilityCategoriesLink.click();
            extentTest.pass("Facility Categories link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBox.isDisplayed(), "Facility search box is not visible.");
            extentTest.pass("Facility arama kutusu görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilitysearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.facilitysearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInput.isDisplayed(), "Facility search box input is not visible.");
            extentTest.pass("Facility search input görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilitysearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.facilitysearchBoxInputNext.click();
            extentTest.pass("Facility search Next butonuna tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.isDisplayed(), "Facility search select is not visible.");
            extentTest.pass("Facility search select görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Facility Next Button görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.click();
            extentTest.pass("Facility Next Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

            hauseHeaven_yusufcelal.facilitysearchBoxInputPreviousButton.click();
            extentTest.pass("Facility Previous Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilityLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Facility link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilityLink.click();
            extentTest.pass("Facility link'e tekrar tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

// 12. Verify the Real Estate Categories Link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateCategoriesLink.isDisplayed(), "Real Estate Categories link is not visible.");
            extentTest.pass("Real Estate Categories link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.realEstateCategoriesLink.click();
            extentTest.pass("Real Estate Categories link'e tıklandı.");
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.categoriesCategoriesLink.click();
            extentTest.pass("Categories link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBox.isDisplayed(), "Categories search box is not visible.");
            extentTest.pass("Categories arama kutusu görünür durumda doğrulandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("LoginPage"));
            hauseHeaven_yusufcelal.categoriessearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.categoriessearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInput.isDisplayed(), "Categories search input is not visible.");
            extentTest.pass("Categories search input görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.categoriessearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.categoriessearchBoxInputNext.click();
            extentTest.pass("Categories Next butonuna tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.isDisplayed(), "Categories search select is not visible.");
            extentTest.pass("Categories search select görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.click();
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Categories Next Button görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.click();
            extentTest.pass("Categories Next Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

            hauseHeaven_yusufcelal.categoriessearchBoxInputPreviousButton.click();
            extentTest.pass("Categories Previous Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriesLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Facility link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilityLink.click();
            extentTest.pass("Facility link'e tekrar tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş


// 13. Verify the RealEstate Type Link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateTypeLink.isDisplayed(), "Real Estate Type link is not visible.");
            extentTest.pass("Real Estate Type link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.realEstateTypeLink.click();
            extentTest.pass("Real Estate Type link'e tıklandı.");
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.typeCategoriesLink.click();
            extentTest.pass("Type Categories link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBox.isDisplayed(), "Type search box is not visible.");
            extentTest.pass("Type search kutusu görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.typesearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.typesearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInput.isDisplayed(), "Type search box input is not visible.");
            extentTest.pass("Type search input görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.typesearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.typesearchBoxInputNext.click();
            extentTest.pass("Type search Next butonuna tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputSelect.isDisplayed(), "Type search box select is not visible.");
            extentTest.pass("Type search select görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.typesearchBoxInputSelect.click();
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typesearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputNextButton.isDisplayed(), "Type Next Button görünür değil!");
            extentTest.pass("Type Next Button görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.typesearchBoxInputNextButton.click();
            extentTest.pass("Type Next Button tıklandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Type Next Button görüntüleme"));
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputNextButton));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

            hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton.click();
            extentTest.pass("Type Previous Button tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typeCategoriesLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link görünür değil!");
            extentTest.pass("Facility link görünür durumda doğrulandı.");
            hauseHeaven_yusufcelal.facilityLink.click();
            extentTest.pass("Facility link'e tıklandı.");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
// Scroll işlemi bitiş

            extentTest.pass("Tarayıcı kapatıldı ve test başarıyla tamamlandı.");
            extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("DashboardElements"));

        } catch (AssertionError | Exception e) {
            extentTest.fail("Hata oluştu: " + e.getMessage());
            try {
                extentTest.addScreenCaptureFromPath(ReusableMethods.raporaResimEkle("Failure-TC001"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            throw e;
        } finally {
            Driver.quitDriver();
            extentTest.info("Tarayıcı kapatıldı.");
        }
    }
}