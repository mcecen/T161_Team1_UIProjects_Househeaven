package tests.US014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC003 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void adminListingApprovedTest(){

        //Go to the URL address: https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin|Hause Heaven");

        //User sees the "SIGN IN BELOW" section.
        Assert.assertTrue(eda_hauseheavenPage.signInBelowText.isDisplayed());

        //User clicks on the Email/Username textbox.
        eda_hauseheavenPage.adminEmailTextBox.click();

        //User enters valid data into the Email/Username textbox.
        eda_hauseheavenPage.adminEmailTextBox.sendKeys(ConfigReader.getProperty("admin-eda"));

        //User clicks on the Password textbox.
        eda_hauseheavenPage.adminPasswordTextBox.click();

        //User enters valid data into the Password textbox.
        eda_hauseheavenPage.adminPasswordTextBox.sendKeys(ConfigReader.getProperty("admin-eda-password"));

        //User clicks the SIGN IN button.
        eda_hauseheavenPage.adminLoginButton.click();

        //User views the Househeaven Dashboard page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard");

        //User sees the "Active properties" link on the dashboard.
        Assert.assertTrue(eda_hauseheavenPage.activePropertiesLink.isDisplayed());
        //User sees the "Pending properties" link on the dashboard.
        //User clicks on the "1 Pending properties" link.
        //User sees the page https://qa.hauseheaven.com/admin/real-estate/properties.
        //User views the Househeaven Properties page.
        //User sees the listing titled "küçük bahçeli villa".
        //User verifies the listing title is clickable.
        //User clicks on the "küçük bahçeli villa" title.
        //User sees the page https://qa.hauseheaven.com/admin/real-estate/properties/edit.
        //User views the Edit property page.
        //User views the "Moderation status" dropdown on the right panel.
        //User sees the current status is set to "Pending".
        //User clicks on the "Moderation status" dropdown.
        //User sees "Approved" in the dropdown options.
        //User selects "Approved" from the dropdown.
        //User sees that "Approved" is now selected in the status field.
        //User clicks the "Save & Exit" button in the right panel.
        //User sees the page https://qa.hauseheaven.com/admin/real-estate/properties opened.
        //User clicks the "Dashboard" link in the right panel.
        //User sees the page https://qa.hauseheaven.com/admin opened.
        //User sees the "1 Active properties" link.
        //User sees the "0 Pending properties" link.
        //User clicks on the "1 Active properties" link.
        //User sees the page https://qa.hauseheaven.com/admin/real-estate/properties opened.
        //User views the Househeaven Properties page.
        //User sees the listing titled "küçük bahçeli villa".








    }


}
