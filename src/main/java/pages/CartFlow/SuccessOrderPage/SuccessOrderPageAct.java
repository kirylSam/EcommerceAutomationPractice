package pages.CartPage.SuccessOrderPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SuccessOrderPageAct extends BasePage {
    WebDriver driver;
    SuccessOrderPageElements successOrderPageElements;
    public SuccessOrderPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.successOrderPageElements = new SuccessOrderPageElements(driver);
    }

    public boolean isOrderPlacedSuccessfully() {
        return driver.getTitle().equals("Your order has been placed!")
                && successOrderPageElements.getSuccessMessage().getText().equals("successOrderPageElements");
    }
}
