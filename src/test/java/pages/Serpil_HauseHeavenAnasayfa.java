package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Serpil_HauseHeavenAnasayfa {
    public static WebElement serarchResaultButon;

    public Serpil_HauseHeavenAnasayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class=\"add-listing\"]")
    public WebElement signInButonu;

    @FindBy(xpath = "//*[@name=\"min_price\"]")
    public WebElement minPriceTextbox;

    @FindBy(xpath = "//img[@class=\"logo\"]")
    public WebElement HomePageLogo;

    @FindBy(xpath = "//input[@placeholder=\"Search for a location\"]")
    public WebElement searchLocation;

    @FindBy(xpath = "//*[@name=\"category_id\"]")
    public WebElement propertyType;

    @FindBy(xpath = "//*[@name=\"max_price\"]")
    public WebElement maxPriceText;

    @FindBy(xpath = "//*[@name=\"bedroom\"]")
    public WebElement bedRoomsTextbox;

    @FindBy(xpath = "//*[@name=\"city_id\"]")
    public WebElement propertyLocation;

    @FindBy(xpath = "//*[@class=\"btn search-btn\"]")
    public WebElement SearchButon;

    @FindBy(xpath = "//input[@class=\"form-control\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@ type=\"text\"]")
    public WebElement searchLocationButon;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement usernameKutusu;

    @FindBy(xpath="//*[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath ="//*[@class='btn btn-md full-width btn-theme-light-2 rounded']" )
    public WebElement loginButonu;

    @FindBy(xpath ="//a[normalize-space(text())='Listing']" )
    public WebElement ListingButonu;

    @FindBy(xpath = "//*[@class='m-0']")
    public  WebElement MulkSayisi;



}
