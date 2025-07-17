package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SwHauseheavenPage {

     public SwHauseheavenPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[2]/a")
    public WebElement listignLink;

    @FindBy (xpath = "//*[@id=\"filters-form\"]/div[1]/div/div/input")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@id=\"select2-city_id-container\"]")
    public WebElement cityDropdown;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement citySearchbox;

    @FindBy (xpath = "//span[@id='select2-ptypes-container']")
    public WebElement category;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement categorySearchbox;

    @FindBy (xpath = "//*[@id=\"select2-select-type-container\"]")
    public WebElement type;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement typeSearchbox;

    @FindBy (xpath = "//*[@id=\"select2-minprice-container\"]")
    public WebElement minPrice;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement minPriceSearchbox;

    @FindBy (xpath = "//*[@id=\"select2-maxprice-container\"]")
    public WebElement maxPrice;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement maxPriceSearch;

    @FindBy (xpath = "//*[@id=\"select2-select-bedroom-container\"]")
    public WebElement bedroom;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement bedroomSearchbox;

    @FindBy (xpath = "//*[@id=\"select2-select-bathroom-container\"]")
    public WebElement bathroom;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement bathroomSearchbox;

    @FindBy(xpath = "//*[@id=\"filters-form\"]/div[8]/div[1]/div/div/input")
    public WebElement minArea;

    @FindBy (xpath = "//*[@id=\"filters-form\"]/div[8]/div[2]/div/div/input")
    public WebElement maxArea;

    @FindBy (xpath = "//*[@id=\"features\"]/ul/li[1]/label")
    public WebElement wifiCheckbox;

    @FindBy (xpath = "//*[@id=\"features\"]/ul/li[2]/label")
    public WebElement parkingCheckbox;

    @FindBy (xpath = "//*[@id=\"filters-form\"]/button")
    public WebElement findNewHomeButton;

    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div[2]/div/div[1]/div/div/div[1]/div/h4")
    public WebElement resultsText;
}
