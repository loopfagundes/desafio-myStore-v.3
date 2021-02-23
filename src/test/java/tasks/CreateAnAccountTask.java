package tasks;

import appobjects.CreateAnAccountAppObject;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreateAnAccountTask {
    private WebDriver driver;
    private CreateAnAccountAppObject createAnAccountAppObject;
    private Faker faker = new Faker();

    public CreateAnAccountTask(WebDriver driver) {
        this.driver = driver;
        this.createAnAccountAppObject = new CreateAnAccountAppObject(driver);
    }

    public void pages() {
        authentication();
        createAnAccount();
    }

    private void authentication() {
        Assert.assertEquals("AUTHENTICATION", createAnAccountAppObject.getValidatePageAuthenticationLabel().getText());
        createAnAccountAppObject.getCreateEmailTextField().sendKeys(faker.internet().emailAddress());
        createAnAccountAppObject.getCreateAnAccountButton().click();
    }

    private void createAnAccount() {
        createAnAccountAppObject.getGenderCheckBox().click();
    }
}