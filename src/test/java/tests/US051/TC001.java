package tests.US051;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hauseheaven_Mustafa;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    Hauseheaven_Mustafa hauseheaven_mustafa = new Hauseheaven_Mustafa();

    @Test
    public void creditPurchaseTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        //User clicks on the 'Sign In' link
        hauseheaven_mustafa.signInButton.click();

        String expectedLoginSayfaUrl="https://qa.hauseheaven.com/login";
        String actualLoginSayfaUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedLoginSayfaUrl,actualLoginSayfaUrl);

        ReusableMethods.bekle(2);

        hauseheaven_mustafa.emailText.sendKeys(ConfigReader.getProperty("user-mustafa"));
        hauseheaven_mustafa.passwordText.sendKeys(ConfigReader.getProperty("user-mustafa-password"));
        ReusableMethods.bekle(2);

        hauseheaven_mustafa.loginButton.click();

        hauseheaven_mustafa.profileButton.click();

        hauseheaven_mustafa.buyCreditButton.click();
        ReusableMethods.bekle(2);

        hauseheaven_mustafa.buyFivePackageButton.click();
        ReusableMethods.bekle(2);

        Driver.quitDriver();
    }
}