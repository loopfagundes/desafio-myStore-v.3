package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tasks.CreateAnAccountTask;
import tasks.IndexTask;
import utils.BaseTest;

public class NewUserBuySuccessfullyTestCase extends BaseTest {
    private WebDriver driver = getDriver();
    private IndexTask indexTask = new IndexTask(driver);
    private CreateAnAccountTask createAnAccountTask = new CreateAnAccountTask(driver);

    @Test
    public void test() {
        indexTask.accessLogin();
        createAnAccountTask.pages();
    }
}