package tests.US004;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC001 {

@Test
    public void test01() {

    // It is seen that the Househeaven page can be accesse

    Driver.getDriver().get(ConfigReader.getProperty("url"));

    String extualResultPageUrl = "https://qa.hauseheaven.com";
    String actualResultPageUrl = Driver.getDriver().getCurrentUrl();
    Assert.assertNotEquals(actualResultPageUrl, extualResultPageUrl);
}
        @Test
        public void test02() {
        WebElement pageLogo = Driver.getDriver().findElement(By.xpath("//*[@class='logo']"));
        Assert.assertTrue(pageLogo.isDisplayed());

        // It is checked that the "find accessible home to rent" field on the home page is visible

        WebElement Filtertext = Driver.getDriver().findElement(By.xpath("//h1[.='Find accessible homes to rent']"));
        String extualText = "Find Accessible Homes To Rent";
        String actualText = Filtertext.getText();
        Assert.assertEquals(extualText,actualText);

    }



    }





