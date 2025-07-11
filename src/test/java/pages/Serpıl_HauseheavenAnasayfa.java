package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseheavenAnasayfa {
     public HauseheavenAnasayfa(){
          PageFactory.initElements(Driver.getDriver(),this);}

     @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]/a")
     public WebElement signInButonu;

     @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[1]/div[2]/div[1]/div/label")
     public WebElement minPriceText;

     @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[1]/div[2]/div[1]/div/span/span[1]/span")
     public WebElement minPriceTextbox;

    @FindBy (xpath = "//*[@id=\"ismain-homes\"]/div/div[1]/div/div/div/h1")
     public WebElement hauseheavenAnasyfaTitleText;

     @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[1]/div[1]/div/div/div/input")
     public WebElement searchLocation;

     @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[1]/div[4]/div/div/label")
     public WebElement ;
}
