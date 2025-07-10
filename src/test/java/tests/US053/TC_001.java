package tests.US053;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001 {

  @Test

  public void AdminLogin (){

      WebDriver driver = Driver.getDriver();

      //  The user opens the browser page.
      //  The user clicks on the browser search bar.
      //  The user types the https://qa.hauseheaven.com/admin/login address in the search bar.
      //  The user presses the Enter key after the URL typed in the search bar.
      //  The user sees the HOUSE HEAVEN admin login homepage.
      //  The user sees the email/username textbox.
      //  The user clicks on the email/username textbox field.
      //  The user enters the data "erkanbinici_admin" in the email/username textbox field.
      //  The user sees the Password textbox.
      //  The user clicks on the Password textbox field.
      //  The user enters the data "021924" in the Password textbox field.
      //  The user sees the Sign In button.
      //  The user clicks the Sign In button.
      //  After clicking the Shelter In button, it displays the "https://qa.hauseheaven.com/admin" page.
      //  The user sees the Admin dashboard homepage open.
      //  The user sees the Locations category listed under the Dashboard heading in the left menu.
      //  The user clicks on the Locations category.
      //  Under the Locations category, the user sees Countries, States, Cities listed.
      //  Under the Locations category, the user clicks Countries.
      //  When the user clicks on Countries under the Locations category, it displays the "https://qa.hauseheaven.com/admin/countries" page.
      //  On the Countries page that opens, the user sees that there are columns "ID, NAME, NATIONALITY, CREATED AT, STATUS, OPERATIONS".
      //  The User Countries page sees that under the "NAME" column, the Countries of "Turkey, Thailand,Canada,United States of America" are listed.


      // To Admin Url
      driver.get("https://qa.hauseheaven.com/admin/login");
      ReusableMethods.bekle(3);

      // Email/Surname

      WebElement EmailKutusu = driver.findElement(By.xpath("//input[@type='text']"));

      EmailKutusu.sendKeys("erkanbinici_admin" + Keys.ENTER);

      // Password

      WebElement PasswordKutusu = driver.findElement(By.xpath("//input[@type='password']"));

      PasswordKutusu.sendKeys("021924" + Keys.ENTER);

  }

    }

