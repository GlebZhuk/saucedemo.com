package page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AllureUtils;
import utils.Waiter;

@Log4j2
public class LoginPage extends Page {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @Step("Open starting page")
    public LoginPage openPage(String url) {
        log.info("open login page");
        driver.get(url);
        return this;
    }

    @Step("Input user's name")
    public LoginPage fillinUserName(String userName) {
        log.info("Enter login");
        Waiter.waitElementToBeVisible(usernameField).sendKeys(userName);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Input user's password")
    public LoginPage fillinPassword(String password) {
        log.info("Enter password");
        passwordField.sendKeys(password);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click Button LogIn")
    public LoginPage clickLoginButton() {
        log.info("Click on the login button");
        loginButton.click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
