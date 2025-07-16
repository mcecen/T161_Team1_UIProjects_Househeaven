package tests.US025;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.print.attribute.standard.RequestingUserName;

import static utilities.Driver.driver;

public class TC_001 {

    @Test
    public void registeredUserCanAccessBlogPost() throws InterruptedException {
        HauseheavenPage hauseheavenPage = new HauseheavenPage();

        // Navigate to URL
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);

        // click the "Sign In" button
        Assert.assertTrue(hauseheavenPage.signInButton.isDisplayed());
        ReusableMethods.bekle(1);
        hauseheavenPage.signInButton.click();
        ReusableMethods.bekle(1);

        //Verify that username and password fields are displayed
        Assert.assertTrue(hauseheavenPage.emailField.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(hauseheavenPage.passwordField.isDisplayed());


        // enter the email and password
        hauseheavenPage.emailField.sendKeys("fulyanermin");
        ReusableMethods.bekle(1);
        hauseheavenPage.passwordField.sendKeys("Heaven.0620");

        // Click the login button
        Assert.assertTrue(hauseheavenPage.loginButton.isDisplayed());
        hauseheavenPage.loginButton.click();

        ReusableMethods.bekle(1);

        // Go to Blog Page
        Assert.assertTrue(hauseheavenPage.blogLink.isDisplayed());
        hauseheavenPage.blogLink.click();

        ReusableMethods.bekle(1);


        // Scroll to third blog post

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogContinueButton);
        Thread.sleep(1000);

        // View "Continue" button and click it

        Assert.assertTrue(hauseheavenPage.thirdBlogContinueButton.isDisplayed());

        ReusableMethods.bekle(1);

        hauseheavenPage.thirdBlogContinueButton.click();

        ReusableMethods.bekle(1);

        // Verify blog detail page
        Assert.assertTrue(hauseheavenPage.thirdBlogPostTitle.isDisplayed());
        ReusableMethods.bekle(1);

        // Scroll and verify content and image

        //image
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogPostImage);
        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.thirdBlogPostImage.isDisplayed(), "Resim görünmüyor.");

        ReusableMethods.bekle(1);

        //content
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogPostContent);
        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.thirdBlogPostContent.isDisplayed());
        ReusableMethods.bekle(1);

        // Close the page
        Driver.quitDriver();











    }
}
