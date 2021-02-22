package tasks;

import appobjects.IndexAppObject;
import org.openqa.selenium.WebDriver;

public class IndexTask {
    private WebDriver driver;
    private IndexAppObject indexAppObject;

    public IndexTask(WebDriver driver) {
        this.driver = driver;
        this.indexAppObject = new IndexAppObject(driver);
    }

    public void accessLogin() {
        signIn();
    }

    private void signIn() {
        indexAppObject.getSignInButton().click();
    }
}