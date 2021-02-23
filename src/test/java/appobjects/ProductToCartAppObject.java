package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductToCartAppObject {
    private WebDriver driver;

    public ProductToCartAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageShoppingSummaryLabel() {
        return driver.findElement(By.cssSelector("div[id='center_column'] h1"));
    }

    public WebElement getValidatePriceTotalLabel() {
        return driver.findElement(By.id("total_price"));
    }

    public WebElement getProccedToCheckoutButton() {
        return driver.findElement(By.cssSelector("p[class='cart_navigation clearfix'] a[title='Proceed to checkout']"));
    }

    public WebElement getValidatePageAddressesLabel() {
        return driver.findElement(By.cssSelector("#center_column > h1"));
    }

    public WebElement getProceedToCheckoutAddressesButton() {
        return driver.findElement(By.cssSelector("#center_column > form > p > button"));
    }

    public WebElement getValidatePageShippingLabel() {
        return driver.findElement(By.cssSelector("#carrier_area > h1"));
    }

    public WebElement getTermsOfServiceCheckBox() {
        return driver.findElement(By.id("cgv"));
    }

    public WebElement getProccedOfCheckoutTermsButton() {
        return driver.findElement(By.cssSelector("#form > p > button > span"));
    }

    public WebElement getValidatePagePaymentLabel() {
        return driver.findElement(By.cssSelector("#center_column > h1"));
    }

    public WebElement getValidatePriceTotalPaymentLabel() {
        return driver.findElement(By.id("total_price"));
    }

    public WebElement getPayByBankWireButton() {
        return driver.findElement(By.cssSelector("div[id='HOOK_PAYMENT'] a[title='Pay by bank wire']"));
    }

    public WebElement getValidatePageOrderSummaryLabel() {
        return driver.findElement(By.cssSelector("#center_column > h1"));
    }

    public WebElement getIconfirmMyOrderButton() {
        return driver.findElement(By.cssSelector("#cart_navigation > button > span"));
    }

    public WebElement getValidatePageOrderConfirmationLabel() {
        return driver.findElement(By.cssSelector("#center_column > h1"));
    }

    public WebElement getValidateMyStoreCompleteLabel() {
        return driver.findElement(By.cssSelector("#center_column > div > p > strong"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector("div[class='nav'] a[class='logout']"));
    }
}