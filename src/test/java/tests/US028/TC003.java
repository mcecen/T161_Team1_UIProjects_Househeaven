package tests.US028;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {

    // The admin user should see that the address https://qa.hauseheaven.com/admin/ is displayed.
    // The user should see that the Admin Dashboard homepage is opened and accessible,
    // and that the Blog link on the left menu is reachable by clicking.
    // The user should see that their username "Yusuf Celal" is displayed in the top right menu.

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

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
        Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
        hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));


        // 4. Locate and click the Password input field
        Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));

        // 5. Locate and click the Sign In button
        Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_yusufcelal.signInButton.click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements and Active properties
        Assert.assertTrue(hauseHeaven_yusufcelal.activeProperties.isDisplayed(), "Active properties section is visible.");
        hauseHeaven_yusufcelal.activeProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 8. Verify visibility of main dashboard elements and Pending properties
        Assert.assertTrue(hauseHeaven_yusufcelal.pendingProperties.isDisplayed(), "Pending properties section is visible.");
        hauseHeaven_yusufcelal.pendingProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 9. Verify visibility of main dashboard elements and Expired properties
        Assert.assertTrue(hauseHeaven_yusufcelal.expiredProperties.isDisplayed(), "Expired properties section is visible.");
        hauseHeaven_yusufcelal.expiredProperties.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 10. Verify visibility of main dashboard elements and Agents
        Assert.assertTrue(hauseHeaven_yusufcelal.agents.isDisplayed(), "Expired properties section is visible.");
        hauseHeaven_yusufcelal.agents.click();
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);

        // 11. Verify the user name in the top-right corner
        Assert.assertTrue(hauseHeaven_yusufcelal.userName.isDisplayed(), "User name field is not visible.");
        String expectedUserName = "Yusuf Celal";
        String actualUserName = hauseHeaven_yusufcelal.userName.getText();
        ReusableMethods.bekle(2);

        // Final assertion for user name
        Assert.assertEquals(actualUserName, expectedUserName, "User name is not displayed correctly!");
        ReusableMethods.bekle(3);

        // Close the driver
        Driver.quitDriver();
    }
}
