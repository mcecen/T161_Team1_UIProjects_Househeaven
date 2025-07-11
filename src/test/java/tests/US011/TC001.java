package tests.US011;

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
    public void verifyContactPageContent() throws InterruptedException {
        HauseheavenPage hauseheavenPage = new HauseheavenPage();

        // 1. Go to the url "https://qa.hauseheaven.com/"
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // 2. Verify the url opens
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("hauseheaven"));

        ReusableMethods.bekle(1);

        // 3. Verify that "Contact" link is displayed and clickable

        Assert.assertTrue(hauseheavenPage.contactLink.isDisplayed(), "Contact linki görünmüyor.");

        ReusableMethods.bekle(1);
        Assert.assertTrue(hauseheavenPage.contactLink.isEnabled(), "Contact linki tıklanabilir değil.");

        ReusableMethods.bekle(1);

        // 4. Click the "Contact" link
        hauseheavenPage.contactLink.click();

        ReusableMethods.bekle(1);

        // 5. Verify that "Get In Touch" text is displayed

        Assert.assertTrue(hauseheavenPage.contactGetInTouchText.isDisplayed(), "'Get In Touch' yazısı görünmüyor.");
        ReusableMethods.bekle(1);

        // 6. Scroll down the page until Contact Info is visible

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.contactPhoneInfo);

        Thread.sleep(1000);

        //7. Verify that the address is displayed on the sidebar

        Assert.assertTrue(hauseheavenPage.contactAdressInfo.isDisplayed(), "Adres görünmüyor.");

        //8. Verify that the email address is displayed on the sidebar
        Assert.assertTrue(hauseheavenPage.contactEmailInfo.isDisplayed(), "Email görünmüyor.");

        //9. Verify that the phone number is displayed on the sidebar
        Assert.assertTrue(hauseheavenPage.contactPhoneInfo.isDisplayed(), "Telefon numarası görünmüyor.");


        ReusableMethods.bekle(2);

        // 10. Close the page

        Driver.quitDriver();




























    }
}


