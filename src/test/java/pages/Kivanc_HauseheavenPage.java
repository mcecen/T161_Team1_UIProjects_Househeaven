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

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[5]")
    public WebElement settigsFormShortdescription;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[6]")
    public WebElement settingsFormEmail;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[7]")
    public WebElement settingsFormBirthday;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/div[8]")
    public WebElement settingsFormGender;

    @FindBy (xpath = "//*[@id=\"setting-form\"]/button")
    public WebElement settingsFormSaveButton;

    @FindBy (xpath = "//*[@id=\"alert-container\"]")
    public WebElement alertMessage;











}
