package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHeaven_gokhan {

    public HauseHeaven_gokhan(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = ("//*[@id='emailGroup']//input"))
    public WebElement emailInput;

    @FindBy (xpath = ("//*[@id='passwordGroup']//input"))
    public WebElement passwordInput;

    @FindBy (xpath = ("//button[@type='submit']"))
    public WebElement signInButton;

    @FindBy (xpath = "(//span[@class='title'])[4]")
    public WebElement clickRealEstate;

    @FindBy (id = "cms-plugins-real-estate-category")
    public WebElement clickCategories;

    @FindBy (xpath = "//span[@data-action='create']")
    public WebElement createButton;

    @FindBy (xpath = "(//input[@class='form-control'])[1]")
    public WebElement nameTextArea;

    @FindBy (id = "select2-status-container")
    public WebElement statusOptions;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement saveexitButton;

    @FindBy (xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement editButton;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement saveButton;

    @FindBy (xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement deleteButton;

    // -------------------------------------------------------------

    @FindBy (xpath = "(//a[@class='nav-link'])[8]")
    public WebElement clickTypes;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public WebElement slugTextArea;

    //--------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement signUpButton;

    @FindBy (id = "first_name")
    public WebElement firstNameTextArea;

    @FindBy (id = "last_name")
    public WebElement lastNameTextArea;

    @FindBy (id = "email")
    public WebElement emailTextArea;

    @FindBy (id = "username")
    public WebElement usernameTextArea;

    @FindBy (id = "password")
    public WebElement passwordTextArea;

    @FindBy (id = "password-confirm")
    public WebElement confirmPasswordTextArea;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement registerButton;

    @FindBy (xpath = "(//span[@class='title'])[7]")
    public WebElement accountButton;


}
