package pages.HomePage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {
    HomePageElements homePageElements;

    public HomePage(WebDriver driver) {
        super(driver);
        this.homePageElements = new HomePageElements(driver);
    }
}
