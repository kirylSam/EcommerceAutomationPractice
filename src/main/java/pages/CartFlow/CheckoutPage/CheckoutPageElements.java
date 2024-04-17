package pages.CartPage.CheckoutPage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InitPages;

@Getter
public class CheckoutPageElements extends InitPages {
    @FindBy(css="[for='input-account-guest']")
    private WebElement guestAccountTypeRadiobutton;

    @FindBy(css="#input-payment-firstname")
    private WebElement firstNameInputField;

    @FindBy(css="#input-payment-lastname")
    private WebElement lastNameInputField;

    @FindBy(css="#input-payment-email")
    private WebElement emailInputField;

    @FindBy(css="#input-payment-telephone")
    private WebElement telephoneInputField;

    @FindBy(css="input[name='address_1']")
    private WebElement address1InputField;

    @FindBy(css="#input-payment-city")
    private WebElement cityInputField;

    @FindBy(css="#input-payment-postcode")
    private WebElement postCodeInputField;

    @FindBy(css="#button-save")
    private WebElement continueButton;

    @FindBy(css = "[for='input-agree']")
    private WebElement agreeToContiditionsCheckbox;

    public CheckoutPageElements(WebDriver driver) {
        super(driver);
    }
}
