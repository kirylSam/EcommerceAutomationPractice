package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class InitPages {
    WebDriver driver;

    public InitPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
