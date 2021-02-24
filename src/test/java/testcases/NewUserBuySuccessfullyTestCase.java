package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tasks.*;
import utils.BaseTest;

public class NewUserBuySuccessfullyTestCase extends BaseTest {
    private WebDriver driver = getDriver();
    private IndexTask indexTask = new IndexTask(driver);
    private CreateAnAccountTask createAnAccountTask = new CreateAnAccountTask(driver);
    private MyAccountTask myAccountTask = new MyAccountTask(driver);
    private ProductTask productTask = new ProductTask(driver);
    private ProductToCartTask productToCartTask = new ProductToCartTask(driver);

    @Test
    public void CreateAccountAndBuySuccessfully() {
        indexTask.accessLogin();
        createAnAccountTask.pages();
        myAccountTask.searchProduct();
        productTask.chooseProduct();
        productToCartTask.pages();
    }
}