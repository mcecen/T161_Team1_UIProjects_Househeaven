package tests.US007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TC001 {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String expextedUrl = "https://qa.hauseheaven.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expextedUrl);

        Driver.getDriver().findElement(By.linkText("Listing")).click();

        WebElement listingFoundResulttext = Driver.getDriver().findElement(By.xpath("//h4[@class='m-0']"));
        String expectedListingResult= "found";
        String actualListingPageFoundText= listingFoundResulttext.getText().toLowerCase();
        Assert.assertTrue(actualListingPageFoundText.contains(expectedListingResult));
        

        }

    }

