package test;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.InventoryPageService;
import service.LoginPageService;

public class LoginPageTest extends BaseTest {
    private LoginPageService loginPageService;
    private User user;

    //нельзя сразу инциализировать в тесте
    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Description("Verify login on our site")
    @Link("https://instagram.com/glebiy_")
    @Issue("ISSUE-1")
    @TmsLink("TMS-1")
    @Test (description = "Test Login")
    public void checkSuccessfulLoginTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        String actualTextOfMainPageSection = inventoryPageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "Products";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "Login failed! " +
                "The actual text of the page doesn't match expected");
    }
}
