package tests.US034;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC002 {

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
    public void test01() {
        WebDriver driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor jsdown = (JavascriptExecutor) driver;
        JavascriptExecutor jsup = (JavascriptExecutor) driver;

        // Go to the URL
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
        ReusableMethods.bekle(1);

        // Check the URL
        String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");


        // 3. Locate and click the Email/Username input field
        Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));


        // 4. Locate and click the Password input field
        Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));

        // 5. Locate and click the Sign In button
        Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_yusufcelal.signInButton.click();
        ReusableMethods.bekle(1);

        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");

        // 8. Verify the Real Estate link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.realEstateLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.realEstateLink.click();
        ReusableMethods.bekle(1);

        // 9. Verify the Property link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.propertyLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.propertyLink.click();
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.propertyCategoriesLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBox));
        Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBox.isDisplayed(), "Property search box is not visible.");
        hauseHeaven_yusufcelal.PropertysearchBox.sendKeys(ConfigReader.getProperty("bulkActions"));
        hauseHeaven_yusufcelal.PropertysearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.PropertysearchBoxInput.click();
        Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInput.isDisplayed(), "Property search box is not visible.");
        hauseHeaven_yusufcelal.PropertysearchBoxInput.sendKeys(ConfigReader.getProperty("PropertysearchBoxInputText"));
        hauseHeaven_yusufcelal.PropertysearchBoxInput.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.PropertysearchBoxInputNext.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputSelect));
        Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInputSelect.isDisplayed(), "Property search box is not visible.");
        hauseHeaven_yusufcelal.PropertysearchBoxInputSelect.sendKeys(ConfigReader.getProperty("PropertysearchBoxInputNextAll"));
        hauseHeaven_yusufcelal.PropertysearchBoxInputSelect.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        // Scroll işlemi
        jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputNextButton));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        hauseHeaven_yusufcelal.PropertysearchBoxInputPreviousButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.PropertysearchBoxInputPreviousButton));
        ReusableMethods.bekle(2);

        // Scroll işlemi
        jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featureLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.featureLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featureLink));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        // 10. Verify the Feature link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.featureLink.click();
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.featureCategoriesLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBox));
        Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBox.isDisplayed(), "Feature search box is not visible.");
        hauseHeaven_yusufcelal.featuresearchBox.sendKeys(ConfigReader.getProperty("featureBulkActions"));
        hauseHeaven_yusufcelal.featuresearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.featuresearchBoxInput.click();
        Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInput.isDisplayed(), "Feature search box is not visible.");
        hauseHeaven_yusufcelal.featuresearchBoxInput.sendKeys(ConfigReader.getProperty("FeaturesearchBoxInputText"));
        hauseHeaven_yusufcelal.featuresearchBoxInput.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.featuresearchBoxInputNext.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputSelect));
        Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputSelect.isDisplayed(), "Feature search box is not visible.");
        hauseHeaven_yusufcelal.featuresearchBoxInputSelect.sendKeys(ConfigReader.getProperty("FeaturesearchBoxInputNextAll"));
        hauseHeaven_yusufcelal.featuresearchBoxInputSelect.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        // Scroll işlemi
        jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featuresearchBoxInputNextButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.featuresearchBoxInputNextButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputNextButton));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        hauseHeaven_yusufcelal.featuresearchBoxInputPreviousButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featuresearchBoxInputPreviousButton));
        ReusableMethods.bekle(2);

        // Scroll işlemi
        jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.featureLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.featureLink.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.featureLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.featureLink));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        // 11. Verify the Facility Link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Facility link is not visible.");
        hauseHeaven_yusufcelal.facilityLink.click();
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.facilityCategoriesLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBox));
        Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBox.isDisplayed(), "Facility search box is not visible.");
        hauseHeaven_yusufcelal.facilitysearchBox.sendKeys(ConfigReader.getProperty("facilityBulkActions"));
        hauseHeaven_yusufcelal.facilitysearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.facilitysearchBoxInput.click();
        Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInput.isDisplayed(), "Facility search box is not visible.");
        hauseHeaven_yusufcelal.facilitysearchBoxInput.sendKeys(ConfigReader.getProperty("FacilitysearchBoxInputText"));
        hauseHeaven_yusufcelal.facilitysearchBoxInput.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.facilitysearchBoxInputNext.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect));
        Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.isDisplayed(), "Facility search box is not visible.");
        hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.sendKeys(ConfigReader.getProperty("FacilitysearchBoxInputNextAll"));
        hauseHeaven_yusufcelal.facilitysearchBoxInputSelect.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        // Scroll işlemi
        jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputNextButton));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        hauseHeaven_yusufcelal.facilitysearchBoxInputPreviousButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilitysearchBoxInputPreviousButton));
        ReusableMethods.bekle(2);

        // Scroll işlemi
        jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.facilityLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.facilityLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        // 12. Verify the Real Estate Categories Link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.realEstateCategoriesLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.realEstateCategoriesLink.click();
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.categoriesCategoriesLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBox));
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBox.isDisplayed(), "categories search box is not visible.");
        hauseHeaven_yusufcelal.categoriessearchBox.sendKeys(ConfigReader.getProperty("categoriesBulkActions"));
        hauseHeaven_yusufcelal.categoriessearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.categoriessearchBoxInput.click();
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInput.isDisplayed(), "Categories search box is not visible.");
        hauseHeaven_yusufcelal.categoriessearchBoxInput.sendKeys(ConfigReader.getProperty("categoriessearchBoxInputText"));
        hauseHeaven_yusufcelal.categoriessearchBoxInput.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.categoriessearchBoxInputNext.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect));
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.isDisplayed(), "categories search box is not visible.");
        hauseHeaven_yusufcelal.categoriessearchBoxInputSelect.click();
        ReusableMethods.bekle(1);

        // Scroll işlemi
        jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputNextButton));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        hauseHeaven_yusufcelal.categoriessearchBoxInputPreviousButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.categoriessearchBoxInputPreviousButton));
        ReusableMethods.bekle(2);

        // Scroll işlemi
        jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.categoriesLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.facilityLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş


        // 13. Verify the RealEstate Type Link in the left menu
        Assert.assertTrue(hauseHeaven_yusufcelal.realEstateTypeLink.isDisplayed(), "Blog link is not visible.");
        hauseHeaven_yusufcelal.realEstateTypeLink.click();
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.typeCategoriesLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBox));
        Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBox.isDisplayed(), "type search box is not visible.");
        hauseHeaven_yusufcelal.typesearchBox.sendKeys(ConfigReader.getProperty("typeBulkActions"));
        hauseHeaven_yusufcelal.typesearchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.typesearchBoxInput.click();
        Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInput.isDisplayed(), "type search box is not visible.");
        hauseHeaven_yusufcelal.typesearchBoxInput.sendKeys(ConfigReader.getProperty("typesearchBoxInputText"));
        hauseHeaven_yusufcelal.typesearchBoxInput.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);

        hauseHeaven_yusufcelal.typesearchBoxInputNext.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputSelect));
        Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputSelect.isDisplayed(), "type search box is not visible.");
        hauseHeaven_yusufcelal.typesearchBoxInputSelect.click();
        ReusableMethods.bekle(1);

        // Scroll işlemi
        jsdown.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typesearchBoxInputNextButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.typesearchBoxInputNextButton.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.typesearchBoxInputNextButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputNextButton));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş

        hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.typesearchBoxInputPreviousButton));
        ReusableMethods.bekle(2);

        // Scroll işlemi
        jsup.executeScript("arguments[0].scrollIntoView(true);", hauseHeaven_yusufcelal.typeCategoriesLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(hauseHeaven_yusufcelal.facilityLink.isDisplayed(), "Hedef alan görünür değil!");
        hauseHeaven_yusufcelal.facilityLink.click();
        wait.until(ExpectedConditions.visibilityOf(hauseHeaven_yusufcelal.facilityLink));
        ReusableMethods.bekle(2);
        // Scroll işlemi bitiş


        Driver.quitDriver();
    }
}
