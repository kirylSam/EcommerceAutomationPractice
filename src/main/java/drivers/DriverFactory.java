package drivers;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver createInstance(String browser) {
        //TODO I might need to conquer the ThreadLocal later
        return BrowserFactory.valueOf(browser.toUpperCase()).createDriver();
    }
}
