package tests.US003;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class TC_001 {
    @Test

    public void userCanPageAndSeeBodyElements(){
        WebDriver driver= Driver.getDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("url");

        wait.until(ExpectedConditions.titleIs("Hause Heaven"));

        Assert.assertEquals(driver.getCurrentUrl(), "Url");






    }


}
