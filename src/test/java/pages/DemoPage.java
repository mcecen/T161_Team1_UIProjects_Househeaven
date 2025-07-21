package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class DemoPage {


    @FindBy(xpath ="//a[@class='text-success']")
    public WebElement addPropertyButton;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement usernameField;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath ="(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div")
    public WebElement loginForm;

    @FindBy (xpath = "//*[@id=\"name\"]")
    public WebElement titleTextbox;

    @FindBy (xpath = "//*[@id=\"name-error\"]")
    public WebElement titleWarning;

    @FindBy (xpath = "//*[@id=\"description\"]")
    public WebElement descriptionTextbox;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-account-property-form\"]/div/div[2]/div/div[1]/div/div[4]/div/div[2]/div")
    public WebElement contentTextbox;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-account-property-form\"]/div/div[2]/div/div[1]/div/div[4]/div[2]")
    public WebElement contentWarning;

    @FindBy (xpath = "//div[@id='multiple-upload']//input[@type='file']")
    public WebElement propertiesImagesBox;

    @FindBy (xpath = "//*[@id=\"select2-city_id-container\"]")
    public WebElement cityDropdown;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement citySearchTextbox;

    @FindBy (xpath = "//*[@id=\"location\"]")
    public WebElement propertyLocationTextbox;

    @FindBy (xpath = "//*[@id=\"number_bedroom\"]")
    public WebElement bedroomTextbox;

    @FindBy (xpath = "//*[@id=\"number_bathroom\"]")
    public WebElement bathroomTextbox;

    @FindBy (xpath = "//*[@id=\"number_floor\"]")
    public WebElement floorTextbox;

    @FindBy (xpath = "//*[@id=\"square\"]")
    public WebElement squareTextbox;

    @FindBy (xpath = "//*[@id=\"price-number\"]")
    public WebElement priceTextbox;

    @FindBy (xpath = "//select[@id='type_id']")
    public WebElement typeDropdown;

    @FindBy (xpath = "(//input[@name='features[]'])[1]")
    public WebElement wifiCheckbox;

    @FindBy (xpath = "(//input[@name='features[]'])[2]")
    public WebElement parkingCheckbox;

    @FindBy (xpath = "(//input[@name='features[]'])[5]")
    public WebElement gardenCheckbox;

    @FindBy (xpath = "//span[@id='select2-category_id-container']")
    public WebElement categoryDropdown;

    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement categorySearchTextbox;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement saveAndExitButton;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement saveButton;

    @FindBy (xpath = "(//span[@class='label-warning status-label'])[1]")
    public WebElement hauseheavenPending;

    @FindBy (xpath = "//a[@title='Properties']")
    public WebElement propertiesText;

    @FindBy (xpath = "(//span[text()='Pending'])[1]")
    public WebElement pendingTextAdmin;

    @FindBy (xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement editTextAdmin;

    @FindBy (xpath = "//label[@for='moderation_status']")
    public WebElement moderationStatus;

    @FindBy (xpath = "//span[@title='Pending']")
    public WebElement pendingStatus;

    @FindBy (xpath = "//span[@title='Approved']")
    public WebElement approvedStatus;

    @FindBy (xpath = "(//button[@value='save'])[1]")
    public WebElement adminSaveandExit;

    @FindBy (xpath = "//span[text()='Approved']")
    public WebElement approvedText;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement searchForaLocation;

    @FindBy (xpath = "//button[text()='Find New Home']")
    public WebElement findNewHome;

    @FindBy (xpath = "(//a[text()='View'])[1]")
    public WebElement viewButton;

    @FindBy (xpath = "//a[@title='geniş bahçeli dubleks villa']")
    public WebElement genisBahceliVillaText;

    @FindBy (xpath = "//span[text()='Fulya nermin Keceli']")
    public WebElement dashboardProfile;

    @FindBy (xpath = "//*[@id='moderation_status']")
    public WebElement moderationStatusSelect;

    @FindBy (xpath = "//*[@id='select2-moderation_status-container']")
    public WebElement moderationStatusBox;

    @FindBy (xpath = "//input[@role='searchbox']")
    public WebElement citySelectDropdown;

    @FindBy (xpath = "//*[@id='select2-moderation_status-container']")
    public WebElement dDApproved;

    @FindBy (xpath = "//input[@name='number_bedroom']")
    public WebElement bedroomNumber;

    @FindBy (xpath = "//input[@name='number_bathroom']")
    public WebElement bathroomNumber;

    @FindBy (xpath = "//input[@name='number_floor']")
    public WebElement floor;

    @FindBy (xpath = "//input[@name='square']")
    public WebElement square;

















}
