package tests.US015;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {
<<<<<<< HEAD
=======

    @Test
    public void homePageTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hause Heaven");

        Driver.quitDriver();

    }
>>>>>>> main
}
