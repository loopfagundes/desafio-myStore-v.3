package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    public WebElement getGenderCheckBox() {
        return driver.findElement(By.id("id_gender1"));
    }

    public WebElement getFirstNameTextField() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getLastNameTextField() {
        return driver.findElement(By.id("customer_lastname"));
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(By.id("passwd"));
    }

    public Select getDaysComboBox() {
        return new Select(driver.findElement(By.id("days")));
    }

    public Select getMonthsComboBox() {
        return new Select(driver.findElement(By.id("months")));
    }

    public Select getYearsComboBox() {
        return new Select(driver.findElement(By.id("years")));
    }

    public WebElement getAddressTextField() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCityTextField() {
        return driver.findElement(By.id("city"));
    }

    public Select getStateComboBox() {
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement getPostalCodeTextField() {
        return driver.findElement(By.id("postcode"));
    }

    public WebElement getNumberPhoneTextField() {
        return driver.findElement(By.id("phone"));
    }

    public WebElement getRegisterButton() {
        return driver.findElement(By.id("submitAccount"));
    }
}