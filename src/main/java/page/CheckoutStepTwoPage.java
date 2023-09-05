package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import service.CheckoutStepTwoPageService;

public class CheckoutStepTwoPage extends Page {
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement buttonFinish;

    public CheckoutStepTwoPage buttonFinishClick() {
        buttonFinish.click();
        return this;
    }
}
