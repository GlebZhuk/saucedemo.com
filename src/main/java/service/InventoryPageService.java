package service;


import io.qameta.allure.Step;
import page.InventoryPage;

public class InventoryPageService {
    private static final String INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";

    private InventoryPage inventoryPage = new InventoryPage();
@Step("Get text on the page")
    public String getActualNameOfMainPageSection() {
        return inventoryPage.getTextOfNameOfMainPageSection();
    }
@Step("Add to cart and go to cart")
    public CartPageService addToCart() {
        inventoryPage.openPage(INVENTORY_PAGE_URL)
                .clickAddButton()
                .clickGotoCartContainerButton();
        return new CartPageService();
    }
}
