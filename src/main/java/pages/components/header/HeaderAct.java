package pages.components.header;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.InitPages;

public class HeaderAct extends InitPages {
    HeaderElements headerElements;


    public HeaderAct(WebDriver driver) {
        super(driver);
        this.headerElements = new HeaderElements(driver);
    }

}
