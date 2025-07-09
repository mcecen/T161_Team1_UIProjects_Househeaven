package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHeaven_28 {
    public HauseHeaven_28(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = ("//*[@id='emailGroup']//input"))
    public WebElement emailInput;

    @FindBy (xpath = ("//*[@id='passwordGroup']//input"))
    public WebElement passwordInput;

    @FindBy (xpath = ("//button[@type='submit']"))
    public WebElement signInButton;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[1]/a"))
    public WebElement activeProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[2]/a"))
    public WebElement pendingProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[3]/a"))
    public WebElement expiredProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[4]/a"))
    public WebElement agents;

    @FindBy (xpath = ("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/ul/li[4]/a"))
    public WebElement userName; // This is the user name in the top-right corner of the admin dashboard



}

