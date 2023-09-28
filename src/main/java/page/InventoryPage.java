package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AllureUtils;

public class InventoryPage extends Page {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    private WebElement goToCartContainer;

    @Step("Find text on the page")
    public String getTextOfNameOfMainPageSection() {
        return nameOfMainPageSection.getText();
    }

    @Step("Open page")
    public InventoryPage openPage(String url) {
        driver.get(url);
        return this;
    }

    @Step("Click button Add to Cart")
    public InventoryPage clickAddButton() {
        addToCartButton.click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click button Go to Cart")
    public InventoryPage clickGotoCartContainerButton() {
        goToCartContainer.click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
