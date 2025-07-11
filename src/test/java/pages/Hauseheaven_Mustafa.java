package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hauseheaven_Mustafa {

    public Hauseheaven_Mustafa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = ("//input[@id='email']"))
    public WebElement emailText;

    @FindBy (xpath = ("//input[@id='password']"))
    public WebElement passwordText;

    @FindBy (xpath = ("//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]/a"))
    public WebElement signInButton;

    @FindBy (xpath = ("(//button[@type='submit'])[1]"))
    public WebElement loginButton;

    @FindBy (xpath = ("//*[@id=\"navigation\"]/div[2]/ul[2]/li[2]/a"))
    public WebElement profileButton;

    @FindBy (xpath = ("//*[@id=\"filter_search\"]/div[2]/div/div[2]/ul/li[3]/a"))
    public WebElement buyCreditButton;

    @FindBy (xpath = ("(//button[@class='btn btn-primary mt-2'])[2]"))
    public WebElement buyFivePackageButton;










}
