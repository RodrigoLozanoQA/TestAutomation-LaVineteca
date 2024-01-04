package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Click {
    public static void on(WebDriver webDriver, By locator){

        webDriver.findElement(locator).click();
    }
    public static void onToLeftOf(WebDriver webDriver, By locator, By locatortoLeftOf){

        webDriver.findElement(with(locator).toLeftOf(locatortoLeftOf)).click();
    }

    public static void onClickElementList(WebDriver webDriver, By locator,int element){
        webDriver.findElements(locator).get(element).click();
    }
}
