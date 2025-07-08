package tests.US009;

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
    public void verifyAgentDetails() throws InterruptedException {

        // Navigate to site
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        ReusableMethods.bekle(2);

        // Confirm that the url contains "hauseheaven".

        String expectedUrlIcerik = "hauseheaven";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        ReusableMethods.bekle(1);

        // Confirm that the homepage opens by displaying hauseheaven icon.

        HauseheavenPage hauseheavenPage = new HauseheavenPage();

        Assert.assertTrue(hauseheavenPage.hauseheavenLogo.isDisplayed());
        ReusableMethods.bekle(1);

        // Check "Agents" text in header and click

        Assert.assertTrue(hauseheavenPage.agentsLink.isDisplayed());
        ReusableMethods.bekle(2);
        hauseheavenPage.agentsLink.click();

        ReusableMethods.bekle(1);

        // Verify that first agent card is visible

        // once ilk karta tiklamak icin sayfayi biraz asagi kaydirmamiz lazim
        // ilk kartı gorene kadar kaydirmak icin

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hauseheavenPage.firstAgentsCard);

        Thread.sleep(1000); // yuklenene kadar bekle

        Assert.assertTrue(hauseheavenPage.firstAgentsCard.isDisplayed());

        ReusableMethods.bekle(1);

        // Verify that the "View" button is displayed on the card.

        Assert.assertTrue(hauseheavenPage.viewButton.isDisplayed());

        ReusableMethods.bekle(1);

        // Click the "View" button

        hauseheavenPage.viewButton.click();

        //Verify that agent's property count is displayed

        Assert.assertTrue(hauseheavenPage.agentsPropertyCount.isDisplayed());

        ReusableMethods.bekle(2);


        // Verify that "Agent info" text is visible

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hauseheavenPage.agentInfoText);

        Thread.sleep(1000);

        Assert.assertTrue(hauseheavenPage.agentInfoText.isDisplayed());

        ReusableMethods.bekle(1);

        //Verify that Agents full name is visible
        // Agent's full name "Ceo" başlığının altında yazılı

        hauseheavenPage.ceoText.isDisplayed();

        ReusableMethods.bekle(1);

        // Verify that Agent's email address is visible

        Assert.assertTrue(hauseheavenPage.emailText.isDisplayed());

        ReusableMethods.bekle(1);

        //Verify that agent's phone number is visible.

        Assert.assertTrue(hauseheavenPage.agentsPhoneNumber.isDisplayed());

    }
}