package tests.US015;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Kivanc_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class  TC002 {

    Kivanc_HauseheavenPage kivanc_hauseheavenPage = new Kivanc_HauseheavenPage();

    @Test
    public void signUpIsEnableTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        //User sees the 'Sign Up' link in the header section of the homepage
        Assert.assertTrue(kivanc_hauseheavenPage.signUpButtton.isDisplayed());

        //User clicks on the 'Sign Up' link
        kivanc_hauseheavenPage.signUpButtton.click();

        //User sees the Register form on the page
        Assert.assertEquals(Driver.getDriver().getTitle(),"Register");

        Driver.quitDriver();

    }
}
