package pages.CartPage.ConfirmOrderPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class ConfirmOrderPageElements extends InitPages {

    @FindBy(css="button#button-confirm")
    private WebElement confirmOrderButton;
    
    public ConfirmOrderPageElements(WebDriver driver) {
        super(driver);
    }
}
