package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountAppObject {
    private WebDriver driver;

    public MyAccountAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchProductTextField() {
        return driver.findElement(By.id("search_query_top"));
    }
}