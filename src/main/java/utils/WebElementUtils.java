package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WebElementUtils {

    static WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),Duration.ofSeconds(10));
    static JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();

    public static void waitForVisibleElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickHiddenElement(WebElement element){
        js.executeScript("arguments[0].click();", element);
    }

    public static void scrollUp(){
        js.executeScript("window.scrollBy(0,-300)");
    }

    public static boolean isElementVisible(WebElement element){
        try {
            return element.isDisplayed();
        } catch (Exception ignored){
            return false;
        }
    }

    public static void deleteFieldWithBlock(WebElement element){
        String s = Keys.chord(Keys.CONTROL, "a");
        element.sendKeys(s);
        element.sendKeys(Keys.DELETE);
    }




}
