package tests.US011;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseheavenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.driver;

public class TC003 {


    @Test
    public void verifyMapIframeSourceContainsAddress() {
        HauseheavenPage hauseheavenPage = new HauseheavenPage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        hauseheavenPage.contactLink.click();
        ReusableMethods.bekle(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", hauseheavenPage.contactPhoneInfo);

        Assert.assertTrue(hauseheavenPage.sideBarAddress.isDisplayed());

        // Address in the sidebar
        String sidebarText = hauseheavenPage.sideBarAddress.getText().toLowerCase();
        System.out.println("Sidebar: " + sidebarText);

        // take the src of iframe
        //normal iframe gecislerde hata verdi
        // chatgpt yardımı ile iframe src'sini aldim
        WebElement iframeElement = Driver.getDriver().findElement(By.xpath("//iframe[contains(@src,'maps')]"));
        // bu kısmı dinamik hale getiremedim

        String iframeSrc = iframeElement.getAttribute("src").toLowerCase();
        System.out.println("Iframe src: " + iframeSrc);

        // Is the address in the src of the iframe?
        Assert.assertTrue(iframeSrc.contains("wild+indigo") || iframeSrc.contains("houston"));













        Driver.quitDriver();
    }
}



