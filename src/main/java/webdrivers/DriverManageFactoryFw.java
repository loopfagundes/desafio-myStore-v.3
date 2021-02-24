package webdrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManageFactoryFw {
    private static WebDriver driver;

    private static WebDriver getManager(DriverChooseFw type) {
        switch (type) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            default:
                break;
        }
        return driver;
    }

    public static WebDriver setDriver(DriverChooseFw type) {
        if (driver == null) {
            driver = getManager(type);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}