package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import support.FileOperations;
import webdrivers.DriverChooseFw;

import java.io.File;

import static webdrivers.DriverManageFactoryFw.quitDriver;
import static webdrivers.DriverManageFactoryFw.setDriver;

public class BaseTest {
    private WebDriver driver;
    private static FileOperations fileOperations = new FileOperations();
    private String PATH = System.getProperty("user.dir")
            + File.separator + "src"
            + File.separator + "test"
            + File.separator + "resources"
            + File.separator + "urlProperties"
            + File.separator + "url.properties";
    private String prop = "url";

    public WebDriver getDriver() {
        this.driver = setDriver(DriverChooseFw.CHROME);
        return driver;
    }

    @BeforeClass
    public void setUp() {
        getDriver().get(fileOperations.readProperties(PATH, prop));
    }

    @AfterClass
    public void tearDown() {
        quitDriver();
    }
}