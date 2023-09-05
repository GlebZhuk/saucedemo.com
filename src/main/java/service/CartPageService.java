package service;

import page.CartPage;

public class CartPageService {
    private CartPage cartPage = new CartPage();

    public String getItemName() {
        return cartPage.getTextOfItemName();
    }

    public CheckoutStepOnePageService clickContinueButton() {
        cartPage.clickCheckoutButton();
        return new CheckoutStepOnePageService();
    }

}
