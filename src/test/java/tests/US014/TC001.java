package tests.US014;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PageNavigation;
import utilities.ReusableMethods;

public class TC001 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void addPropertyTesti(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hause Heaven");

        //User clicks the 'Add Property' link in the header section.
        eda_hauseheavenPage.addPropertyLink.click();

        //User sees the page https://qa.hauseheaven.com/public/login after clicking the link.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");

        //User views the login form on the Househeaven login page.
        Assert.assertTrue(eda_hauseheavenPage.loginForm.isDisplayed());

        //User enters valid data into the Email/Username field.
        eda_hauseheavenPage.loginEmailTextbox.sendKeys(ConfigReader.getProperty("user-eda"));

        //User enters valid data into the Password field.
        eda_hauseheavenPage.loginPasswordTextbox.sendKeys(ConfigReader.getProperty("user-eda-password"));

        //User clicks the Login button.
        eda_hauseheavenPage.loginButton.click();

        //User sees the page https://qa.hauseheaven.com/public/account/properties/create.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Write a property");

        //User views the listing creation form.
        Assert.assertTrue(eda_hauseheavenPage.listingCreationform.isDisplayed());

        //User sees the Save button in the right Publish section
        Assert.assertTrue(eda_hauseheavenPage.saveButton.isDisplayed());

        //User clicks the Title textbox and types 'geniş bahçeli dubleks villa'.
        eda_hauseheavenPage.titleTextbox.sendKeys("geniş bahçeli dubleks villa");

        PageNavigation.scrollDownWithJS(200);

        //User clicks the Description textbox and types 'Eşyasız'.
        eda_hauseheavenPage.descriptionTextbox.sendKeys("Eşyasız");

        PageNavigation.scrollDownWithJS(200);

        //User clicks the Content textbox and types 'iç-dış cephe boyaları yapıldı'.
        eda_hauseheavenPage.contentTextbox.sendKeys("iç-dış cephe boyaları yapıldı");

        PageNavigation.scrollDownWithJS(300);

        //User selects city 'Eryaman'.
        eda_hauseheavenPage.cityDropdown.click();
        ReusableMethods.bekle(1);


        actions.click(eda_hauseheavenPage.citySearchTextbox)
                .sendKeys("Eryaman")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        PageNavigation.scrollDownWithJS(300);

        //User types 'Ankara' into the Property Location textbox.
        eda_hauseheavenPage.propertyLocationTextbox.sendKeys("Ankara");

        //User types '1.000.000' into Price textbox.
        eda_hauseheavenPage.priceTextbox.sendKeys("1.000.000");

        PageNavigation.scrollDownWithJS(200);

        //User selects 'For Sale' from Type dropdown.
        Select select = new Select(eda_hauseheavenPage.typeDropdown);
        select.selectByValue("1");

        PageNavigation.scrollDownWithJS(200);

        //User checks 'Wifi', 'Garden', 'Parking'.
        eda_hauseheavenPage.wifiCheckbox.click();
        eda_hauseheavenPage.parkingCheckbox.click();
        eda_hauseheavenPage.gardenCheckbox.click();

        PageNavigation.scrollToTopWithJS();

        //User selects 'Villa' from Category dropdown.
        eda_hauseheavenPage.categoryDropdown.click();
        ReusableMethods.bekle(1);

        actions.click(eda_hauseheavenPage.categorySearchTextbox)
                .sendKeys("villa")
                .build()
                .perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ENTER).perform();

        //User clicks the Save button.
        eda_hauseheavenPage.saveButton.click();

        //User sees https://qa.hauseheaven.com/public/account/properties/edit/ page open.
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Edit property"));

        //User clicks Properties link.
        eda_hauseheavenPage.propertiesLink.click();

        //User sees https://qa.hauseheaven.com/account/properties page open.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Properties");

        //User sees listing titled 'geniş bahçeli dubleks villa'.
        Assert.assertTrue(eda_hauseheavenPage.listingTitle.isDisplayed());

        //User clicks the listing title.
        eda_hauseheavenPage.listingTitle.click();

        //User edits title to 'küçük bahçeli villa'.
        eda_hauseheavenPage.titleTextbox.clear();
        eda_hauseheavenPage.titleTextbox.sendKeys("küçük bahçeli villa");

        //User clicks Save & Exit.
        eda_hauseheavenPage.saveExitButton.click();

        //User sees updated title 'küçük bahçeli villa'.
        Assert.assertTrue(eda_hauseheavenPage.editListingTitle.isDisplayed());

        //User clicks Dashboard link.
        eda_hauseheavenPage.dashboardLink.click();

        //User sees text '0 Approved properties'.
        Assert.assertTrue(eda_hauseheavenPage.approvedProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.approvedProperties.getText(), "0\nApproved properties");

        //User sees text '1 Pending approve properties'.
        Assert.assertTrue(eda_hauseheavenPage.pendingApproveProperties.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.pendingApproveProperties.getText(), "1\nPending approve properties");

        Driver.quitDriver();

    }
}
