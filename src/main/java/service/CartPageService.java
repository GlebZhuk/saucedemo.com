package service;

import io.qameta.allure.Step;
import page.CartPage;

public class CartPageService {
    private CartPage cartPage = new CartPage();

    public String getItemName() {
        return cartPage.getTextOfItemName();
    }
    @Step("Click button Continue")
    public CheckoutStepOnePageService clickContinueButton() {
        cartPage.clickCheckoutButton();
        return new CheckoutStepOnePageService();
    }

}
