package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    public String getTextOfNameOfMainPageSection() {
        return nameOfMainPageSection.getText();
    }

    public InventoryPage openPage(String url) {
        driver.get(url);
        return this;
    }


    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    public InventoryPage clickAddButton() {
        addToCartButton.click();
        return this;
    }

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    private WebElement goToCartContainer;

    public InventoryPage clickGotoCartContainerButton() {
        goToCartContainer.click();
        return this;
    }
}
