package pages.CartFlow.CartPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.CartFlow.CheckoutPage.CheckoutPageAct;

import java.time.Duration;

public class CartPageAct extends BasePage {
    WebDriver driver;
    CartPageElements cartPageElements;

    public CartPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        cartPageElements = new CartPageElements(driver);
    }

    public boolean isCartPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cartPageElements.getCartCheckoutButton()));
        return driver.getTitle().equals("Shopping Cart")
                && cartPageElements.getCartTitle().getText().contains("Shopping Cart");
    }

    public CheckoutPageAct clickCheckoutButton() {
        cartPageElements.getCartCheckoutButton().click();
        return new CheckoutPageAct(driver);
    }
}
