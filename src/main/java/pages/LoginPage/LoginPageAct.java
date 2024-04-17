package pages.LoginPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.AccountDashboardPage.AccountDashboardPageAct;

public class LoginPageAct extends BasePage {
    LoginPageElements loginPageElements;
    WebDriver driver;
    public LoginPageAct(WebDriver driver) {
        super(driver);
        this.loginPageElements = new LoginPageElements(driver);
        this.driver = driver;
    }

    public AccountDashboardPageAct loginWithCredentials(String email, String password) {
        loginPageElements.getEmailInputField().sendKeys(email);
        loginPageElements.getPasswordInputField().sendKeys(password);
        loginPageElements.getLoginButton().click();
        return new AccountDashboardPageAct(driver);
    }
}
