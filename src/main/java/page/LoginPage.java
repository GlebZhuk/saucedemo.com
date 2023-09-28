package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AllureUtils;
import utils.Waiter;

public class LoginPage extends Page {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @Step("Open starting page")
    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    @Step("Input user's name")
    public LoginPage fillinUserName(String userName) {
        Waiter.waitElementToBeVisible(usernameField).sendKeys(userName);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Input user's password")
    public LoginPage fillinPassword(String password) {
        passwordField.sendKeys(password);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click Button LogIn")
    public LoginPage clickLoginButton() {
        loginButton.click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
