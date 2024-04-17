package pages.components.cartPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartFlow.CartPage.CartPageAct;
import pages.InitPages;

import java.time.Duration;

public class CartPopup extends InitPages {
    WebDriver driver;

    @FindBy(css = "div#notification-box-top")
    private WebElement popup;

    @FindBy(css = ".form-row .btn-primary")
    private WebElement popupViewCartButton;

    public CartPopup(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CartPageAct clickViewCartButtonInPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupViewCartButton));
        popupViewCartButton.click();
        return new CartPageAct(driver);
    }
}
