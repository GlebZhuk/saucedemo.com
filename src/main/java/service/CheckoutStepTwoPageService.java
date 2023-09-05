package service;

import page.CheckoutStepTwoPage;

public class CheckoutStepTwoPageService {

    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

    public CheckoutCompletePageService clickFinishButton() {
        checkoutStepTwoPage.buttonFinishClick();
        return new CheckoutCompletePageService();
    }
}
