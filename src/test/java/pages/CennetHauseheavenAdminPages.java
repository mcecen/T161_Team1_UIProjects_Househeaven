package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CennetHauseheavenAdminPages {
    public CennetHauseheavenAdminPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="(//*[@class='form-control'])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath ="//*[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(className = "signin")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@class='rounded-circle'])[9]")
    public WebElement profilLogosu;

    @FindBy (xpath = "//*[@id=\"cms-plugins-real-estate\"]/a")
    public WebElement realEstateBasligi;

    @FindBy(xpath= ("//*[@id=\"cms-plugins-property\"]/a"))
    public WebElement propertiesBasligi;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table\"]/tbody/tr[1]/td[8]/div/a[1]/i")
    public WebElement editIkonu;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement titleAlani;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionAlani;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement contentAlani;

    @FindBy(xpath = "//*[@id='location']")
    public WebElement propertyLocationAlani;

    @FindBy(id = "type_id")
    public WebElement typeAlaniDdm;

    @FindBy(className = "icon-arrow-up-circle")
    public WebElement yukariOkIkonu;

    @FindBy(xpath = "//select[@id='moderation_status']")
    public WebElement moderationStatusDdm;


    @FindBy(xpath = "//li[contains(text(), 'Approved')]")
    public WebElement approvedButton;


    @FindBy(xpath = "(//*[@name='submit'])[2]")
    public WebElement saveButton;

    @FindBy(className = "toast-message")
    public WebElement createdSeccussfullyMesaji;

    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/admin/real-estate/packages']")
    public WebElement packageMenuAlanı;

    @FindBy(xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement packageCreateButton;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement packageNameText;

    @FindBy(xpath = "//*[@class='form-control input-mask-number']")
    public WebElement packagePriceText;

    @FindBy(xpath = "//input[@id='percent-save-number']")
    public WebElement packagePersentSaveText;

    @FindBy(xpath = "(//input[@id='price-number'])[2]")
    public WebElement packageNumberOfListingText;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement packageSaveButton;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement packageSaveExitButton;

    @FindBy(xpath = "(//*[@data-bs-original-title='Edit'])[1]")
    public WebElement packageEditButton;

    @FindBy(xpath = "(//*[@data-bs-original-title='Delete'])[1]")
    public WebElement packageDeleteButton;

    @FindBy(xpath = "    //button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement packageDeletePopUpButton;



}



