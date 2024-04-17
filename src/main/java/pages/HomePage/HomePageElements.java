package pages.HomePage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.InitPages;

@Getter
public class HomePageElements extends InitPages {
    @FindBy(css = "div#common-home")
    private WebElement homePageCommonDiv;

    public HomePageElements(WebDriver driver) {
        super(driver);
    }
}
