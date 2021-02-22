package tasks;

import appobjects.MyAccountAppObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyAccountTask {
    private WebDriver driver;
    private MyAccountAppObject myAccountAppObject;

    public MyAccountTask(WebDriver driver) {
        this.driver = driver;
        this.myAccountAppObject = new MyAccountAppObject(driver);
    }

    public void searchProduct() {
        search();
    }

    private void search() {
        myAccountAppObject.getSearchProductTextField().sendKeys("Printed Chiffon Dress");
        myAccountAppObject.getSearchProductTextField().sendKeys(Keys.ENTER);
    }
}