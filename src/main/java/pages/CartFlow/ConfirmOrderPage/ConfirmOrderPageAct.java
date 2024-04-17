package pages.CartFlow.ConfirmOrderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.CartFlow.SuccessOrderPage.SuccessOrderPageAct;

import java.time.Duration;

public class ConfirmOrderPageAct extends BasePage {
    WebDriver driver;
    ConfirmOrderPageElements confirmOrderPageElements;

    public ConfirmOrderPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.confirmOrderPageElements = new ConfirmOrderPageElements(driver);
    }

    public SuccessOrderPageAct clickConfirmOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPageElements.getConfirmOrderButton()));
        confirmOrderPageElements.getConfirmOrderButton().click();
        return new SuccessOrderPageAct(driver);
    }
}
