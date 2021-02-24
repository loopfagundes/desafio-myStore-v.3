package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitFw;

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

    public WebElement getFirstNameTextField() {
        WaitFw.visibilityOf(driver, driver.findElement(By.id("customer_firstname")));
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getGenderCheckBox() {
        WaitFw.elementToBeClickable(driver, driver.findElement(By.id("id_gender1")));
        return driver.findElement(By.id("id_gender1"));
    }
}