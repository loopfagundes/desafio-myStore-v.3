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
        createAnAccountAppObject.getFirstNameTextField().sendKeys(faker.name().firstName());
        createAnAccountAppObject.getLastNameTextField().sendKeys(faker.name().lastName());
        createAnAccountAppObject.getPasswordTextField().sendKeys(faker.internet().password());
        createAnAccountAppObject.getDaysComboBox().selectByValue("17");
        createAnAccountAppObject.getMonthsComboBox().selectByValue("10");
        createAnAccountAppObject.getYearsComboBox().selectByValue("1991");
        createAnAccountAppObject.getAddressTextField().sendKeys(faker.address().fullAddress());
        createAnAccountAppObject.getCityTextField().sendKeys(faker.address().city());
        createAnAccountAppObject.getStateComboBox().selectByValue("32");
        createAnAccountAppObject.getPostalCodeTextField().sendKeys(faker.number().digits(5));
        createAnAccountAppObject.getNumberPhoneTextField().sendKeys(faker.phoneNumber().cellPhone());
        createAnAccountAppObject.getRegisterButton().click();
    }
}