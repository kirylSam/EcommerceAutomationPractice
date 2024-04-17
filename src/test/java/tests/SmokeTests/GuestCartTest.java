package tests.SmokeTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.CartFlow.CartPage.CartPageAct;
import pages.CartFlow.CheckoutPage.CheckoutPageAct;
import pages.CartFlow.ConfirmOrderPage.ConfirmOrderPageAct;
import pages.CartFlow.SuccessOrderPage.SuccessOrderPageAct;
import pages.ItemPage.ItemPageAct;
import pages.components.cartPopup.CartPopup;
import tests.BaseTest;

public class GuestCartTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"33,28"})
    public void canAddItemToCart(String path, String productId) {
        ItemPageAct itemPageAct = new ItemPageAct(driver);
        itemPageAct.openSpecificItemPage(path, productId)
                .addItemToCart();
        CartPopup cartPopup = new CartPopup(driver);
        CartPageAct cartPageAct = cartPopup.clickViewCartButtonInPopup();
        Assertions.assertTrue(cartPageAct.isCartPageOpened());
        CheckoutPageAct checkoutPageAct = cartPageAct.clickCheckoutButton();
        //TODO This test is silly and has no real assertions
    }

    @ParameterizedTest
    @CsvSource({"33,28"})
    public void canPlaceAnOrder(String path, String productId) {
        ItemPageAct itemPageAct = new ItemPageAct(driver);
        itemPageAct.openSpecificItemPage(path, productId)
                .addItemToCart();
        CartPopup cartPopup = new CartPopup(driver);
        CartPageAct cartPageAct = cartPopup.clickViewCartButtonInPopup();
        Assertions.assertTrue(cartPageAct.isCartPageOpened());
        CheckoutPageAct checkoutPageAct = cartPageAct.clickCheckoutButton();
        checkoutPageAct.switchAccountTypeToGuestCheckout()
                .filloutRequiredPersonalDetails()
                .markAgreeToConditionsCheckbox();
        ConfirmOrderPageAct confirmOrderPageAct = checkoutPageAct.clickContinueButton();
        SuccessOrderPageAct successOrderPageAct = confirmOrderPageAct.clickConfirmOrderButton();
        Assertions.assertTrue(successOrderPageAct.isOrderPlacedSuccessfully());
        //TODO There are a lot of unnecessary wait all over the aforementioned pages - can be a separate class


    }
}
