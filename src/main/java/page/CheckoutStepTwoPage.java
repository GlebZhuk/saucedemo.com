package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepTwoPage extends Page {
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement buttonFinish;

    @Step("CLick button Finish")
    public CheckoutStepTwoPage buttonFinishClick() {
        buttonFinish.click();
        return this;
    }
}
