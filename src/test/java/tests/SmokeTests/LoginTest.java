package tests.SmokeTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.HomePage.HomePageAct;
import pages.AccountDashboardPage.AccountDashboardPageAct;
import pages.LogoutPage.LogoutPageAct;
import tests.BaseTest;

public class LoginTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"mail123@mail.com,1234567890"})
    public void canLoginWithValidCredentials(String email, String password) {
        HomePageAct homePageAct = new HomePageAct(driver);
        AccountDashboardPageAct accountDashboardPageAct = homePageAct.getHeader().openLoginPage().loginWithCredentials(email, password);
        Assertions.assertTrue(accountDashboardPageAct.userIsLoggedIn());
    }

    @ParameterizedTest
    @CsvSource({"INVALIDEMAIL,INVALIDPASSWORD"})
    public void cannotLoginWithInvalidCredentials(String email, String password) {
        HomePageAct homePageAct = new HomePageAct(driver);
        AccountDashboardPageAct accountDashboardPageAct = homePageAct.getHeader().openLoginPage().loginWithCredentials(email, password);
        Assertions.assertFalse(accountDashboardPageAct.userIsLoggedIn());
    }

    @ParameterizedTest
    @CsvSource({"mail123@mail.com,1234567890"})
    public void canLogout(String email, String password) {
        HomePageAct homePageAct = new HomePageAct(driver);
        AccountDashboardPageAct accountDashboardPageAct = homePageAct.getHeader().openLoginPage().loginWithCredentials(email, password);
        Assertions.assertTrue(accountDashboardPageAct.userIsLoggedIn());
        LogoutPageAct logoutPageAct = accountDashboardPageAct.getHeader().logout();
        Assertions.assertTrue(logoutPageAct.isLoggedOut());
        homePageAct = logoutPageAct.clickContinueLogout();
        Assertions.assertTrue(homePageAct.isHomePageOpened());
    }
}
