package pages.CartFlow.CheckoutPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.CartFlow.ConfirmOrderPage.ConfirmOrderPageAct;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageElements.getContinueButton()));
        checkoutPageElements.getContinueButton().click();
        return new ConfirmOrderPageAct(driver);
    }
}
