package tests.US028;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHeaven_yusufcelal;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {

//    The user opens the browser page.
//    The user clicks on the browser search bar.
//    The user types  into the search bar.
//    The user searches for the URL typed into the search bar. (Enter can be used)
//    The user sees the HOUSE HEAVEN admin login homepage.
//    The user sees the email/username text field.
//    The user clicks on the email/username text field.
//    The user enters into the email/username text field.
//    The user sees the Password text field.
//    The user clicks on the Password text field.
//    The user enters into the Password text field.
//    The user sees the Sign In button.
//    The user clicks on the Sign In button.
//    It is seen that the page can be accessed by clicking on the Sign In button.
//    The user sees that the Admin dashboard homepage has opened.
//    Admin user sees address displayed
//    Admin dashboard homepage opened
//    Active properties of User Admin dashboard homepage visible
//    Pending properties of User Admin dashboard homepage visible
//    Expired properties of User Admin dashboard homepage visible
//    Agents of User Admin dashboard homepage visible

    HauseHeaven_yusufcelal hauseHeaven_yusufcelal = new HauseHeaven_yusufcelal();

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

        // 3. Locate and click the Email/Username input field
        Assert.assertTrue(hauseHeaven_yusufcelal.emailInput.isDisplayed(), "Email input field is not visible.");
        ReusableMethods.bekle(2);

        hauseHeaven_yusufcelal.emailInput.sendKeys(ConfigReader.getProperty("admin-yusuf"));
        ReusableMethods.bekle(2);

        // 4. Locate and click the Password input field
        Assert.assertTrue(hauseHeaven_yusufcelal.passwordInput.isDisplayed(), "Password input field is not visible.");
        hauseHeaven_yusufcelal.passwordInput.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));
        ReusableMethods.bekle(2);

        // 5. Locate and click the Sign In button
        Assert.assertTrue(hauseHeaven_yusufcelal.signInButton.isDisplayed(), "Sign In button is not visible.");
        hauseHeaven_yusufcelal.signInButton.click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        Assert.assertTrue(hauseHeaven_yusufcelal.dashboardLink.isDisplayed(), "Dashboard link is not visible.");
        hauseHeaven_yusufcelal.dashboardText.click();

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");

        Driver.quitDriver();
    }

}


