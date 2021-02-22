package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObject {
    private WebDriver driver;

    public AuthenticationAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginTextField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.id("SubmitLogin"));
    }
}