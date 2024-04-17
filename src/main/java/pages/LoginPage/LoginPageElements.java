package pages.LoginPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.InitPages;

@Getter
public class LoginPageElements extends InitPages {
    public LoginPageElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="input#input-email")
    private WebElement emailInputField;

    @FindBy(css = "input#input-password")
    private WebElement passwordInputField;

    @FindBy(css = "[action] .btn-primary")
    private WebElement loginButton;
}
