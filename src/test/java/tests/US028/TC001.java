package tests.US028;

import com.sun.nio.sctp.Association;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC001 {

    @Test
    public void test01() {
        WebDriver driver = Driver.getDriver();

        // Go to the URL
        driver.get("https://qa.hauseheaven.com/admin/login");
        ReusableMethods.bekle(4);

        // Check the URL
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");

        // Close the browser
        Driver.quitDriver();
    }

}

