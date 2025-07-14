package tests.US028;

import com.sun.nio.sctp.Association;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC001 {

    @Test
    public void test01() {
            WebDriver driver = Driver.getDriver(); // sadece bir kere çağır!

            // 1. Sayfaya git
            driver.get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(4);

        // Check the URL
        String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");

        // Close the browser
        Driver.quitDriver();
    }

}

