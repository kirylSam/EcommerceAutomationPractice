package pages.components.header;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.InitPages;
import pages.search.SearchResultsPage;

public class SearchBar extends InitPages {
    SearchBarElements pageHeaderSearchBarComponentElements;
    WebDriver driver;

    public SearchBar(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.pageHeaderSearchBarComponentElements = new SearchBarElements(driver);
    }

    public SearchBar switchCategory(String categoryName) {
        switch (categoryName.toUpperCase()) {
            case "ALL":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryAll().click();
                break;
            case "DESKTOPS":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryDesktops().click();
                break;
            case "LAPTOPS":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryLaptops().click();
                break;
            case "COMPONENTS":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryComponents().click();
                break;
            case "TABLETS":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryTablets().click();
                break;
            case "SOFTWARE":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategorySoftware().click();
                break;
            case "PHONES":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryPhones().click();
                break;
            case "CAMERAS":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryCameras().click();
                break;
            case "MP3":
                pageHeaderSearchBarComponentElements.getSearchCategoryDropdownButton().click();
                pageHeaderSearchBarComponentElements.getSearchCategoryMP3().click();
                break;
        }
        return this;
    }

    public SearchResultsPage searchFor(String searchQuery) {
        pageHeaderSearchBarComponentElements.getSearchInputField().sendKeys(searchQuery);
        pageHeaderSearchBarComponentElements.getSearchButton().click();
        return new SearchResultsPage(driver);
    }
}
