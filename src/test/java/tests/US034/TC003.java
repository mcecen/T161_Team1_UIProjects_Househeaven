package tests.US034;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

public class TC003 extends TestBaseRapor_Yusuf {

//        Admin olarak, Real Estate başlığının altındaki menülerin aktif olmasını istiyorum.
//        Admin kullanıcı https://qa.hauseheaven.com/admin/ adresi görüntülendiğini görünür.
//        Kayıtlı kullanıcı dashboard anasayfasının açıldığı görür.
//        Kayıtlı kullanıcı dashboard anasayfasının Sol menü Real Estate menüsü görünür.
//        Kayıtlı kullanıcı olarak bu başlık altındaki tüm alt menüler Properties, Features, Facilities, Categories, Types görünür olduğu görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Propertiestıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/properties görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak bu başlık altındaki Properties sayfasına tıklandığında Properties  Bulk Actions, Filters ve Serach, Create, Export, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Features tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/property-features görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak bu başlık altındaki Features sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak + Create tıklanınca "You are editing "English" version" çıkan ekranda kayıt menüsü aktif olarak işlme başlamış ve zorunlu alanlar doldurularak Save & Exit tıklanarak işlemin Successufuly Created Successufuly diyerek kayıt yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak işlem düzenleme yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak silme işlemi yapıdığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Facilities tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/facilities görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak bu başlık altındaki Facilities sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak + Create tıklanınca "You are editing "English" version" çıkan ekranda kayıt menüsü aktif olarak işlme başlamış ve zorunlu alanlar doldurularak Save & Exit tıklanarak işlemin Successufuly Created Successufuly diyerek kayıt yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak işlem düzenleme yapılmaktadır.
//        Kayıtlı kullanıcı olarak silme işlemi yapıdığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Categories tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/categories görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak bu başlık altındaki Categories sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak + Create tıklanınca "You are editing "English" version" çıkan ekranda kayıt menüsü aktif olarak işlme başlamış ve zorunlu alanlar doldurularak Save & Exit tıklanarak işlemin Successufuly Created Successufuly diyerek kayıt yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak işlem düzenleme yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak silme işlemi yapıdığı görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Types tıklandığında geçerli URL https://qa.hauseheaven.com/admin/real-estate/types görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak bu başlık altındaki Types sayfasına tıklandığında Bulk Actions, Filters ve Serach, Create, Reload ve girilmiş kayıtlar görüntülenmektedir.
//        Kayıtlı kullanıcı olarak Bulk Actions tıklanınca Delete menüsü çıktığı görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca sayfa içinde kaç satır listelenmeli seçeneği görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak page down yapınca  "Show from 1 to 10 in 43 records" şeklinde kayıt sayısı ve görüntü satırı ve "« Previous1 2 3 4 5 6 Next »" işlmleri görüntülenmektedir.
//        //    Kayıtlı kullanıcı olarak işlem yaptığımda bütün menüleri aktif olduğu görünmüştür.
//        //    Kayıtlı kullanıcı olarak + Create tıklanınca "You are editing "English" version" çıkan ekranda kayıt menüsü aktif olarak işlme başlamış ve zorunlu alanlar doldurularak Save & Exit tıklanarak işlemin Successufuly Created Successufuly diyerek kayıt yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak işlem düzenleme yapılmaktadır.
//        //    Kayıtlı kullanıcı olarak silme işlemi yapıdığı görüntülenmektedir.

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

