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

    @FindBy (xpath = "//input[@type='password']/following-sibling::*[contains(text(),'These credentials')]")
    public WebElement invalidPasswordWarning;



















}
