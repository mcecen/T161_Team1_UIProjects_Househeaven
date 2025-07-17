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

    @FindBy(xpath = ("//*[@id=\"emailGroup\"]/input"))
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

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/ul/li[5]/a/span"))
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

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/ul/li[1]/a[1]/span[1]")
    public WebElement latestNewscollapseAll; // Collapse all butonu

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/ul/li[1]/i")
    public WebElement latestNewscollapseAllIcon; // Collapse all icon

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/ul/li[2]/a[1]/span[1]")
    public WebElement BuildingMaterialscollapseAll; // Collapse all butonu

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/ul/li[1]/ul/li/a[1]/i")
    public WebElement latestNewsRecord; // Latest news link

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/ul/li[1]/ul/li/a[3]/i")
    public WebElement DeleteDisplayed; // House architecture link

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/a")
    public WebElement NewCreateLink; // Yeni Kayıt Oluştur linki

//      Blog Categories Tıklama işlemleri.
//      ***************************************************************       //

    @FindBy(xpath = "//*[@id=\"cms-plugins-real-estate\"]/a/span[1]")
    public WebElement realEstateLink; // Real Estate link

    @FindBy(xpath = "//*[@id=\"cms-plugins-property\"]/a")
    public WebElement propertyLink; // Property link
    //------------------------//

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/a")
    public WebElement propertyCategoriesLink; // Property Categories link

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/div/a")
    public WebElement PropertysearchBox; // Add New Property button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table_filter\"]/label/input")
    public WebElement PropertysearchBoxInput; // Property search box input field

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table_length\"]/label/span/select")
    public WebElement PropertysearchBoxInputNext; // Property search box input text

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table_length\"]/label/span/select")
    public WebElement PropertysearchBoxInputSelect; // Property search box select dropdown

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table_next\"]")
    public WebElement PropertysearchBoxInputNextButton; // Property search box next button

    @FindBy(xpath = "//*[@id='botble-real-estate-tables-property-table_previous']/a")
    public WebElement PropertysearchBoxInputPreviousButton; // Property search box previous button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table_wrapper\"]/div[2]/button[1]")
    public WebElement PropertyCreate;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement PropertyNameText;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement PropertyDescriptionText;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[1]/div[1]/div/div[5]/div[3]/div[2]/div")
    public WebElement PropertyForm;

    @FindBy(xpath = "//*[@id=\"location\"]")
    public WebElement PropertyLocation;

    @FindBy(xpath = "//*[@id=\"app-real-estate\"]/div/div[2]/button")
    public WebElement PropertyAddNew;

    @FindBy(xpath = "//*[@id=\"type_id\"]/option[2]")
    public WebElement PropertyTypeSatis;

    @FindBy(xpath = "//input[@name='features[]' and @value='1']")
    public WebElement PropertywifiCheckbox;

    @FindBy(xpath = "//input[@name='features[]' and @value='4']")
    public WebElement PropertyBalkonyCheckbox;

    @FindBy(xpath = "//input[@name='features[]' and @value='8']")
    public WebElement PropertyKlimaCheckbox;

    @FindBy(xpath = "//input[@name='features[]' and @value='11']")
    public WebElement PropertyEvcilHayvanCheckbox;

    @FindBy(xpath = "//input[@name='features[]' and @value='40']")
    public WebElement PropertyDisAlanCheckbox;

    @FindBy(xpath = "//input[@name='features[]' and @value='69']")
    public WebElement PropertyAdaCheckbox;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement PropertySaveAndExitButton;


    //----------*******--------//
    @FindBy(xpath = "//*[@id=\"cms-plugins-re-feature\"]/a")
    public WebElement featureLink; // Feature link
    //------------------------//

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/a")
    public WebElement featureCategoriesLink; // Feature Categories link

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/div/a")
    public WebElement featuresearchBox; // Add New Feature button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_filter\"]/label/input")
    public WebElement featuresearchBoxInput; // Feature search box input field

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_filter\"]/label")
    public WebElement featuresearchBoxInputNext; // Feature search box input text

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_length\"]/label/span/select")
    public WebElement featuresearchBoxInputSelect; // Feature search box select dropdown

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_next\"]/a")
    public WebElement featuresearchBoxInputNextButton; // Feature search box next button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_previous\"]/a")
    public WebElement featuresearchBoxInputPreviousButton; // Feature search box previous button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-feature-table_wrapper\"]/div[2]/button[1]")
    public WebElement featureCreate;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement featureTitleInput;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-forms-feature-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement featureSaveAndExitButton;

    //----------*******--------//
    @FindBy(xpath = "//*[@id=\"cms-plugins-facility\"]/a")
    public WebElement facilityLink; // Facility link
    //------------------------//

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/a")
    public WebElement facilityCategoriesLink; // Feature Categories link

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/div/a")
    public WebElement facilitysearchBox; // Add New Feature button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-facility-table_filter\"]/label/input")
    public WebElement facilitysearchBoxInput; // Feature search box input field

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-facility-table_filter\"]/label/input")
    public WebElement facilitysearchBoxInputNext; // Feature search box input text

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-facility-table_length\"]/label/span/select")
    public WebElement facilitysearchBoxInputSelect; // Feature search box select dropdown

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-facility-table_length\"]/label/span/select")
    public WebElement facilitysearchBoxInputNextButton; // Feature search box next button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-facility-table_previous\"]/a")
    public WebElement facilitysearchBoxInputPreviousButton; // Feature search box previous button

    //----------*******--------//
    @FindBy(xpath = "//*[@id=\"cms-plugins-real-estate-category\"]/a")
    public WebElement realEstateCategoriesLink; // Real Estate Categories link
    //------------------------//

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/a")
    public WebElement categoriesCategoriesLink; // Feature Categories link

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/div/a")
    public WebElement categoriessearchBox; // Add New Categories button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-category-table_filter\"]/label/input")
    public WebElement categoriessearchBoxInput; // Categories search box input field

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-category-table_length\"]/label/span/select")
    public WebElement categoriessearchBoxInputNext; // Categories search box input text

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-category-table_length\"]/label/span/select/option[1]")
    public WebElement categoriessearchBoxInputSelect; // Categories search box select dropdown

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-category-table_next\"]/a")
    public WebElement categoriessearchBoxInputNextButton; // Categories search box next button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-category-table_previous\"]/a")
    public WebElement categoriessearchBoxInputPreviousButton; // Categories search box previous button


    //----------*******--------//
    @FindBy(xpath = "//*[@id=\"cms-plugins-real-estate-type\"]/a")
    public WebElement realEstateTypeLink; // Real Estate Type link
    //------------------------//

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/a")
    public WebElement typeCategoriesLink; // Feature Type link

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/div/a")
    public WebElement typesearchBox; // Add New Type button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-type-table_filter\"]/label/input")
    public WebElement typesearchBoxInput; // Type search box input field

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-type-table_filter\"]/label")
    public WebElement typesearchBoxInputNext; // Type search box input text

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-type-table_length\"]/label/span/select/option[1]")
    public WebElement typesearchBoxInputSelect; // Type search box select dropdown

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-type-table_next\"]/a")
    public WebElement typesearchBoxInputNextButton; // Type search box next button

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-type-table_previous\"]/a")
    public WebElement typesearchBoxInputPreviousButton; // Type search box previous button


    //----------*******--------//


//      Real Estate Categories Tıklama işlemleri.
//      ***************************************************************       //


}

