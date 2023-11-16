package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage extends Page {
    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath = "//*[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id='postal-code']")
    private WebElement zipCode;
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    @Step("Input user's first name")
    public CheckoutStepOnePage fillFirstName(String userFirstName) {
        firstName.sendKeys(userFirstName);
        return this;
    }

    @Step("Input user's last name")
    public CheckoutStepOnePage fillLastName(String userLastName) {
        lastName.sendKeys(userLastName);
        return this;
    }

    @Step("Input user's zip code")
    public CheckoutStepOnePage fillZipCode(String userZipCode) {
        zipCode.sendKeys(userZipCode);
        return this;
    }

    @Step("Click button Continue")
    public CheckoutStepOnePage clickContinue() {
        continueButton.click();
        return this;
    }
}
