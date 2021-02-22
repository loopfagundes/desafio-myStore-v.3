package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexAppObject {
    private WebDriver driver;

    public IndexAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.className("login"));
    }
}