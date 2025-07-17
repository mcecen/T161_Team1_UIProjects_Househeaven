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

    @FindBy(xpath = "//*[@class='btn search-btn']")
    public WebElement SearchResaultBox;

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

    @FindBy(xpath ="//input[@placeholder='Search for a location']")
    public WebElement SearchLocationButon;

    @FindBy(xpath = "//span[@id='select2-minprice-container']")
    public WebElement MinPriceFltreleme;

    @FindBy(xpath = "//span[@id='select2-maxprice-container']")
    public WebElement MaxPriceFlitreleme;

    @FindBy(name ="min_square" )
    public WebElement minAreaButonu;

    @FindBy(name ="max_square" )
    public WebElement maxAreaButonu;

    @FindBy(xpath = "//*[@class='btn btn btn-theme-light-2 rounded full-width mt-3']")
        public WebElement filtrelemeKaydetButonu;

                                //Listing Page

    @FindBy(xpath ="//*[@title='City']")
   public WebElement ListingCityBox;

    @FindBy(xpath ="//*[@title='Category']")
    public WebElement ListingCategoryBox;


    @FindBy(xpath ="//*[@title='Type']")
    public WebElement ListingTypeBox;

    @FindBy(xpath ="//*[@title='No Min']")
    public WebElement ListingNoMinBox;

    @FindBy(xpath ="//*[@title='No Max']")
    public WebElement ListingNoMaxBox;

    @FindBy(xpath ="//*[@title='Bedroom']")
    public WebElement ListingBedroomBox;

    @FindBy(xpath ="//*[@title='Bathroom']")
    public WebElement ListingBathroomBox;

    @FindBy(xpath = "//*[@for='features-0']")
    public WebElement WiFiBox;

    @FindBy(xpath = "//*[@for='features-1']")
    public WebElement ParkingBox;

    @FindBy(xpath = "//*[@class='btn btn btn-theme-light-2 rounded full-width mt-3']")
    public WebElement FindNewHomeButon;

    @FindBy(xpath = "//*[@title=\"Peoria\"]")
    public WebElement Newark;

               //*[@class='m-0']

    @FindBy(xpath = "//*[@class='m-0']")
    public WebElement ListSonucSayisi;

             //SON aldığım locate'ler//

    @FindBy(xpath ="//*[@id='minprice']")
    public WebElement MinPriceKutusu;

    @FindBy(xpath = "//*[@id=\"maxprice\"]")
    public WebElement MaxPriceKutusu;

    @FindBy(xpath = "//*[@id=\"ptypes\"]")
    public WebElement PopertyTypeKutusu;

    @FindBy(xpath = "//*[@id=\"select-bedroom\"]")
    public WebElement BedRoomsKutusu;

    @FindBy(xpath ="//*[@id='city_id']")
    public WebElement PropertyLocation;






}
