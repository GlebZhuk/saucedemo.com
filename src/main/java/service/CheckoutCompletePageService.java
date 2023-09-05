package service;

import page.CheckoutCompletePage;

public class CheckoutCompletePageService {
    private CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public String getActualSuccessfulBuy() {
        return checkoutCompletePage.getSuccessfulBuyInfoText();
    }
}

