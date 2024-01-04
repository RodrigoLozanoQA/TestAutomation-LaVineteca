package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform {

    public static void perform(WebDriver webDriver, By locator){
        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(locator)).perform();
    }
}
