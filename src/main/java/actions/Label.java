package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Label {
    public static Boolean getLabelIsDiplayed(WebDriver webDriver, By locator){

      return webDriver.findElement(locator).isDisplayed();
    }
}
