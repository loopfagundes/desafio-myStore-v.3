package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitFw;

public class ProductAppObject {
    private WebDriver driver;

    public ProductAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getListProductsButton() {
        return driver.findElement(By.className("icon-th-list"));
    }

    public WebElement getChooseProductPrintedSummerDressButton() {
        return driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.center-block.col-xs-4.col-xs-7.col-md-4 > h5 > a"));
    }

    public WebElement getValidateNameProductText() {
        return driver.findElement(By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.id("add_to_cart"));
    }

    public WebElement getProccedToCheckoutButton() {
        WaitFw.elementToBeClickable(driver, driver.findElement(By.cssSelector("div[class='button-container'] a[title='Proceed to checkout']")));
        return driver.findElement(By.cssSelector("div[class='button-container'] a[title='Proceed to checkout']"));
    }

    public WebElement getDressesButton() {
        return driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a"));
    }

    public WebElement getChooseProductPrintedChiffonDressButton() {
        return driver.findElement(By.cssSelector("img[title='Printed Chiffon Dress']"));
    }

    public WebElement getValidateNameProductTwoText() {
        WaitFw.visibilityOf(driver, driver.findElement(By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1")));
        return driver.findElement(By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1"));
    }

    public WebElement getAddToCartTwoButton() {
        return driver.findElement(By.id("add_to_cart"));
    }

    public WebElement getProccedToCheckoutTwoButton() {
        WaitFw.elementToBeClickable(driver, driver.findElement(By.cssSelector("div[class='button-container'] a[title='Proceed to checkout']")));
        return driver.findElement(By.cssSelector("div[class='button-container'] a[title='Proceed to checkout']"));
    }
}