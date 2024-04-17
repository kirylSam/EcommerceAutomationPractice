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

    public HeaderElements(WebDriver driver) {
        super(driver);
    }
}
