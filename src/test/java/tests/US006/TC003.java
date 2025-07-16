package tests.US006;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import pages.SwHauseheavenPage;
import utilities.ArrowDown;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC003 {

   /*  SwHauseheavenPage swHauseheavenPage = new SwHauseheavenPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test

    public void test001() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        swHauseheavenPage.listignLink.click();

        swHauseheavenPage.searchBox.sendKeys("ankara");
        ReusableMethods.bekle(1);

        swHauseheavenPage.cityDropdown.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.citySearchbox)
                .sendKeys("alameda")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(1);

        ArrowDown.arrowDown(2);

        // Scroll to category
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.category);
        ReusableMethods.bekle(1);

        swHauseheavenPage.category.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.categorySearchbox)
                .sendKeys("villa")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(3);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.type);
        ReusableMethods.bekle(1);

        swHauseheavenPage.type.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.typeSearchbox)
                .sendKeys("sale")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.minPrice);
        ReusableMethods.bekle(1);

        swHauseheavenPage.minPrice.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.minPriceSearchbox)
                .sendKeys("500")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.maxPrice);
        ReusableMethods.bekle(1);

        swHauseheavenPage.maxPrice.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.maxPriceSearch)
                .sendKeys("10000")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.bedroom);
        ReusableMethods.bekle(1);

        swHauseheavenPage.bedroom.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.bedroomSearchbox)
                .sendKeys("3")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.bathroom);
        ReusableMethods.bekle(1);

        swHauseheavenPage.bathroom.click();
        ReusableMethods.bekle(1);

        actions.click(swHauseheavenPage.bathroomSearchbox)
                .sendKeys("2")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        ArrowDown.arrowDown(8);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.minArea);
        swHauseheavenPage.minArea.sendKeys("50");
        ReusableMethods.bekle(1);
        swHauseheavenPage.maxArea.sendKeys("100");
        ReusableMethods.bekle(3);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.wifiCheckbox);
        ReusableMethods.bekle(1);
        swHauseheavenPage.wifiCheckbox.click();
        ReusableMethods.bekle(1);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.parkingCheckbox);
        swHauseheavenPage.parkingCheckbox.click();
        ReusableMethods.bekle(1);

        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", swHauseheavenPage.findNewHomeButton);
        ReusableMethods.bekle(1);
        swHauseheavenPage.findNewHomeButton.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(swHauseheavenPage.resultsText.isDisplayed());
        Assert.assertEquals(swHauseheavenPage.resultsText.getText(), "0 Results");

        ReusableMethods.bekle(1);
        Driver.quitDriver();

        public void test01 () {
            // 1. Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            // 2. Cookie banner varsa kapat
            try {
                WebElement cookieAcceptButton = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(@class,'js-cookie-consent-agree')]")));
                cookieAcceptButton.click();
                ReusableMethods.bekle(1);
                System.out.println("Cookie banner kapatıldı.");
            } catch (Exception e) {
                System.out.println("Cookie banner görünmedi, devam ediliyor.");
            }

            // 3. Listing sayfasına geç
            Driver.getDriver().findElement(By.linkText("Listing")).click();
            ReusableMethods.bekle(2); // sayfa yüklenmesi için bekle

            // 4. Sayfayı aşağı kaydır
            js.executeScript("window.scrollBy(0,500);");
            ReusableMethods.bekle(1);

            // 5. Category dropdown'ını JS ile aç
            WebElement categoryDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//span[@id='select2-ptypes-container']/ancestor::span[@role='combobox']")));
            js.executeScript("arguments[0].scrollIntoView(true);", categoryDropdown);
            js.executeScript("arguments[0].click();", categoryDropdown);
            ReusableMethods.bekle(1);

            // 6. Apartment seçeneğine JS ile tıkla
            WebElement apartmentOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@id,'select2-ptypes-result') and normalize-space()='Apartment']")));
            js.executeScript("arguments[0].scrollIntoView(true);", apartmentOption);
            js.executeScript("arguments[0].click();", apartmentOption);
            ReusableMethods.bekle(1);

            // 7. Seçilen değeri kontrol et
            WebElement selectedValue = Driver.getDriver().findElement(By.id("select2-ptypes-container"));
            String actualSelectedText = selectedValue.getText().trim();
            System.out.println("Seçilen kategori: " + actualSelectedText);
            Assert.assertEquals(actualSelectedText, "Apartment");

            // 8. Sayfayı kapat
            Driver.closeDriver();

    */

        }




