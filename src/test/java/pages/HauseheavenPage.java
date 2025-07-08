package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseheavenPage {

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


}
