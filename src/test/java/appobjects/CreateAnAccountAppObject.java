package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccountAppObject {
    private WebDriver driver;

    public CreateAnAccountAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageAuthenticationLabel() {
        return driver.findElement(By.cssSelector("#center_column > h1"));
    }

    public WebElement getCreateEmailTextField() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement getCreateAnAccountButton() {
        return driver.findElement(By.cssSelector("#SubmitCreate > span"));
    }

    public WebElement getGenderCheckBox() {
        return driver.findElement(By.id("uniform-id_gender2"));
    }
}