package test;

import model.User;
import model.UsersInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.*;

public class CheckoutCompletePageTest extends BaseTest {
    private LoginPageService loginPageService;
    private InventoryPageService inventoryPageService;
    private CartPageService cartPageService;
    private CheckoutStepOnePageService checkoutStepOnePageService;
    private CheckoutStepTwoPageService checkoutStepTwoPageService;
    private CheckoutCompletePageService checkoutCompletePageService;
    private User user;
    private UsersInfo usersInfo;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
        usersInfo = new UsersInfo();
    }

    @Test
    public void checkSuccessfulBuy() {
        inventoryPageService = loginPageService.login(user);
        cartPageService = inventoryPageService.addToCart();
        checkoutStepOnePageService = cartPageService.clickContinueButton();
        checkoutStepTwoPageService = checkoutStepOnePageService.loginInfo(usersInfo);
        checkoutCompletePageService = checkoutStepTwoPageService.clickFinishButton();
        String actualSuccessfulBuy = checkoutCompletePageService.getActualSuccessfulBuy();
        Assert.assertEquals(actualSuccessfulBuy, "Thank you for your order!");
    }

}
