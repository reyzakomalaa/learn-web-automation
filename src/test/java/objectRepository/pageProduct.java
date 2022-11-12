package objectRepository;

import org.openqa.selenium.By;

public class pageProduct {
    By atcRedShirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public By getAtcRedShirt() {
        return atcRedShirt;
    }

    By productName = By.xpath("//*[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]");

    public By getProductName() {
        return productName;
    }

    By btnRemoveRedShirt = By.id("remove-test.allthethings()-t-shirt-(red)");

    public By getBtnRemoveRedShirt() {
        return btnRemoveRedShirt;
    }

    By btnCart = By.xpath("//a[@class = \"shopping_cart_link\"]");

    public By getBtnCart() {
        return btnCart;
    }

    By cartItemName = By.xpath("//*[@class = \"inventory_item_name\"]");

    public By getCartItemName() {
        return cartItemName;
    }

    By btnCheckout = By.id("checkout");

    public By getBtnCheckout() {
        return btnCheckout;
    }

    By fieldFirstName = By.id("first-name");

    public By getFieldFirstName() {
        return fieldFirstName;
    }

    By fieldLastName = By.id("last-name");

    public By getFieldLastName() {
        return fieldLastName;
    }

    By fieldPostalCode = By.id("postal-code");

    public By getFieldPostalCode() {
        return fieldPostalCode;
    }

    By btnContinue = By.id("continue");

    public By getBtnContinue() {
        return btnContinue;
    }

    By overviewProductName = By.xpath("//*[@class = \"inventory_item_name\"]");

    public By getOverviewProductName() {
        return overviewProductName;
    }
}
