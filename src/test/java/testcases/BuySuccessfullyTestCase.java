package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import support.DataClass;
import tasks.AuthenticationTask;
import tasks.IndexTask;
import tasks.MyAccountTask;
import utils.BaseTest;

public class BuySuccessfullyTestCase extends BaseTest {
    private final WebDriver driver = getDriver();
    private IndexTask indexTask = new IndexTask(driver);
    private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
    private MyAccountTask myAccountTask = new MyAccountTask(driver);

    @Test(dataProvider = "loginCsv", dataProviderClass = DataClass.class)
    public void test(String email, String password) {
        indexTask.accessLogin();
        authenticationTask.login(email, password);
        myAccountTask.searchProduct();
    }
}