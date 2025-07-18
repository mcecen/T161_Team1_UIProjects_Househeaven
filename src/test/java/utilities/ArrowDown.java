package utilities;

import org.openqa.selenium.Keys;

public class ArrowDown {

    public static void arrowDown(int howMany) {
        for (int i = 0; i < howMany; i++) {
            org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Driver.getDriver());
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
    }

}
