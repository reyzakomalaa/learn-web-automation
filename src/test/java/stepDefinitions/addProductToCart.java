package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import objectRepository.pageProduct;

public class addProductToCart extends env {

    pageProduct element = new pageProduct();
    @When("user click add to cart button")
    public void user_click_add_to_cart_button() {
        WebElement atcRedShirt = driver.findElement(element.getAtcRedShirt());
        productName = driver.findElement(element.getProductName()).getText();

        atcRedShirt.click();
    }
    @And("product has been added to cart")
    public void product_has_been_added_to_cart() {
        WebElement removeRedShirtBtn = driver.findElement(element.getBtnRemoveRedShirt());

        removeRedShirtBtn.isDisplayed();
        System.out.println("Red Shirt has been added to cart!");
    }
    @When("user click cart icon")
    public void user_click_cart_icon() {
        WebElement cart = driver.findElement(element.getBtnCart());

        cart.click();
    }
    @Then("user verify product success added to cart")
    public void user_verify_product_success_added_to_cart() {
        String getCartItemName = driver.findElement(element.getCartItemName()).getText();

        Assert.assertTrue(getCartItemName.contains(productName));
        System.out.println("Item match!!");
    }
}
