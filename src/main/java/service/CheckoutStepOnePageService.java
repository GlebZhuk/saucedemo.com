package service;

import model.User;
import model.UsersInfo;
import page.CheckoutStepOnePage;

public class CheckoutStepOnePageService {
    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();

    public CheckoutStepTwoPageService loginInfo(UsersInfo usersInfo) {
        checkoutStepOnePage.fillFirstName(usersInfo.getUserFirstName())
                .fillLastName(usersInfo.getUserLastName())
                .fillZipCode(usersInfo.getUserZipCode())
                .clickContinue();
        return new CheckoutStepTwoPageService();

    }
}
