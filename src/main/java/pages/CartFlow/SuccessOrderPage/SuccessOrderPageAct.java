package pages.CartFlow.SuccessOrderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class SuccessOrderPageAct extends BasePage {
    WebDriver driver;
    SuccessOrderPageElements successOrderPageElements;
    public SuccessOrderPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.successOrderPageElements = new SuccessOrderPageElements(driver);
    }

    public boolean isOrderPlacedSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(successOrderPageElements.getSuccessContinueButton()));
        return driver.getTitle().equals("Your order has been placed!")
                && successOrderPageElements.getSuccessMessage().getText().contains("Your order has been placed");
    }
}
