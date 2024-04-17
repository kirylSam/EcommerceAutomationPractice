package pages.LogoutPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class LogoutPageElements extends InitPages {
    @FindBy(css = "div#content > .my-3.page-title")
    private WebElement logoutPageHeader;

    @FindBy(css = "[class='buttons mb-4'] .btn-primary")
    private WebElement logoutContinueButton;

    public LogoutPageElements(WebDriver driver) {
        super(driver);
    }
}
