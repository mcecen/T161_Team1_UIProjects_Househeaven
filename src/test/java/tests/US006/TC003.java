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

     SwHauseheavenPage swHauseheavenPage = new SwHauseheavenPage();
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

    }
   
 }





