package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHeaven_yusufcelal {


    public HauseHeaven_yusufcelal() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static String AdminLink = "https://qa.hauseheaven.com/admin/login";

    @FindBy(id = "login_button") // ya da xpath, name, css gibi locator tipi
    public WebElement loginButton;

    @FindBy(xpath = ("//*[@id='emailGroup']//input"))
    public WebElement emailInput;

    @FindBy(xpath = ("//*[@id='passwordGroup']//input"))
    public WebElement passwordInput;

    @FindBy(xpath = ("//button[@type='submit']"))
    public WebElement signInButton;

//    Admin giriş kayıt bilgileri
//      ***************************************************************       //

    @FindBy(xpath = ("//*[@id=\"main\"]/div[3]/div[1]/a"))
    public WebElement activeProperties;

    @FindBy(xpath = ("//*[@id=\"main\"]/div[3]/div[2]/a"))
    public WebElement pendingProperties;

    @FindBy(xpath = ("//*[@id=\"main\"]/div[3]/div[3]/a"))
    public WebElement expiredProperties;

    @FindBy(xpath = ("//*[@id=\"main\"]/div[3]/div[4]/a"))
    public WebElement agents;

//      Dashboard anasayfasının görünür hali.
//      ***************************************************************       //

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/ul/li[4]/a"))
    public WebElement userName; // This is the user name in the top-right corner of the admin dashboard

//      ***************************************************************       //

    @FindBy(xpath = ("//*[@id=\"cms-plugins-blog\"]/a"))
    public WebElement blogLink;

    @FindBy(xpath = ("//*[@id=\"cms-plugins-blog-post\"]"))
    public WebElement postsLink;

    @FindBy(xpath = ("//*[@id=\"cms-plugins-blog-categories\"]/a"))
    public WebElement categoriesLink;

    @FindBy(xpath = ("//*[@id=\"cms-plugins-blog-tags\"]/a"))
    public WebElement tagsLink;

//      Blog ve alt menuler Posts, Categories, Tags.
//      ***************************************************************       //

    @FindBy(xpath = ("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/button"))
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

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-category-form\"]/div[13]/div[2]/div/button[2]")
    public WebElement SaveButton;


//      Save & Exit ve Save görüntüleme.
//      ***************************************************************       //

    @FindBy(xpath = "//*[@id=\"cms-core-dashboard\"]/a/span")
    public WebElement dashboardLink;

    @FindBy(xpath = "//*[@id=\"cms-core-dashboard\"]/a/span")
    public WebElement dashboardText;

//      Dashboard görüntüleme.
//      ***************************************************************       //

    @FindBy(xpath = "//*[@id=\"botble-blog-tables-post-table_wrapper\"]/div[2]/button[1]/span/span")
    public WebElement addNewCreateButton;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//*[@id=\"tab_detail\"]/div[5]/div[3]/div[2]/div/p")
    public WebElement Content;

    @FindBy(xpath = "//*[@id=\"status\"]")
    public WebElement statusDropdown;

    @FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[1]/label/input")
    public WebElement LatestNewsCheckbox;

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-post-form\"]/div[2]/div[2]/div[7]/div[2]/tags/span")
    public WebElement TagsWrite;

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-post-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[2]")
    public WebElement saveCreateButton;

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-post-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement saveAndExitCreateButton;

//      Blog Post Oluşturma işlemleri.
//      ***************************************************************       //

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/a/i")
    public WebElement addNewCtgrsCreateButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement nameInputCtgrs;

    //----------

    @FindBy(xpath = "//*[@id='select2-parent_id-container']")
    public WebElement dropdownInputCtgrs;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement searchBoxCtgrs;  // Açılan kutudaki arama alanı

    //----------

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionInputCtgrs;

    //----------

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-category-form\"]/div[10]/div")
    public WebElement statusdropdownInputCtgrs;

    @FindBy(xpath = "//*[@id=\"status\"]")
    public WebElement statussearchBoxCtgrs;  // Açılan kutudaki arama alanı
    //----------

    @FindBy(xpath = "//*[@id=\"botble-blog-forms-category-form\"]/div[13]/div[2]/div/button[1]")
    public static WebElement saveAndExitButtonCtgrs;


//      Blog Categories Oluşturma işlemleri.
//      ***************************************************************       //
}

