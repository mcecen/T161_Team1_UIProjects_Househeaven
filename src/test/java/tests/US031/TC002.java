package tests.US031;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {



//    The user opens the browser page.
//    The user clicks on the browser search bar.
//    The user types into the search bar.
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
        By emailInput = By.xpath("//*[@id='emailGroup']//input");
        WebElement emailElement = driver.findElement(emailInput);
        Assert.assertTrue(emailElement.isDisplayed(), "Email input field is not visible.");
        emailElement.click();
        emailElement.sendKeys(ConfigReader.getProperty("admin-yusuf"));

        // 4. Locate and click the Password input field
        By passwordBox = By.xpath("//*[@id='passwordGroup']//input");
        WebElement passwordElement = driver.findElement(passwordBox);
        Assert.assertTrue(passwordElement.isDisplayed(), "Password input field is not visible.");
        passwordElement.click();
        passwordElement.sendKeys(ConfigReader.getProperty("admin-yusuf-password"));


        // 5. Locate and click the Sign In button
        By signInButton = By.xpath("//button[@type='submit']");
        Assert.assertTrue(driver.findElement(signInButton).isDisplayed(), "Sign In button is not visible.");
        driver.findElement(signInButton).click();
        ReusableMethods.bekle(3);

        // 6. Verify the Admin Dashboard URL
        String dashboardUrl = "https://qa.hauseheaven.com/admin";
        Assert.assertEquals(driver.getCurrentUrl(), dashboardUrl, "Dashboard URL verification failed!");

        // 7. Verify visibility of main dashboard elements
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Active properties')]")).isDisplayed(), "Active properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Pending properties')]")).isDisplayed(), "Pending properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Expired properties')]")).isDisplayed(), "Expired properties section is visible.");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Agents')]")).isDisplayed(), "Agents section is visible.");

        Driver.quitDriver();
    }

}


