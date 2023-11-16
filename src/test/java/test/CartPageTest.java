package test;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CartPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class CartPageTest extends BaseTest {
    private InventoryPageService inventoryPageService;
    private LoginPageService loginPageService;
    private User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
        inventoryPageService = loginPageService.login(user);
    }

    @Description("Verify add goods to cart")
    @Link("https://instagram.com/glebiy_")
    @Issue("ISSUE-2")
    @TmsLink("TMS-2")
    @Test(description = "verify cart", priority = 2)
    public void checkSuccessfulCartAdding() {
        CartPageService cartPageService = inventoryPageService.addToCart();
        String actualItemName = cartPageService.getItemName();
        String expectedItemName = "Sauce Labs Backpack";
        Assert.assertEquals(actualItemName, expectedItemName, "Cart didn't add");
    }
}
