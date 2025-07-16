package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageNavigation {

    static Actions actions = new Actions(Driver.getDriver());

        public static void arrowDown(int howMany) {
            ReusableMethods.bekle(2);
            for (int i = 0; i < howMany; i++) {
                actions.sendKeys(Keys.ARROW_DOWN).perform();
            }
        }

        public static void arrowUp(int howMany) {
            ReusableMethods.bekle(2);
            for (int i = 0; i < howMany; i++) {
                actions.sendKeys(Keys.ARROW_UP).perform();
            }
        }

        public static void bodyArrowDown(int howMany) {
            ReusableMethods.bekle(2);
            WebElement body = Driver.getDriver().findElement(By.tagName("body"));
            for (int i = 0; i < howMany; i++) {
                actions.moveToElement(body).click().sendKeys(Keys.ARROW_DOWN).perform();
            }
        }

    public static void bodyArrowUp(int howMany) {
        ReusableMethods.bekle(2);
        WebElement body = Driver.getDriver().findElement(By.tagName("body"));
        for (int i = 0; i < howMany; i++) {
            actions.moveToElement(body).click().sendKeys(Keys.ARROW_UP).perform();
        }
    }

    public static void pageDown(){
        ReusableMethods.bekle(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public static void pageUp(){
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    public static void scrollDownWithJS(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + pixels + ")");
        ReusableMethods.bekle(1);
    }

    public static void scrollUpWithJS(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, -" + pixels + ")");
        ReusableMethods.bekle(1);
    }

    public static void scrollToTopWithJS() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, 0)");
        ReusableMethods.bekle(1);
    }

    public static void scrollToBottomWithJS() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.bekle(1);
    }

    }
