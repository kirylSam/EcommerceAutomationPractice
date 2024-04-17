package pages.components.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.InitPages;
import pages.LoginPage.LoginPageAct;
import pages.LogoutPage.LogoutPageAct;

public class HeaderAct extends InitPages {
    private final WebDriver driver;
    HeaderElements headerElements;


    public HeaderAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.headerElements = new HeaderElements(driver);
    }

    public LoginPageAct openLoginPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(headerElements.getMyAccountHover()).perform();
        headerElements.getMyAccountHoverLoginLink().click();
        return new LoginPageAct(driver);
    }

    public LogoutPageAct logout() {
        Actions actions = new Actions(driver);
        actions.moveToElement(headerElements.getMyAccountHover()).perform();
        headerElements.getMyAccountLogoutLink().click();
        return new LogoutPageAct(driver);
    }

}
