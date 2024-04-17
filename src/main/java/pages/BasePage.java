package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import pages.components.header.HeaderAct;
import pages.components.header.SearchBar;

@Getter
public abstract class BasePage extends InitPages {
    HeaderAct header;
    SearchBar searchBar;

    public BasePage(WebDriver driver) {
        super(driver);
        this.header = new HeaderAct(driver);
        this.searchBar = new SearchBar(driver);
    }
}
