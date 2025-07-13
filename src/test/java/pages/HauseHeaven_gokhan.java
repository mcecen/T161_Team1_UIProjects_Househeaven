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
}
