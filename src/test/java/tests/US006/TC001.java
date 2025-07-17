package tests.US006;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {


    @Test
    public  void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        String expectedUrl= "https://qa.hauseheaven.com/";
        String actualURl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURl.contains(expectedUrl));

        WebElement PageLogo= Driver.getDriver().findElement(By.xpath("//img[@class='logo']"));
        Assert.assertTrue(PageLogo.isDisplayed());

        WebElement propertyLink= Driver.getDriver().findElement(By.linkText("Listing"));

        propertyLink.click();

        WebElement ListingPageShowResult= Driver.getDriver().findElement(By.xpath("//h4[@class='m-0']"));

        String expectedTextResult= "Results";
        String actualTextResult= ListingPageShowResult.getText();

        Assert.assertTrue(actualTextResult.contains(expectedTextResult));

        



    }
}
