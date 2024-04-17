package pages;

import org.openqa.selenium.WebDriver;

public abstract class PageFactory {
    WebDriver driver;


    public PageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
