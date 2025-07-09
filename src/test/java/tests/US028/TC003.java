package tests.US028;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_28;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {

    // The admin user should see that the address https://qa.hauseheaven.com/admin/ is displayed.
    // The user should see that the Admin Dashboard homepage is opened and accessible,
    // and that the Blog link on the left menu is reachable by clicking.
    // The user should see that their username "Yusuf Celal" is displayed in the top right menu.

    HauseHeaven_28 hauseHeaven_28 = new HauseHeaven_28();

    @Test
    public void test01() {
        WebDriver driver = Driver.getDriver();

        // 1. Navigate to the URL
        driver.get("https://qa.hauseheaven.com/admin/login");
        ReusableMethods.bekle(2);

        // 2. Verify the URL
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification failed!");

        // 3. Locate and click the Email/Username input field
        Assert.assertTrue(hauseHeaven_28.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_28.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));


        // 4. Locate and click the Password input field
        Assert.assertTrue(hauseHeaven_28.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_28.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));

        // 5. Locate and click the Sign In button
        Assert.assertTrue(hauseHeaven_28.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_28.signInButton.click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification passed!");
        ReusableMethods.bekle(2);

        // 7. Verify visibility of main dashboard elements and Active properties
        Assert.assertTrue(hauseHeaven_28.activeProperties.isDisplayed(), "Active properties section is visible.");
        hauseHeaven_28.activeProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 8. Verify visibility of main dashboard elements and Pending properties
        Assert.assertTrue(hauseHeaven_28.pendingProperties.isDisplayed(), "Pending properties section is visible.");
        hauseHeaven_28.pendingProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 9. Verify visibility of main dashboard elements and Expired properties
        Assert.assertTrue(hauseHeaven_28.expiredProperties.isDisplayed(), "Expired properties section is visible.");
        hauseHeaven_28.expiredProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 10. Verify visibility of main dashboard elements and Agents
        Assert.assertTrue(hauseHeaven_28.agents.isDisplayed(), "Expired properties section is visible.");
        hauseHeaven_28.agents.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 11. Verify the user name in the top-right corner
        Assert.assertTrue(hauseHeaven_28.userName.isDisplayed(), "User name field is not visible.");
        String expectedUserName = "Yusuf Celal";
        String actualUserName = hauseHeaven_28.userName.getText();
        ReusableMethods.bekle(2);

        // Final assertion for user name
        Assert.assertEquals(actualUserName, expectedUserName, "User name is not displayed correctly!");
        ReusableMethods.bekle(3);

        // Close the driver
        Driver.quitDriver();
    }
}
