package pages.ItemPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ItemPageAct extends BasePage {
    WebDriver driver;
    ItemPageElements itemPageElements;
    public ItemPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        itemPageElements = new ItemPageElements(driver);
    }

    public ItemPageAct openSpecificItemPage(String path, String productId) {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/product&path=" + path + "&product_id=" + productId);
        return this;
    }

    public ItemPageAct addItemToCart() {
        itemPageElements.getAddToCartButton().click();
        return this;
    }
}
