package tests;

import drivers.DriverFactory;
import logging.BaseLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest implements BaseLogger {
    public WebDriver driver;

    @BeforeEach
    public void setup() {
        //TODO different browsers configuration
        driver = new DriverFactory().createInstance("CHROME");
        logger.info("New browser instance created");
        driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    @AfterEach
    public void close() {
        logger.info("Browser Instance closed");
        driver.quit();
    }
}
