package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CartPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class CartPageTest extends BaseTest{
    private InventoryPageService inventoryPageService;
    private LoginPageService loginPageService;
    private User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }
    @Test
    public void checkSuccessfulCartAdding (){
        InventoryPageService inventoryPageService = loginPageService.login(user);

        CartPageService cartPageService=inventoryPageService.addToCart();
        String actualItemName= cartPageService.getItemName();
        String expendedItemName ="Sauce Labs Backpack";
        Assert.assertEquals(actualItemName,expendedItemName);
    }
}
