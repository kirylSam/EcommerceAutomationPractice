package pages.CartPage.CheckoutPage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CartPage.ConfirmOrderPage.ConfirmOrderPageAct;

public class CheckoutPageAct extends BasePage {
    WebDriver driver;
    CheckoutPageElements checkoutPageElements;
    public CheckoutPageAct(WebDriver driver) {
        super(driver);
        this.driver = driver;
        checkoutPageElements = new CheckoutPageElements(driver);
    }

    public CheckoutPageAct switchAccountTypeToGuestCheckout() {
        checkoutPageElements.getGuestAccountTypeRadiobutton().click();
        return this;
    }

    public CheckoutPageAct filloutRequiredPersonalDetails(){
        checkoutPageElements.getFirstNameInputField().sendKeys("FirstName");
        checkoutPageElements.getLastNameInputField().sendKeys("LastName");
        checkoutPageElements.getEmailInputField().sendKeys("mail@mail.com");
        checkoutPageElements.getTelephoneInputField().sendKeys("123123123");
        checkoutPageElements.getAddress1InputField().sendKeys("Address1");
        checkoutPageElements.getCityInputField().sendKeys("City");
        checkoutPageElements.getPostCodeInputField().sendKeys("01408");
        return this;
    }

    public CheckoutPageAct markAgreeToConditionsCheckbox() {
        checkoutPageElements.getAgreeToContiditionsCheckbox().click();
        return this;
    }

    public ConfirmOrderPageAct clickContinueButton() {
        checkoutPageElements.getContinueButton().click();
        return new ConfirmOrderPageAct(driver);
    }
}
