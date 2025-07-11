package tests.US001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_002 {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
     @Test
    public void testHouseheavenAccess() {

         // 1. Get to URL
         driver.get("https://qa.hauseheaven.com/");

         // 2. Sayfanin dogru yüklendigini dogrula
         String expectedTitle = "Househeaven";
         String actualTitle = driver.getTitle();
         Assert.assertTrue(actualTitle.contains(expectedTitle), "Househeaven sayfasina erisilemedi");

         //3.Ana sayfa ögesi görünür oldugu dogrulanir
         WebElement homeMenu = driver.findElement(By.className("logo"));
         Assert.assertTrue(homeMenu.isDisplayed(), "Ana sayfa menüsü görünür degil");
     }

     @AfterClass
    public void teardown(){
        //Tarayiciyi kapat
         if (driver !=null){
             driver.quit();
         }

    }
}
