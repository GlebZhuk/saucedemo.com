package test;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
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

    @Description("Verify successful buy")
    @Link("https://instagram.com/glebiy_")
    @Issue("ISSUE-3")
    @TmsLink("TMS-3")
    @Test(description = "verify buy", priority = 3)
    public void checkSuccessfulBuy() {
        inventoryPageService = loginPageService.login(user);
        cartPageService = inventoryPageService.addToCart();
        checkoutStepOnePageService = cartPageService.clickContinueButton();
        checkoutStepTwoPageService = checkoutStepOnePageService.loginInfo(usersInfo);
        checkoutCompletePageService = checkoutStepTwoPageService.clickFinishButton();
        String actualSuccessfulBuy = checkoutCompletePageService.getActualSuccessfulBuy();
        Assert.assertEquals(actualSuccessfulBuy, "Thank you for your order!","Buy is not success");
    }

}
