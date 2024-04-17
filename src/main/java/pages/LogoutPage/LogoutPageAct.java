package pages.LogoutPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage.HomePageAct;

public class LogoutPageAct extends BasePage {
    private final WebDriver driver;
    LogoutPageElements logoutPageElements;

    public LogoutPageAct(WebDriver driver) {
        super(driver);
        this.logoutPageElements = new LogoutPageElements(driver);
        this.driver = driver;
    }

    public boolean isLoggedOut() {
        return driver.getTitle().equals("Account Logout") && logoutPageElements.getLogoutPageHeader().isDisplayed();
    }

    public HomePageAct clickContinueLogout() {
        logoutPageElements.getLogoutContinueButton().click();
        return new HomePageAct(driver);
    }
}
