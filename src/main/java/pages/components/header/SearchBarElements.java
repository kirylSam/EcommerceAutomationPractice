package pages.components.header;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.InitPages;

@Getter
class SearchBarElements extends InitPages {
    public SearchBarElements(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".flex-md-nowrap [data-toggle='dropdown']")
    private WebElement searchCategoryDropdownButton;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(1)")
    private WebElement searchCategoryAll;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(2)")
    private WebElement searchCategoryDesktops;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(3)")
    private WebElement searchCategoryLaptops;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(4)")
    private WebElement searchCategoryComponents;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(5)")
    private WebElement searchCategoryTablets;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(6)")
    private WebElement searchCategorySoftware;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(7)")
    private WebElement searchCategoryPhones;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(8)")
    private WebElement searchCategoryCameras;

    @FindBy(css=".dropdown-menu.dropdown-menu-left.show > a:nth-of-type(9)")
    private WebElement searchCategoryMP3;

    @FindBy(css = "div#SearchPage > .flex-fill.SearchPage-input-group input[name='SearchPage']")
    private WebElement searchInputField;

    @FindBy(css = ".type-text")
    private WebElement searchButton;
}
