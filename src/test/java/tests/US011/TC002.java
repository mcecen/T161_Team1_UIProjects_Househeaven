package tests.US011;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TC002 {

    @Test
    public void submittingFormAndSendingMessage() throws InterruptedException {
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

        //5. Scroll the page until "Send Message" button is displayed
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.sendMessageButton);

        Thread.sleep(1000);


        // 6. Verify that fields are visible and clickable
        Assert.assertTrue(hauseheavenPage.nameText.isDisplayed() && hauseheavenPage.nameBox.isEnabled());
        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.formEmailText.isDisplayed() && hauseheavenPage.formEmailBox.isEnabled());
        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.subjectText.isDisplayed() && hauseheavenPage.subjectBox.isEnabled());
        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.phoneText.isDisplayed() && hauseheavenPage.phoneBox.isEnabled());
        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.messageText.isDisplayed() && hauseheavenPage.messageBox.isEnabled());
        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.sendMessageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // 7. Submit the form and send message
        hauseheavenPage.nameBox.sendKeys("Fulya");
        hauseheavenPage.formEmailBox.sendKeys("fulyatest@hotmail.com");
        hauseheavenPage.subjectBox.sendKeys("Test Subject");
        hauseheavenPage.phoneBox.sendKeys("05001112233");
        hauseheavenPage.messageBox.sendKeys("Bu bir test mesajıdır.");

        ReusableMethods.bekle(1);
        hauseheavenPage.sendMessageButton.click();

        // Verify that "Send message successfully!" text appears
        Assert.assertTrue(hauseheavenPage.sendMessageSuccessfullyText.isDisplayed(), "Send message successfully! yazısı görünmedi.");
        ReusableMethods.bekle(1);

        // Refresh the page
        Driver.getDriver().navigate().refresh();
        Thread.sleep(1000);

        // Leave the fields blank

        hauseheavenPage.sendMessageButton.click();

        ReusableMethods.bekle(1);

        Assert.assertTrue(hauseheavenPage.nameRequiredWarning.isDisplayed());
        Assert.assertTrue(hauseheavenPage.emailRequiredWarning.isDisplayed());
        Assert.assertTrue(hauseheavenPage.messageRequiredWarning.isDisplayed());


        // Close the page
        Driver.quitDriver();








    }

}


