package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHaven_Mahmut {



    public HauseHaven_Mahmut (){
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//li[@class='add-listing']")
public WebElement signInButton;

@FindBy(xpath = "//input[@id='email']")
public WebElement emailInput;

@FindBy(xpath = "//input[@id='password']")
public WebElement passwordInput;

@FindBy(xpath = "//*[@id=\"registermodal\"]/div/div/form/div[4]/button")
public WebElement loginButton;


@FindBy(xpath = "//a[text()='My Account']")
public WebElement myAccountLink;

    @FindBy(xpath = "//*[@id=\"ismain-homes\"]/div/section[1]/div/div[2]/div[1]/div/div[2]/div/div/h4/a")
    public WebElement firstListing;

@FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a")
public WebElement saveButton;

    @FindBy(xpath = "/html/body/div[3]/div/button")
    public WebElement cookieAcceptButton;

@FindBy(xpath = "//*[@id=\"alert-container\"]")
private WebElement toastMessage;

    @FindBy(linkText = "Contact")
    public WebElement contactButton;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[1]/div[1]/div/input")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[1]/div[2]/div/input")
    public WebElement contactEmailInput;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[2]/div[1]/div/input")
    public WebElement subjectInput;

    @FindBy(xpath= "//*[@id=\"contact\"]/div[1]/form/div[2]/div[2]/div/input")
    public WebElement phoneInput;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[5]/button")
    public WebElement messageInput;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[5]/button")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchSection;

    @FindBy(xpath = "//*[text()='Directions']")
    public WebElement directionsSection;

    @FindBy(css = "iframe[src*='google.com/maps']")
    public WebElement mapFrame;










    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    public WebElement getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(WebElement toastMessage) {
        this.toastMessage = toastMessage;
    }






}
