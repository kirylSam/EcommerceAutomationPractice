package pages.HomePage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePageAct extends BasePage {
    private final WebDriver driver;
    HomePageElements homePageElements;

    public HomePageAct(WebDriver driver) {
        super(driver);
        this.homePageElements = new HomePageElements(driver);
        this.driver = driver;
    }

    public boolean isHomePageOpened() {
        return driver.getTitle().equals("Your Store") && homePageElements.getHomePageCommonDiv().isDisplayed();
    }
}
