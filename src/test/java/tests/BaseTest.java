import drivers.DriverFactory;
import drivers.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        //TODO different browsers configuration
        DriverManager manager = DriverFactory.CHROME.getDriverManager();
        this.driver = manager.getDriver();
    }

    @AfterEach
    public void close() {
        driver.close();
    }
}
