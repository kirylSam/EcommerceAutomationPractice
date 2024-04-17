package pages.components.header;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.InitPages;

@Getter
class HeaderElements extends InitPages {
    @FindBy(css="img[alt='Poco Electro']")
    private WebElement mainWebsiteLogo;

    //TODO Sidebar links
    @FindBy(css=".both.text-reset")
    private WebElement shopByCategory;

    @FindBy(css = ".horizontal .nav-item:nth-of-type(1) .title")
    private WebElement homeLink;

    @FindBy(css = ".horizontal .nav-item:nth-of-type(2) .title")
    private WebElement specialLink;

    @FindBy(css = ".horizontal .nav-item:nth-of-type(3) .title")
    private WebElement blogLink;

    //TODO MegaMenu Hover links
    @FindBy(css = ".dropdown.mega-menu.nav-item.position-static > a[role='button']")
    private WebElement megaMenuHover;

    //TODO Addons hover links
    @FindBy(css = "li:nth-of-type(5) > a[role='button']")
    private WebElement addonsHover;

    @FindBy(css = "li:nth-of-type(6) > a[role='button']")
    private WebElement myAccountHover;

    @FindBy(css = ".dropdown-menu.mz-sub-menu-96 > li:nth-of-type(1) > .both.dropdown-item.icon-left")
    private WebElement myAccountHoverLoginLink;

    @FindBy(css = ".horizontal [href='https\\:\\/\\/ecommerce-playground\\.lambdatest\\.io\\/index\\.php\\?route\\=account\\/account']")
    private WebElement myAccountHoverRegisterLink;

    @FindBy(css = "li:nth-of-type(6) > .both.dropdown-item.icon-left > .info > .title")
    private WebElement myAccountLogoutLink;

    @FindBy(css = "[class='entry-design design-link flex-grow-0 flex-shrink-0']:nth-of-type(3) svg")
    private WebElement compareButton;

    @FindBy(css = "[class='entry-design design-link flex-grow-0 flex-shrink-0']:nth-of-type(4) svg")
    private WebElement wishlistButton;

    @FindBy(css = ".flex-md-nowrap [class='entry-widget widget-cart flex-grow-0 flex-shrink-0'] svg")
    private WebElement cartButton;

    public HeaderElements(WebDriver driver) {
        super(driver);
    }
}
