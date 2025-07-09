package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHeaven_yusufcelal {



    public HauseHeaven_yusufcelal(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = ("//*[@id='emailGroup']//input"))
    public WebElement emailInput;

    @FindBy (xpath = ("//*[@id='passwordGroup']//input"))
    public WebElement passwordInput;

    @FindBy (xpath = ("//button[@type='submit']"))
    public WebElement signInButton;

//    Admin giriş kayıt bilgileri
//      ***************************************************************       //

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[1]/a"))
    public WebElement activeProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[2]/a"))
    public WebElement pendingProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[3]/a"))
    public WebElement expiredProperties;

    @FindBy (xpath = ("//*[@id=\"main\"]/div[3]/div[4]/a"))
    public WebElement agents;

//      Dashboard anasayfasının görünür hali.
//      ***************************************************************       //

    @FindBy (xpath = ("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/ul/li[4]/a"))
    public WebElement userName; // This is the user name in the top-right corner of the admin dashboard

//      ***************************************************************       //

    @FindBy (xpath = ("//*[@id=\"cms-plugins-blog\"]/a"))
    public WebElement blogLink;

    @FindBy (xpath = ("//*[@id=\"cms-plugins-blog-post\"]"))
    public WebElement postsLink;

    @FindBy (xpath = ("//*[@id=\"cms-plugins-blog-categories\"]/a"))
    public WebElement categoriesLink;

    @FindBy (xpath = ("//*[@id=\"cms-plugins-blog-tags\"]/a"))
    public WebElement tagsLink;

//      Blog ve alt menuler Posts, Categories, Tags.
//      ***************************************************************       //

    @FindBy (xpath = ("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/button"))
    public WebElement addNewCategoryButton;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/button")
    public WebElement expandAllButton;

    public String ExpandAll = "Expand all";

    @FindBy(xpath = "//*[normalize-space(text())='Expand all']")
    public WebElement expandAllTextWrite;

//      Collapse all ve Expand all görüntüleme.
//      ***************************************************************       //


    @FindBy(xpath = "//*[@id='botble-blog-forms-category-form']/div[13]/div[2]/div/button[1]")
    public WebElement saveAndExitButton;
   @FindBy(xpath = "//*[normalize-space(text())='Save & Exit']")
    public WebElement SaveAndExit;
    public String SaveAndExitWrite = "Save & Exit";


    @FindBy(xpath = "//*[@id=\"botble-blog-forms-category-form\"]/div[13]/div[2]/div/button[2]")
    public WebElement SaveButton;
    @FindBy(xpath = "//*[normalize-space(text())='Save']")
    public WebElement Save;
    public String SaveWrite = "Save";

//      Save & Exit ve Save görüntüleme.
//      ***************************************************************       //
























}

