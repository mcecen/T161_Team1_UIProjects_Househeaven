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

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

    @Test
    public void test01() {

        hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();
            // 1. Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("dashboard-yusuf-admin"));
            ReusableMethods.bekle(4);

        // Check the URL
        String expectedUrl = HauseHeaven_yusufcelal.AdminLink;
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL check failed!");

        // Close the browser
        Driver.quitDriver();
    }

}

