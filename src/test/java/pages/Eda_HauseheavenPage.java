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









}
