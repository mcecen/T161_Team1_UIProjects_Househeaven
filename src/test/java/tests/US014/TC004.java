package tests.US014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PageNavigation;
import utilities.TestBaseRapor;

public class TC004 extends TestBaseRapor {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void propertyContentTest(){

        extentTest = extentReports.createTest("Property Content Test");

        extentTest.info("Go to the URL address: https://qa.hauseheaven.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        extentTest.info("User views the Househeaven homepage");
        softAssert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User clicks the 'Sign In' link in the header section of the homepage");
        eda_hauseheavenPage.signInLink.click();

        extentTest.info("User sees that the page https://qa.hauseheaven.com/public/login is opened after clicking the Sign In link");
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Login");

        extentTest.info("User fills in the login form with valid data.");
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        extentTest.info("User clicks the Login button.");
        eda_hauseheavenPage.loginButton.click();

        extentTest.info("User sees the Househeaven homepage.");
        softAssert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        extentTest.info("User clicks on the username link in the header. ");
        eda_hauseheavenPage.profilNameLink.click();

        extentTest.info("User views the Dashboard page.");
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), (ConfigReader.getProperty("dashboard-url")));

        extentTest.info("User sees \"0 Pending approve properties\" on the Dashboard.");
        softAssert.assertEquals(eda_hauseheavenPage.pendingApproveProperties.getText(), "0\nPending approve properties");

        extentTest.info("User sees \"1 Approved properties\" on the Dashboard.");
        softAssert.assertEquals(eda_hauseheavenPage.approvedProperties.getText(), "1\nApproved properties");

        extentTest.info("User sees the \"Listing\" link in the dashboard header.");
        softAssert.assertTrue(eda_hauseheavenPage.listingLink.isDisplayed());

        extentTest.info("User clicks the \"Listing\" link.");
        eda_hauseheavenPage.listingLink.click();

        extentTest.info("User views the \"küçük bahçeli villa\" listing.");
        softAssert.assertTrue(eda_hauseheavenPage.editListingTitle.isDisplayed());

        extentTest.info("User sees the \"View\" link under the listing.");
        softAssert.assertTrue(eda_hauseheavenPage.viewButton.isDisplayed());

        PageNavigation.scrollDownWithJS(300);

        extentTest.info("User clicks the \"View\" link.");
        eda_hauseheavenPage.viewButton.click();

        extentTest.info("User views the \"küçük bahçeli villa\" property page.");
        softAssert.assertEquals(Driver.getDriver().getTitle(), "küçük bahçeli villa");

        PageNavigation.scrollDownWithJS(200);

        extentTest.info("User sees \"For Sale\" on the page.");
        WebElement forSaleText = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/section/div[2]/div[1]/div[1]/div[1]/div/span[1]"));
        softAssert.assertEquals(forSaleText.getText(), "For Sale");
        softAssert.assertTrue(forSaleText.isDisplayed());

        extentTest.info("User sees \"Küçük Bahçeli Villa\" text.");
        softAssert.assertEquals(eda_hauseheavenPage.listingName.getText(), "Küçük Bahçeli Villa");
        softAssert.assertTrue(eda_hauseheavenPage.listingName.isDisplayed());

        extentTest.info("User sees \"Ankara, Eryaman\" text.");
        WebElement locationText = Driver.getDriver().findElement(By.xpath("//span[text()=' Ankara, Eryaman']"));
        softAssert.assertEquals(locationText.getText(), "Ankara, Eryaman");

        extentTest.info("User sees \"$1\" text.");
        WebElement priceText = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/section/div[2]/div[1]/div[1]/div[1]/div/h3[2]"));
        softAssert.assertEquals(priceText.getText(), "$1");

        extentTest.info("User sees \"Property Type: Villa\" text.");
        softAssert.assertEquals(eda_hauseheavenPage.detailFeaturesFieldText.getText(), ("Property Type:Villa"));


        extentTest.info("User sees Under the \"Description\" menu, user sees \"Eşyasız\"");
        softAssert.assertEquals(eda_hauseheavenPage.descriptionFieldText.getText(), ("Description\neşyasız"));

        PageNavigation.scrollDownWithJS(200);

        extentTest.info("Under the \"Amenities\" menu, user sees \"Wifi, Parking, Garden\".");

        softAssert.assertEquals(eda_hauseheavenPage.amenitiesFieldWifiText.getText(), "Wifi");

        softAssert.assertEquals(eda_hauseheavenPage.amenitiesFieldParkingText.getText(), "Parking");

        softAssert.assertEquals(eda_hauseheavenPage.amenitiesFieldGardenText.getText(), "Garden");

        PageNavigation.scrollDownWithJS(100);

        extentTest.info("Under the \"Location\" menu, user sees \"Ankara\".");
        softAssert.assertEquals(eda_hauseheavenPage.locationFieldText.getText(), "Ankara");


        PageNavigation.scrollDownWithJS(500);

        //extentTest.info("Under the \"Gallery\" menu, user sees the uploaded photo.");

        extentTest.info("User clicks \"Content\" menu and sees \"iç-dış cephe boyaları yapıldı\".");
        softAssert.assertTrue(Driver.getDriver().getPageSource().contains("Content\niç-dış cephe boyaları yapıldı"));


        softAssert.assertAll();

        Driver.quitDriver();









    }
}
