package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HauseHaven_Mahmut_AdminLoginPage {

        public HauseHaven_Mahmut_AdminLoginPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

    @FindBy(xpath= "//input[@type='text']")
    public WebElement UsernameTextbox;

    @FindBy (xpath = "//input[@type='password']" )
    public WebElement PasswordTextbox;

    @FindBy (xpath = "//span[@class='signin']" )
    public WebElement SignInButton;

    @FindBy (xpath = "//li[@class='breadcrumb-item active']" )
    public WebElement DashboardLogo;
}
