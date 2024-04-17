package pages.MyAccountDashboard;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class MyAccountDashboardAct extends BasePage {
    MyAccountDashboardElements myAccountDashboardElements;
    WebDriver driver;
    public MyAccountDashboardAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.myAccountDashboardElements = new MyAccountDashboardElements(driver);
    }

    public boolean userIsLoggedIn() {
        return (driver.getTitle().equals("My Account"))
                && (myAccountDashboardElements.getEditYourAccountInfoButton().isDisplayed());
    }
}
