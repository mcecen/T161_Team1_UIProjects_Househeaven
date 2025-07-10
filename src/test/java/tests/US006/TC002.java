package tests.US006;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenAnasayfa;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC002 {

  @Test
    public void test01(){
      HauseheavenPage hauseheavenPage = new HauseheavenPage();

     // the user opens the browser
      Driver.getDriver().get(ConfigReader.getProperty("url"));

      // the hauseheaven homepage is displayed
      String expectedUrl = "https://qa.hauseheaven.com/";
      String actualUrl = Driver.getDriver().getCurrentUrl();
      Assert.assertEquals(actualUrl,expectedUrl);

      Assert.assertTrue(hauseheavenPage.hauseheavenLogo.isDisplayed());

      Driver.getDriver().findElement(By.linkText("Listing")).click();

      WebElement ListingPageFoundRusult= Driver.getDriver().findElement(By.xpath("//*[@class='m-0']"));

      System.out.println(ListingPageFoundRusult.getText());

      List<WebElement> viewButton = Driver.getDriver().findElements(By.xpath("//a[text()='View']"));

      for(WebElement button : viewButton){
          Assert.assertTrue(button.isDisplayed());

      }

      WebElement ilanButonu = viewButton.get(1); // 2. ilana tıklayacaksın

      Actions actions = new Actions(Driver.getDriver());
      actions.moveToElement(viewButton.get(1)).perform(); // önce scroll et

      ReusableMethods.bekle(1); // scroll sonrası bekle

      WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(ilanButonu)); // tıklanabilir olmasını bekle

      ilanButonu.click(); // tıkla
      ReusableMethods.bekle(2);

      String expextedUrl= "https://qa.hauseheaven.com/properties/dublex-villa-8";
      String actualUrlProperty= Driver.getDriver().getCurrentUrl();

      Assert.assertTrue(actualUrlProperty.contains(expextedUrl));



  }

}
