package pages.AccountDashboardPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class AccountDashboardPageAct extends BasePage {
    AccountDashboardPageElements accountDashboardPageElements;
    WebDriver driver;
    public AccountDashboardPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.accountDashboardPageElements = new AccountDashboardPageElements(driver);
    }

    public boolean userIsLoggedIn() {
        //TODO This wait might not be necessary
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(accountDashboardPageElements.getEditYourAccountInfoButton()));
        return (driver.getTitle().equals("My Account"))
                && (accountDashboardPageElements.getEditYourAccountInfoButton().isDisplayed());
    }
}
