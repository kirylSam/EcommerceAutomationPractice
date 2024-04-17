package pages.CartPage.SuccessOrderPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class SuccessOrderPageElements extends InitPages {

    @FindBy(css="[class='page-title my-3']")
    private WebElement successMessage;

    public SuccessOrderPageElements(WebDriver driver) {
        super(driver);
    }
}
