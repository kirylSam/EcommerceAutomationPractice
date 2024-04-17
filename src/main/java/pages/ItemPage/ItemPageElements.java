package pages.ItemPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class ItemPageElements extends InitPages {
    @FindBy(css = ".content-button.d-lg-block.d-md-none.entry-content.order-1.order-lg-1.order-md-0 > button[title='Add to Cart']")
    private WebElement addToCartButton;

    public ItemPageElements(WebDriver driver) {
        super(driver);
    }
}
