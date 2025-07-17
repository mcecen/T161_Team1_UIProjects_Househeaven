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

    @FindBy (xpath = "//*[@id=\"botble-location-tables-country-table\"]/tbody/tr[8]/td[3]/a" )
    public WebElement CountriesNameUnitedStatesofAmerica;

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[3]/div[2]/div/ol/li[4]" )
    public WebElement DashboardLocationsCountriesEditCountry;

    @FindBy (xpath = "(//button[@class='btn btn-info'])[1]" )
    public WebElement CountryEditSaveExtButton;





    @FindBy (xpath = "//th[@class='column-key-id sorting']" )
    public WebElement StatesID;

    @FindBy (xpath = "//th[@class='text-start column-key-name sorting_asc']" )
    public WebElement StatesName;

    @FindBy (xpath = "//th[@class='text-start column-key-country_id sorting']" )
    public WebElement StatesCountry;

    @FindBy (xpath = "//th[@class='column-key-created_at sorting']" )
    public WebElement StatesCreatedAt;

    @FindBy (xpath = "//th[@class='column-key-status sorting']" )
    public WebElement StatesStatus;

    @FindBy (xpath = "//th[@class='text-center sorting_disabled']" )
    public WebElement StatesOperations;

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[3]/div[2]/div/ol/li[4]" )
    public WebElement DashboardLocationsCountriesNewcountry;

    @FindBy (xpath = "(//label[@class='control-label required'])[1]" )
    public WebElement NameBaslik;

    @FindBy (xpath = "(//label[@class='control-label required'])[2]" )
    public WebElement NationalityBaslik;

    @FindBy (xpath = "(//label[@class='control-label required'])[3]" )
    public WebElement CountryISOcodeBaslik;

    @FindBy (xpath = "(//label[@class='control-label required'])[4]" )
    public WebElement StatusBaslik;

    @FindBy (xpath = "//label[@class='control-label dial_code']" )
    public WebElement DialcodeBaslik;

    @FindBy (xpath = "//label[@class='control-label']" )
    public WebElement OrderBaslik;

    @FindBy (xpath = "//input[@class='form-control']" )
    public WebElement NameTextbox;

    @FindBy (xpath = "(//input[@class='form-control'])[2]" )
    public WebElement NationalityTextbox;

    @FindBy (xpath = "(//input[@class='form-control'])[3]" )
    public WebElement CountryISOcodeTextbox;

    @FindBy (xpath = "(//input[@class='form-control'])[4]" )
    public WebElement StatusTextbox;

    @FindBy (xpath = "(//input[@id='dial_code']" )
    public WebElement DialcodeTextbox;

    @FindBy (xpath = "//input[@id='order']" )
    public WebElement OrderTextbox;

    @FindBy (xpath = "//button[@class='btn btn-info']" )
    public WebElement SaveExitButton;

    @FindBy (xpath = "//label[@for='status']" )
    public WebElement StatusDropdownBaslik;

    @FindBy (xpath = "//span[@class='select2-selection__rendered']" )
    public WebElement StatusDropdownPublished;

    @FindBy (xpath = "//*[@id=\"botble-location-tables-country-table\"]/tbody/tr/td[3]" )
    public WebElement Thailand;

    @FindBy (xpath = "(//div[@class='modal-content'])[1]" )
    public WebElement DeletePopUp;

    @FindBy (xpath = "//*[@id=\"main\"]/div[2]/div/div/div[3]/button[1]" )
    public WebElement ConfirmDeleteCancelButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div[2]/div/div/div[3]/button[2]" )
    public WebElement ConfirmDeleteDeleteButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div[2]/div/div/div[2]/div" )
    public WebElement ConfirmDeleteMessage;


    // Locations States New State

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[3]/div[2]/div/ol/li[3]" )
    public WebElement DashboardLocationsState;

    @FindBy (xpath = "(//a[@data-bs-original-title='Delete'])[2]" )
    public WebElement StatesDeleteButton;

    @FindBy (xpath = "(//ol[@class='breadcrumb'])[1]" )
    public WebElement DashboardLocationsStatesNewstate;

    @FindBy (xpath = "//label[@class='control-label required']" )
    public WebElement NewstateNameBaslik;

    @FindBy (xpath = "//label[@for='abbreviation']" )
    public WebElement NewstateAbbreviationBaslik;

    @FindBy (xpath = "//label[@for='country_id']" )
    public WebElement NewstateCountryBaslik;

    @FindBy (xpath = "//li[@id='select2-country_id-result-hv32-2']" )
    public WebElement NewstateCanada;

    @FindBy (xpath = "//label[@for='order']" )
    public WebElement NewstateOrderBaslik;

    @FindBy (xpath = "(//button[@value='apply'])[1]" )
    public WebElement NewstateSaveButton;

    @FindBy (xpath = "(//input[@class='form-control'])[1]" )
    public WebElement NewstateNameTextBox;

    @FindBy (xpath = "(//input[@class='form-control'])[2]" )
    public WebElement NewstateAbbreviationTextBox;

    @FindBy (xpath = "(//span[@class='select2-selection__rendered'])[1]" )
    public WebElement NewstateCountryDrp;

    @FindBy (xpath = "//input[@class='form-control is-valid']" )
    public WebElement NewstateOrderSpnBox;

    // Cities

    @FindBy (xpath = "//*[@id=\"botble-location-tables-city-table\"]/thead/tr/th[3]" )
    public WebElement CitiesName;

    @FindBy (xpath = "//*[@id=\"botble-location-tables-city-table\"]/thead/tr/th[4]" )
    public WebElement CitiesState;

    @FindBy (xpath = "//*[@id=\"botble-location-tables-city-table\"]/tbody/tr[6]/td[3]" )
    public WebElement Whitehorse;













}
