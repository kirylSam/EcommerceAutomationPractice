package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public enum BrowserFactory {
    CHROME {
        @Override
        public WebDriver createDriver() {
            return new ChromeDriver(getOptions());
        }

        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-notifications");
            return chromeOptions;
        }
    };

    public abstract WebDriver createDriver();
}