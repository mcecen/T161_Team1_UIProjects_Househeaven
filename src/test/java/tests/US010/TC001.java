package tests.US010;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC001 {
    @Test
    public void blogPostDetailsTest() throws InterruptedException {


        // Go to homepage

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        ReusableMethods.bekle(1);

        // Verify that the url contains "hauseheaven"

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("hauseheaven"));

        ReusableMethods.bekle(1);


        // Verify that Blog link is displayed

        HauseheavenPage hauseheavenPage = new HauseheavenPage();
        Assert.assertTrue(hauseheavenPage.blogLink.isDisplayed());

        ReusableMethods.bekle(1);

        // Click the Blog link

        hauseheavenPage.blogLink.click();

        ReusableMethods.bekle(1);

        // Verify that blog link opens

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.hauseheaven.com/blog"));

        ReusableMethods.bekle(1);

        // View and click third blog post

        // önce 3. blog yazısını görene kadar sayfayı aşağı kaydırmalıyız

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogContinueButton);
        Thread.sleep(1000);


        // View "Continue" button and click it

        Assert.assertTrue(hauseheavenPage.thirdBlogContinueButton.isDisplayed());

        ReusableMethods.bekle(1);

        hauseheavenPage.thirdBlogContinueButton.click();

        ReusableMethods.bekle(1);

        //Verify that Blog post detail page opens

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.hauseheaven.com/news/benefit-of-investing"));

        ReusableMethods.bekle(1);

        //Verify that the header is displayed

        Assert.assertTrue(hauseheavenPage.thirdBlogPostHeader.isDisplayed(), "Blog başlığı görünmüyor.");

        ReusableMethods.bekle(1);


        //Verify that the blog post's image is displayed

        //önce image görünene kadar kaydıralım

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogPostImage);
        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.thirdBlogPostImage.isDisplayed(), "Resim görünmüyor.");

        ReusableMethods.bekle(1);

        // Verify that third blog post's title is displayed

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogPostTitle);
        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.thirdBlogPostTitle.isDisplayed());

        ReusableMethods.bekle(1);

        // Verify that third blog post's content is displayed

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.thirdBlogPostContent);
        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.thirdBlogPostContent.isDisplayed());


        // Close the page
        Driver.quitDriver();












    }





}


