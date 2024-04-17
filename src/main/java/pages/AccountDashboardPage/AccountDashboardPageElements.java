package pages.MyAccountDashboard;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.InitPages;

@Getter
public class MyAccountDashboardElements extends InitPages {
    public MyAccountDashboardElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div:nth-of-type(1) > .card-body.text-center > .row > div:nth-of-type(1) > .d-inline-flex.flex-column.my-3.text-decoration-none.text-reset")
    private WebElement editYourAccountInfoButton;
}
