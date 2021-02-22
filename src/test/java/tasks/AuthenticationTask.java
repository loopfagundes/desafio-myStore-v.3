package tasks;

import appobjects.AuthenticationAppObject;
import org.openqa.selenium.WebDriver;

public class AuthenticationTask {
    private WebDriver driver;
    private AuthenticationAppObject authenticationAppObject;

    public AuthenticationTask(WebDriver driver) {
        this.driver = driver;
        this.authenticationAppObject = new AuthenticationAppObject(driver);
    }

    public void login(String email, String password) {
        loginAndPassword(email, password);
    }

    private void loginAndPassword(String email, String password) {
        authenticationAppObject.getLoginTextField().sendKeys(email);
        authenticationAppObject.getPasswordTextField().sendKeys(password);
        authenticationAppObject.getSignInButton().click();
    }
}