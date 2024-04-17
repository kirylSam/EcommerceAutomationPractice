package pages.CartFlow.CartPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class CartPageElements extends InitPages {
    @FindBy(css = "div#content > .h4.mb-3.page-title")
    private WebElement cartTitle;

    @FindBy(css = ".buttons .btn-lg.btn-primary")
    private WebElement cartCheckoutButton;

    public CartPageElements(WebDriver driver) {
        super(driver);
    }
}
