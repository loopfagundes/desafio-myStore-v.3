package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFw {
    private WebDriver driver;
    private static final int WAIT_SEC = 15;

    public static void elementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_SEC);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void visibilityOf(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_SEC);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}