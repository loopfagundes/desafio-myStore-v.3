package tasks;

import appobjects.ProductAppObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductTask {
    private WebDriver driver;
    private ProductAppObject productAppObject;

    public ProductTask(WebDriver driver) {
        this.driver = driver;
        this.productAppObject = new ProductAppObject(driver);
    }

    public void chooseProduct() {
        productPrintedSummerDress();
        productPrintedDress();
    }

    private void productPrintedSummerDress() {
        productAppObject.getChooseProductPrintedSummerDressButton().click();
        Assert.assertEquals("Printed Summer Dress", productAppObject.getValidateNameProductText().getText());
        productAppObject.getAddToCartButton().click();
        productAppObject.getProccedToCheckoutButton().click();
    }

    private void productPrintedDress() {
        productAppObject.getDressesButton().click();
        productAppObject.getChooseProductPrintedChiffonDressButton().click();
        Assert.assertEquals("Printed Chiffon Dress", productAppObject.getValidateNameProductTwoText().getText());
        productAppObject.getAddToCartTwoButton().click();
        productAppObject.getProccedToCheckoutTwoButton().click();
    }
}