package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement itemName;

    public String getTextOfItemName() {
        return itemName.getText();
    }

    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;

    public CartPage clickCheckoutButton() {
        checkoutButton.click();
        return this;
    }
}
