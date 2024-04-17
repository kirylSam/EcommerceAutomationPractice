package pages.CartFlow.SuccessOrderPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class SuccessOrderPageElements extends InitPages {

    @FindBy(css="[class='page-title my-3']")
    private WebElement successMessage;

    @FindBy(css="[class='buttons mb-4'] .btn-primary")
    private WebElement successContinueButton;

    public SuccessOrderPageElements(WebDriver driver) {
        super(driver);
    }
}
