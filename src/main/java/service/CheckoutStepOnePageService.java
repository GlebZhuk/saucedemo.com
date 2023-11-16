package service;

import io.qameta.allure.Step;
import model.UsersInfo;
import page.CheckoutStepOnePage;

public class CheckoutStepOnePageService {
    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();

    @Step("Fill users info")
    public CheckoutStepTwoPageService loginInfo(UsersInfo usersInfo) {
        checkoutStepOnePage.fillFirstName(usersInfo.getUserFirstName())
                .fillLastName(usersInfo.getUserLastName())
                .fillZipCode(usersInfo.getUserZipCode())
                .clickContinue();
        return new CheckoutStepTwoPageService();
    }
}
