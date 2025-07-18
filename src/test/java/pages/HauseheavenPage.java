package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseheavenPage {

    public WebElement emailInput;
    public WebElement passwordInput;
    public WebElement myAccountLink;

    public HauseheavenPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath= "//img[@class='logo']")
    public WebElement hauseheavenLogo;


    @FindBy (xpath = "//a[normalize-space()='Agents']")
    public WebElement agentsLink;

    @FindBy(xpath = "(//div[@class='agents-grid'])[1]")
    public WebElement firstAgentsCard;

    @FindBy (xpath = "(//a[@class='prt-view'])[1]")
    public WebElement viewButton;

    @FindBy (xpath = "//h4[@class='block-title']")
    public WebElement agentInfoText;

    @FindBy (xpath = "//strong[text()='Ceo']")
    public WebElement ceoText;

    @FindBy (xpath = "//strong[text()='Email']")
    public WebElement emailText;

    @FindBy (xpath = "//strong[text()='Phone']")
    public WebElement agentsPhoneNumber;

    @FindBy (xpath = "//span[text()='3 Property']")
    public WebElement agentsPropertyCount;


    @FindBy(xpath = "//a[normalize-space()='Blog']")
    public WebElement blogLink;

    @FindBy(xpath = "(//a[@class='bl-continue'])[3]")
    public WebElement thirdBlogContinueButton;

    @FindBy (xpath = "//img[@class='img-fluid']")
    public WebElement thirdBlogPostImage;

    @FindBy (xpath = "//h1[@class='ipt-title']")
    public WebElement thirdBlogPostHeader;

    @FindBy (xpath = "//h2[@class='post-title']")
    public WebElement thirdBlogPostTitle;

    @FindBy (xpath = "//div[@class='ck-content']")
    public WebElement thirdBlogPostContent;

    @FindBy (xpath ="//a[normalize-space()='Contact']")
    public WebElement contactLink;

    @FindBy (xpath = "(//div[@class='cn-info-detail'])[3]")
    public WebElement contactPhoneInfo;

    @FindBy (xpath = "(//div[@class='cn-info-detail'])[1]")
    public WebElement contactAdressInfo;

    @FindBy (xpath = "(//div[@class='cn-info-detail'])[2]")
    public WebElement contactEmailInfo;

    @FindBy (xpath = "//h2[text()='Get In Touch']")
    public WebElement contactGetInTouchText;

    @FindBy (xpath = "//h2[text()='Contact']")
    public WebElement contactText;

    @FindBy (xpath = "//label[text()='Name']")
    public WebElement nameText;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement nameBox;

    @FindBy(xpath = "//label[text()='Email']")
    public WebElement formEmailText;

    @FindBy (xpath = "(//input[@type='email'])[1]")
    public WebElement formEmailBox;

    @FindBy (xpath = "//label[text()='Subject']")
    public WebElement subjectText;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement subjectBox;

    @FindBy(xpath = "//label[text()='Phone']")
    public WebElement phoneText;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement phoneBox;

    @FindBy (xpath = "//label[text()='Message']")
    public WebElement messageText;

    @FindBy (xpath = "//textarea[@name='content']")
    public WebElement messageBox;

    @FindBy (xpath = "//button[text()='Send message']")
    public WebElement sendMessageButton;

    @FindBy (xpath = "//div[text()='Send message successfully!']")
    public WebElement sendMessageSuccessfullyText;

    @FindBy(xpath = "//div[@class='contact-message contact-success-message']")
    public WebElement nameRequiredWarning;

    @FindBy (xpath = "//div[@class='contact-message contact-error-message']")
    public WebElement emailRequiredWarning;

    @FindBy (xpath = "//div[@class='contact-message contact-error-message']")
    public WebElement messageRequiredWarning;


    @FindBy(xpath = "//h4[text()='Reach Us']/..")
    public WebElement sideBarAddress;


    @FindBy (xpath = "//li[@class='add-listing']")
    public WebElement signInButton;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailField;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordField;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement titleAlani;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionAlani;




}


