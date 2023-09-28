package service;

import io.qameta.allure.Step;
import page.CheckoutStepTwoPage;

public class CheckoutStepTwoPageService {

    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();
@Step("Click button finish")
    public CheckoutCompletePageService clickFinishButton() {
        checkoutStepTwoPage.buttonFinishClick();
        return new CheckoutCompletePageService();
    }
}