            // 4. Password input field
            Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
            hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
            extentTest.pass("Admin şifresi girildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PasswordInput"));

            // 5. Sign In button
            Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
            hauseHeaven_yusufcelal.signInButton.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Admin giriş işlemi yapıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("DashboardPage"));

            // 6. Verify the Admin Dashboard URL
            Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
            hauseHeaven_yusufcelal.dashboardText.click();
            extentTest.pass("Dashboard sayfası açıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("DashboardOpened"));

            // 7. Verify dashboard elements
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");
            extentTest.pass("Dashboard üzerindeki tüm ana öğeler doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("DashboardSections"));

            // 8. Verify the Real Estate link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateLink.isDisplayed(), "Real Estate link is not visible.");
            hauseHeaven_yusufcelal.realEstateLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Real Estate link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("RealEstateLink"));

            // 9. Verify the Property link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.propertyLink.isDisplayed(), "Property link is not visible.");
            hauseHeaven_yusufcelal.propertyLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Property link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyLink"));

            hauseHeaven_yusufcelal.propertyCategoriesLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBox.isDisplayed(), "Property search box is not visible.");
            hauseHeaven_yusufcelal.PropertysearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Property sayfasında arama kutusu kullanıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertySearchBox"));

            // Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
            hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Property sayfasında ileri butonuna tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyNext"));

            // Create Property
            hauseHeaven_yusufcelal.PropertyCreate.click();
            extentTest.pass("Property Create butonuna tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyCreatePage"));

            hauseHeaven_yusufcelal.PropertyNameText.sendKeys(ConfigReader.getProperty("descriptionInputText"));
            ReusableMethods.bekle(1);
            extentTest.pass("Property adı girildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyNameInput"));

            hauseHeaven_yusufcelal.PropertyDescriptionText.sendKeys(ConfigReader.getProperty("descriptionInputCtgrsText"));
            ReusableMethods.bekle(1);
            extentTest.pass("Property açıklaması girildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyDescription"));

            hauseHeaven_yusufcelal.PropertyForm.sendKeys(ConfigReader.getProperty("ContentInputText"));
            ReusableMethods.bekle(2);
            extentTest.pass("Property form içeriği dolduruldu.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyForm"));


            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertyForm);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertyForm.isDisplayed(), "Hedef alan görünür değil!");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertyLocation));
            hauseHeaven_yusufcelal.PropertyLocation.sendKeys(ConfigReader.getProperty("propertylocation"));
            ReusableMethods.bekle(2);
            // Scroll işlemi bitiş


            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertyAddNew);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.PropertyAddNew.isDisplayed(), "Hedef alan görünür değil!");
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertyAddNew));
            hauseHeaven_yusufcelal.PropertyTypeSatis.click();
            ReusableMethods.bekle(2);
            // Scroll işlemi bitiş

            // Property özelliklerinin seçilmesi
            hauseHeaven_yusufcelal.PropertywifiCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("WiFi seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyWiFi"));

            hauseHeaven_yusufcelal.PropertyBalkonyCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Balkon seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyBalkon"));

            hauseHeaven_yusufcelal.PropertyKlimaCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Klima seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyKlima"));

            hauseHeaven_yusufcelal.PropertyEvcilHayvanCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Evcil hayvan seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyEvcilHayvan"));

            hauseHeaven_yusufcelal.PropertyDisAlanCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Dış alan seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyDisAlan"));

            hauseHeaven_yusufcelal.PropertyAdaCheckbox.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Ada seçildi.").addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertyAda"));

// Kaydet ve çık
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertySaveAndExitButton);
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertySaveAndExitButton));
            ReusableMethods.bekle(2);
            hauseHeaven_yusufcelal.PropertySaveAndExitButton.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Property kaydedildi ve çıkıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("PropertySaved"));

// 10. Feature link kontrol
            Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Feature link görünür değil.");
            hauseHeaven_yusufcelal.featureLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Feature link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureLink"));

// Feature işlemleri
            hauseHeaven_yusufcelal.featureCategoriesLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBox.isDisplayed(), "Feature search box görünür değil.");
            hauseHeaven_yusufcelal.featuresearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Feature arama kutusu kullanıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureSearch"));

            hauseHeaven_yusufcelal.featuresearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInput.isDisplayed(), "Feature search input görünür değil.");
            hauseHeaven_yusufcelal.featuresearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Feature search input alanı kullanıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureSearchInput"));

            hauseHeaven_yusufcelal.featuresearchBoxInputNext.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputSelect.isDisplayed(), "Feature select görünür değil.");
            hauseHeaven_yusufcelal.featuresearchBoxInputSelect.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Feature ileri ve select butonları kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureNextSelect"));

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featuresearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.isDisplayed(), "Feature Next Button görünür değil!");
            hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Feature Next Button tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureNextButton"));

// Feature Create
            hauseHeaven_yusufcelal.featureCreate.click();
            hauseHeaven_yusufcelal.featureTitleInput.sendKeys(ConfigReader.getProperty("featuretitle"));
            ReusableMethods.bekle(2);
            extentTest.pass("Yeni Feature oluşturma ekranı dolduruldu.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureCreate"));

            hauseHeaven_yusufcelal.featureSaveAndExitButton.click();
            ReusableMethods.bekle(2);
            extentTest.pass("Yeni Feature kaydedildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FeatureSaved"));

// 11. Facility Link
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link görünür değil.");
            hauseHeaven_yusufcelal.facilityLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Facility link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLink"));

