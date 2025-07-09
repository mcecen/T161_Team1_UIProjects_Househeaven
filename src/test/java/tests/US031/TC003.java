package tests.US031;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {

    // The admin user should see that the address https://qa.hauseheaven.com/admin/ is displayed.
    // The user should see that the Admin Dashboard homepage is opened and accessible,
    // and that the Blog link on the left menu is reachable by clicking.
    // The user should see that their username "Yusuf Celal" is displayed in the top right menu.

    @Test
    public void test01() {
        WebDriver driver = Driver.getDriver();

        // 1. Navigate to the login URL
        driver.get("https://qa.hauseheaven.com/admin/login");
        ReusableMethods.bekle(2);

        // 2. Verify the login page URL
        String expectedUrl = "https://qa.hauseheaven.com/admin/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL verification passed!");

        // 3. Locate and click the Email/Username input field
        By emailInput = By.xpath("//*[@id='emailGroup']//input");
        WebElement emailElement = driver.findElement(emailInput);
        Assert.assertTrue(emailElement.isDisplayed(), "Email input field is visible.");
        emailElement.click();
        emailElement.sendKeys(ConfigReader.getProperty("admin-yusuf"));

        // 4. Locate and click the Password input field
        By passwordBox = By.xpath("//*[@id='passwordGroup']//input");
        WebElement passwordElement = driver.findElement(passwordBox);
        Assert.assertTrue(passwordElement.isDisplayed(), "Password input field is visible.");
        passwordElement.click();
        passwordElement.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));

        // 5. Locate and click the Sign In button
        By signInButton = By.xpath("//button[@type='submit']");
        Assert.assertTrue(driver.findElement(signInButton).isDisplayed(), "Sign In button is visible.");
        driver.findElement(signInButton).click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification passed!");

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");

        // 8. Verify the Blog link in the left menu
        By realEstate = By.xpath("//*[@id=\"cms-plugins-real-estate\"]/a/span[1]");
        Assert.assertTrue(driver.findElement(realEstate).isDisplayed(), "Blog link is visible in the left menu.");
        driver.findElement(realEstate).click();
        ReusableMethods.bekle(2);

        // 9. Verify the Post link in the left menu
        By properties = By.xpath("//*[@id=\"cms-plugins-property\"]/a");
        Assert.assertTrue(driver.findElement(properties).isDisplayed(), "Post link is visible in the left menu.");
        driver.findElement(properties).click();
        ReusableMethods.bekle(2);
//
//        // 10. Verify the Categories link in the left menu
//        By CategoriesLink = By.xpath("//*[@id=\"cms-plugins-blog-categories\"]/a");
//        Assert.assertTrue(driver.findElement(CategoriesLink).isDisplayed(), "Categories link is visible in the left menu.");
//        driver.findElement(CategoriesLink).click();
//        ReusableMethods.bekle(2);
//
//        // 11. Verify the Tags link in the left menu
//        By TagsLink = By.xpath("//*[@id=\"cms-plugins-blog-tags\"]/a");
//        Assert.assertTrue(driver.findElement(TagsLink).isDisplayed(), "Tags link is visible in the left menu.");
//        driver.findElement(TagsLink).click();
//        ReusableMethods.bekle(2);
//
//        // 12. Verify the user name in the top-right corner
//        WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/ul/li[4]/a"));
//        String expectedUserName = "Yusuf Celal";
//        String actualUserName = userNameElement.getText();
//        ReusableMethods.bekle(2);
//
//        // Final assertion for user name
//        Assert.assertEquals(actualUserName, expectedUserName, "User name is not displayed correctly!");
//        ReusableMethods.bekle(3);

        // Close the driver
        Driver.quitDriver();
    }
}
