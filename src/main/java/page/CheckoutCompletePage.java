package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends Page {
    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    private WebElement successfulBuyInfo;

    @Step("Get text on the page")
    public String getSuccessfulBuyInfoText() {
        return successfulBuyInfo.getText();
    }
}
