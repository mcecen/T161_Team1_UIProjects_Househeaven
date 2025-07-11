package tests.US006;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC003 {
    @Test
    public void test01(){
        HauseheavenPage hauseheavenPage = new HauseheavenPage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        String expextedPageUrl= "https://qa.hauseheaven.com/";
        String actualPageUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualPageUrl,expextedPageUrl);

        Assert.assertTrue(hauseheavenPage.hauseheavenLogo.isDisplayed());

        Driver.getDriver().findElement(By.linkText("Listing")).click();

        WebElement propertyCount = Driver.getDriver().findElement(By.xpath("//*[@class='m-0']"));

        System.out.println(propertyCount.getText());

        String expectedPropertyCountDisplay= "found";
        String actualPropertyCountDisplay= propertyCount.getText().toLowerCase();
        Assert.assertTrue(actualPropertyCountDisplay.contains(expectedPropertyCountDisplay));

        List<WebElement> categoryDropdownMenu= Driver.getDriver().findElements(By.xpath("//span[@class='select2-selection__placeholder']"));

        for(WebElement categories : categoryDropdownMenu){
            System.out.println(categories.isDisplayed() +" "+ categories.getText());


        }
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        WebElement dropdownCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Category']")));
        dropdownCategory.click();
        ReusableMethods.bekle(1);

        WebElement categoryOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[normalize-space()='Apartment']")));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", categoryOption);
        js.executeScript("arguments[0].click();", categoryOption);

// SEÇİM YAPILDI MI DOĞRULA
        WebElement selectedValue = Driver.getDriver().findElement(By.id("select2-ptypes-container"));
        String actualSelectedText = selectedValue.getText();

        Assert.assertEquals(actualSelectedText.trim(), "Apartment");





    }
}
