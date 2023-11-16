package service;

import io.qameta.allure.Step;
import page.CheckoutCompletePage;

public class CheckoutCompletePageService {
    private CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Step("Get text on the page")
    public String getActualSuccessfulBuy() {
        return checkoutCompletePage.getSuccessfulBuyInfoText();
    }
}