// Facility işlemleri
            hauseHeaven_yusufcelal.facilityCategoriesLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBox.isDisplayed(), "Facility search box görünür değil.");
            hauseHeaven_yusufcelal.facilitysearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Facility arama kutusu kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilitySearch"));

            hauseHeaven_yusufcelal.facilitysearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInput.isDisplayed(), "Facility search input görünür değil.");
            hauseHeaven_yusufcelal.facilitysearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Facility search input alanı kullanıldı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilitySearchInput"));

            hauseHeaven_yusufcelal.facilitysearchBoxInputNext.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.isDisplayed(), "Facility search select görünür değil.");
            hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);
            extentTest.pass("Facility ileri ve select butonları kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityNextSelect"));

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.isDisplayed(), "Facility Next Button görünür değil!");
            hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Facility Next Button tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityNextButton"));


            // Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilityLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
            extentTest.pass("Facility link görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkVisible"));
            hauseHeaven_yusufcelal.facilityLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
            extentTest.pass("Facility link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkClicked"));
// Scroll işlemi bitiş

// 12. Verify the Real Estate Categories Link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateCategoriesLink.isDisplayed(), "Real Estate Categories link görünür değil!");
            extentTest.pass("Real Estate Categories link görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("RealEstateCategoriesLinkVisible"));
            hauseHeaven_yusufcelal.realEstateCategoriesLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("Real Estate Categories link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("RealEstateCategoriesClicked"));

            hauseHeaven_yusufcelal.categoriesCategoriesLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBox.isDisplayed(), "Categories search box görünür değil!");
            extentTest.pass("Categories search box görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("CategoriesSearchBox"));
            hauseHeaven_yusufcelal.categoriessearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.categoriessearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInput.isDisplayed(), "Categories search box input görünür değil!");
            extentTest.pass("Categories search box input alanı kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("CategoriesSearchInput"));
            hauseHeaven_yusufcelal.categoriessearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.categoriessearchBoxInputNext.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.isDisplayed(), "Categories search select görünür değil!");
            extentTest.pass("Categories search select alanı kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("CategoriesSelect"));
            hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.click();
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.isDisplayed(), "Categories next button görünür değil!");
            extentTest.pass("Categories next butonu görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("CategoriesNextButtonVisible"));
            hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Categories next butonuna tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("CategoriesNextClicked"));
// Scroll işlemi bitiş

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriesLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link görünür değil!");
            extentTest.pass("Facility link tekrar görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkVisible2"));
            hauseHeaven_yusufcelal.facilityLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
            extentTest.pass("Facility link'e tekrar tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkClicked2"));
// Scroll işlemi bitiş

// 13. Verify the RealEstate Type Link in the left menu
            Assert.assertTrue(hauseHeaven_yusufcelal.realEstateTypeLink.isDisplayed(), "RealEstate Type link görünür değil!");
            extentTest.pass("RealEstate Type link görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("RealEstateTypeLink"));
            hauseHeaven_yusufcelal.realEstateTypeLink.click();
            ReusableMethods.bekle(1);
            extentTest.pass("RealEstate Type link'e tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("RealEstateTypeClicked"));

            hauseHeaven_yusufcelal.typeCategoriesLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBox));
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBox.isDisplayed(), "Type search box görünür değil!");
            extentTest.pass("Type search box görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypeSearchBox"));
            hauseHeaven_yusufcelal.typesearchBox.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.typesearchBoxInput.click();
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInput.isDisplayed(), "Type search box input görünür değil!");
            extentTest.pass("Type search input alanı kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypeSearchInput"));
            hauseHeaven_yusufcelal.typesearchBoxInput.sendKeys(Keys.ENTER);
            ReusableMethods.bekle(1);

            hauseHeaven_yusufcelal.typesearchBoxInputNext.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputSelect));
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputSelect.isDisplayed(), "Type search select görünür değil!");
            extentTest.pass("Type search select alanı kontrol edildi.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypeSearchSelect"));
            hauseHeaven_yusufcelal.typesearchBoxInputSelect.click();
            ReusableMethods.bekle(1);

// Scroll işlemi
            jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typesearchBoxInputNextButton);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputNextButton.isDisplayed(), "Type next button görünür değil!");
            extentTest.pass("Type next butonu görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypeNextButton"));
            hauseHeaven_yusufcelal.typesearchBoxInputNextButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputNextButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Type next butonuna tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypeNextClicked"));
// Scroll işlemi bitiş

            hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton));
            ReusableMethods.bekle(2);
            extentTest.pass("Type previous butonuna tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("TypePrevious"));

// Scroll işlemi
            jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typeCategoriesLink);
            ReusableMethods.bekle(2);
            Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link görünür değil!");
            extentTest.pass("Facility link görünür durumda doğrulandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkAfterType"));
            hauseHeaven_yusufcelal.facilityLink.click();
            wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
            ReusableMethods.bekle(2);
            extentTest.pass("Facility link'e tekrar tıklandı.")
                    .addScreenCaptureFromPath(ReusableMethods.getScreenshot("FacilityLinkClickedAfterType"));
// Scroll işlemi bitiş


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
