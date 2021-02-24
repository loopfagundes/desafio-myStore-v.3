package tasks;

import appobjects.ProductToCartAppObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductToCartTask {
    private WebDriver driver;
    private ProductToCartAppObject productToCartAppObject;

    public ProductToCartTask(WebDriver driver) {
        this.driver = driver;
        this.productToCartAppObject = new ProductToCartAppObject(driver);
    }

    public void pages() {
        shoppingCartSummary();
        address();
        shipping();
        payment();
        orderConfirmation();
    }

    private void shoppingCartSummary() {
        Assert.assertEquals("SHOPPING-CART SUMMARY\n" +
                "Your shopping cart contains: 2 Products", productToCartAppObject.getValidatePageShoppingSummaryLabel().getText());
        Assert.assertEquals("$47.38", productToCartAppObject.getValidatePriceTotalLabel().getText());
        productToCartAppObject.getProccedToCheckoutButton().click();
    }

    private void address() {
        Assert.assertEquals("ADDRESSES", productToCartAppObject.getValidatePageAddressesLabel().getText());
        productToCartAppObject.getProceedToCheckoutAddressesButton().click();
    }

    private void shipping() {
        Assert.assertEquals("SHIPPING", productToCartAppObject.getValidatePageShippingLabel().getText());
        productToCartAppObject.getTermsOfServiceCheckBox().click();
        productToCartAppObject.getProccedOfCheckoutTermsButton().click();
    }

    private void payment() {
        Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", productToCartAppObject.getValidatePagePaymentLabel().getText());
        Assert.assertEquals("$47.38", productToCartAppObject.getValidatePriceTotalPaymentLabel().getText());
        productToCartAppObject.getPayByBankWireButton().click();
        Assert.assertEquals("ORDER SUMMARY", productToCartAppObject.getValidatePageOrderSummaryLabel().getText());
        productToCartAppObject.getIconfirmMyOrderButton().click();
    }

    private void orderConfirmation() {
        Assert.assertEquals("ORDER CONFIRMATION", productToCartAppObject.getValidatePageOrderConfirmationLabel().getText());
        Assert.assertEquals("Your order on My Store is complete.", productToCartAppObject.getValidateMyStoreCompleteLabel().getText());
        productToCartAppObject.getLogoutButton().click();
    }
}