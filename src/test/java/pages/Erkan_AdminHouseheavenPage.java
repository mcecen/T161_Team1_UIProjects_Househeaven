package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Erkan_AdminHouseheavenPage {

    public Erkan_AdminHouseheavenPage (){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath= "//input[@type='text']")
    public WebElement UsernameTextbox;

    @FindBy (xpath = "//input[@type='password']" )
    public WebElement PasswordTextbox;

    @FindBy (xpath = "//span[@class='signin']" )
    public WebElement SignInButton;

    @FindBy (xpath = "//li[@class='breadcrumb-item active']" )
    public WebElement DashboardLogo;

    @FindBy (xpath = "//i[@class='fas fa-globe']" )
    public WebElement LocationsDropdown;

    @FindBy (xpath = "//li[@id='cms-plugins-country']" )
    public WebElement Countries;

    @FindBy (xpath = "//li[@id='cms-plugins-state']" )
    public WebElement States;

    @FindBy (xpath = "//li[@id='cms-plugins-city']" )
    public WebElement Cities;

    @FindBy (xpath = "(//li[@class='breadcrumb-item active'])[2]" )
    public WebElement DashboardLocationsCountries;

    @FindBy (xpath = "(//li[@class='breadcrumb-item active'])[2]" )
    public WebElement DashboardLocationsStates;

    @FindBy (xpath = "(//li[@class='breadcrumb-item active'])[2]" )
    public WebElement DashboardLocationsCities;

    @FindBy (xpath = "//button[@class='btn btn-secondary action-item']" )
    public WebElement CreateButton;

    @FindBy (xpath = "//input[@type='search']" )
    public WebElement SearchBox;

    @FindBy (xpath = "//a[@class='btn btn-icon btn-sm btn-primary']" )
    public WebElement EditButton;

    @FindBy (xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]" )
    public WebElement DeleteButton;

    @FindBy (xpath = "//th[@title='ID']" )
    public WebElement CountriesID;

    @FindBy (xpath = "//th[@title='Name']" )
    public WebElement CountriesName;

    @FindBy (xpath = "//th[@title='Nationality']" )
    public WebElement CountriesNationality;

    @FindBy (xpath = "//th[@title='Created At']" )
    public WebElement CountriesCreatedAt;

    @FindBy (xpath = "//th[@title='Status']" )
    public WebElement CountriesStatus;

    @FindBy (xpath = "//th[@title='Operations']" )
    public WebElement CountriesOperations;

    @FindBy (xpath = "(//td[@class='text-start column-key-name sorting_1'])[10]" )
    public WebElement CountriesNameUnitedStatesofAmerica;

}
