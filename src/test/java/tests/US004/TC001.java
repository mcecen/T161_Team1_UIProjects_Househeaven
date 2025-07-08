package tests.US004;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC001 {

@Test
    public void test01(){

    // The browser opens
    Driver.getDriver().get(ConfigReader.getProperty("url"));


}

    }


