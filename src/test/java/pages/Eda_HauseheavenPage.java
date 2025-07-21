package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Eda_HauseheavenPage {

    public Eda_HauseheavenPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement signUpButtton;

    @FindBy (id = "first_name")
    public WebElement firstNameTextbox;

    @FindBy (id = "last_name")
    public WebElement lastNameTextbox;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailTextbox;

    @FindBy (xpath = "//*[@id=\"username\"]")
    public WebElement usernameTextbox;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement passwordTextbox;

    @FindBy (id = "password-confirm")
    public WebElement confirmPasswordTextbox;

    @FindBy (xpath = "//*[@id=\"sign-up\"]/div/form/div[2]/button")
    public WebElement registerButton;

    @FindBy (xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[1]/a")
    public WebElement dashboardLink;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]/a/i")
    public WebElement profilName;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/h4")
    public WebElement yourCurrentCredits;

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[1]/div")
    public WebElement approvedProperties;

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[2]/div")
    public WebElement pendingApproveProperties;

    @FindBy (xpath = "//*[@id=\"app\"]/div[2]/div[3]/div")
    public WebElement rejectedProperties;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]")
    public WebElement signInLink;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div")
    public WebElement loginForm;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement loginEmailTextbox;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement loginPasswordTextbox;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[4]/button")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]/a/i")
    public WebElement getProfilName;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[3]/a")
    public WebElement logoutLink;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[3]/div/div[1]/div/label")
    public WebElement rememberMeCheckbox;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[3]/div/div[2]/a")
    public WebElement forgotYourPasswordLink;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[1]/span")
    public WebElement emptyUsernameBoxWarning;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[1]/span")
    public WebElement invalidUsernameWarning;

    @FindBy (xpath = "//*[@id=\"registermodal\"]/div/div/form/div[2]/span")
    public WebElement emptyPasswordBoxWarning;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement forgotPasswordEmailTextbox;

    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div/div/div/div/form/div[2]/button")
    public WebElement resetPasswordButton;

    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div/div/div/div/form/div[2]/div/a")
    public WebElement backToLoginPageLink;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[1]/a")
    public WebElement addPropertyLink;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-account-property-form\"]/div/div[2]/div")
    public WebElement listingCreationform;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-account-property-form\"]/div/div[3]/div/div[1]/div[2]/div/button[2]")
    public WebElement saveButton;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-account-property-form\"]/div/div[3]/div/div[1]/div[2]/div/button[1]")
    public WebElement saveExitButton;

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

    @FindBy (xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[4]/a")
    public WebElement propertiesLink;

    @FindBy (xpath = "//a[text()='geniş bahçeli dubleks villa']")
    public WebElement listingTitle;

    @FindBy (xpath = "//a[text()='küçük bahçeli villa']")
    public WebElement editListingTitle;

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[2]/a")
    public WebElement listingLink;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div/p")
    public WebElement signInBelowText;

    @FindBy (xpath = "//*[@id=\"emailGroup\"]/input")
    public WebElement adminEmailTextBox;

    @FindBy (xpath = "//*[@id=\"passwordGroup\"]/input")
    public WebElement adminPasswordTextBox;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div/form/button/span")
    public WebElement adminLoginButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div[3]/div[1]/a/div[2]/div[2]")
    public WebElement activePropertiesLink;

    @FindBy (xpath = "//input[@name='latitude']")
    public WebElement latitude;

    @FindBy (xpath = "//input[@name='longitude']")
    public WebElement longitude;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement villaTextBox;
































































}
