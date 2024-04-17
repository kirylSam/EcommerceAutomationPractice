package pages.CartPage.ConfirmOrderPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CartPage.SuccessOrderPage.SuccessOrderPageAct;

public class ConfirmOrderPageAct extends BasePage {
    WebDriver driver;
    ConfirmOrderPageElements confirmOrderPageElements;

    public ConfirmOrderPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.confirmOrderPageElements = new ConfirmOrderPageElements(driver);
    }

    public SuccessOrderPageAct clickConfirmOrderButton() {
        confirmOrderPageElements.getConfirmOrderButton().click();
        return new SuccessOrderPageAct(driver);
    }
}
