package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Kivanc_HauseheavenPage {

    public Kivanc_HauseheavenPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
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

    @FindBy (xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[2]/a")
    public WebElement settingsLink;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[1]")
    public WebElement settingsFormFirstname;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[2]")
    public WebElement settingsFormLastname;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[3]")
    public WebElement settingsFormUsername;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[4]")
    public WebElement settingsFormPhone;

    @FindBy (xpath = "//*[@id=\"description\"]")
    public WebElement settigsFormShortdescription;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[6]")
    public WebElement settingsFormEmail;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[7]")
    public WebElement settingsFormBirthday;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[8]")
    public WebElement settingsFormGender;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/button")
    public WebElement settingsFormSaveButton;

    @FindBy (xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[3]/a")
    public WebElement buyCreditsLink;

    @FindBy (xpath = "//*[@id=\"app-real-estate\"]/div/div/div/div[1]/div")
    public WebElement creditPackagesSection;

    @FindBy (xpath = "//*[@id=\"app-real-estate\"]/div/div/div/div[1]/div/div[2]/div[2]/div/div[3]/div/div/button")
    public WebElement post5PurchaseButton;

    @FindBy (xpath = "//*[@id=\"stripe-number\"]")
    public WebElement cardNumberTextbox;

    @FindBy (xpath = "//*[@id=\"stripe-exp\"]")
    public WebElement cardMMYYTextbox;

    @FindBy (xpath = "//*[@id=\"stripe-name\"]")
    public WebElement cardFullNameTextbox;

    @FindBy (xpath = "//*[@id=\"stripe-cvc\"]")
    public WebElement cardCVCTextbox;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div/div/div/form/div/button")
    public WebElement checkoutButton;

    @FindBy (xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[5]/a")
    public WebElement securityLink;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement newPasswordTextbox;

    @FindBy (xpath = "//*[@id=\"password_confirmation\"]")
    public WebElement confirmationTextbox;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div/form/button")
    public WebElement updatePasswordButton;

    @FindBy(xpath= ("//*[@id=\"cms-plugins-property\"]/a"))
    public WebElement propertiesBasligi;

    @FindBy(xpath = ("//a[@class='text-success']"))
    public WebElement addProperties;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div")
    public WebElement createdSuccessfullyMesaji;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table\"]/tbody/tr[1]/td[8]/div/a[1]/i")
    public WebElement editIkonu;

    @FindBy(xpath = "(//*[@name='submit'])[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement properties;























}
