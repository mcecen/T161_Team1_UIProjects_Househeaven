package tests.US014;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Eda_HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {

    Eda_HauseheavenPage eda_hauseheavenPage = new Eda_HauseheavenPage();

    @Test
    public void adminListingApprovedTest(){

        //Go to the URL address: https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin | Hause Heaven");

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
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard | Hause Heaven");

        //User sees the "Active properties" link on the dashboard.
        Assert.assertTrue(eda_hauseheavenPage.activePropertiesLink.isDisplayed());

        //User sees the "Pending properties" link on the dashboard.
        Assert.assertTrue(eda_hauseheavenPage.pendingPropertiesLink.isDisplayed());

        //User clicks on the "Pending properties" link.
        eda_hauseheavenPage.pendingPropertiesLink.click();

        //User views the Househeaven Properties page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Properties | Hause Heaven");

        ReusableMethods.bekle(3);
        //User sees the listing titled "küçük bahçeli villa".
        Assert.assertTrue(eda_hauseheavenPage.adminListingTitle.isDisplayed());

        //User clicks on the "küçük bahçeli villa" title.
        eda_hauseheavenPage.editButton.click();

        //User views the Edit property page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Edit property \"küçük bahçeli villa\" | Hause Heaven");

        //User views the "Moderation status" dropdown on the right panel.
        Assert.assertTrue(eda_hauseheavenPage.moderationStatusText.isDisplayed());

        //User sees the current moderationstatus is set to "Pending".
        Assert.assertEquals(eda_hauseheavenPage.moderationStatusBox.getText(), "Pending");

        //User clicks on the "Moderation status" dropdown.
        eda_hauseheavenPage.moderationStatusBox.click();

        //User sees "Approved" in the dropdown options.
        Assert.assertTrue(eda_hauseheavenPage.approvedStatus.isDisplayed());

        //User selects "Approved" from the dropdown.
        Select select = new Select(eda_hauseheavenPage.moderationStatusSelect);
        select.selectByValue("approved");

        //User sees that "Approved" is now selected in the status field.
        Assert.assertEquals(eda_hauseheavenPage.moderationStatusBox.getText(), "Approved");

        //User clicks the "Save & Exit" button in the right panel.
        eda_hauseheavenPage.adminSaveExitButton.click();

        //User views the Househeaven Properties page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Properties | Hause Heaven");

        //User clicks the "Dashboard" link in the right panel.
        eda_hauseheavenPage.adminDashboardLink.click();

        //User views the Househeaven Dashboard page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard | Hause Heaven");

        //User sees the "Active properties" link.
        Assert.assertTrue(eda_hauseheavenPage.activePropertiesLink.isDisplayed());

        //User clicks on the "Active properties" link.
        eda_hauseheavenPage.activePropertiesLink.click();

        //User views the Househeaven Properties page.
        Assert.assertEquals(Driver.getDriver().getTitle(), "Properties | Hause Heaven");

        //User sees the listing titled "küçük bahçeli villa".
        Assert.assertTrue(eda_hauseheavenPage.adminListingTitle.isDisplayed());

        //User sees the text Approved under "Moderation status"
        Assert.assertTrue(eda_hauseheavenPage.approvedText.isDisplayed());
        Assert.assertEquals(eda_hauseheavenPage.approvedText.getText(), "Approved");

        //User logs out
        eda_hauseheavenPage.profilLogoutLink.click();
        eda_hauseheavenPage.logoutButton.click();

        //User views the Househeaven homepage
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin | Hause Heaven");

        Driver.quitDriver();









    }


}
