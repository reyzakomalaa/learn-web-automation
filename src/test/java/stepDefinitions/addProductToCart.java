package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class addProductToCart extends env {
    @When("user click add to cart button")
    public void user_click_add_to_cart_button() {
        WebElement atcRedShirt = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        productName = driver.findElement(By.xpath("//*[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]")).getText();

        atcRedShirt.click();
    }
    @And("product has been added to cart")
    public void product_has_been_added_to_cart() {
        WebElement removeRedShirt = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));

        removeRedShirt.isDisplayed();
        System.out.println("Red Shirt has been added to cart!");
    }
    @When("user click cart icon")
    public void user_click_cart_icon() {
        WebElement cart = driver.findElement(By.xpath("//a[@class = \"shopping_cart_link\"]"));

        cart.click();
    }
    @Then("user verify product success added to cart")
    public void user_verify_product_success_added_to_cart() {
        String getCartItemName = driver.findElement(By.xpath("//*[@class = \"inventory_item_name\"]")).getText();

        Assert.assertTrue(getCartItemName.contains(productName));
        System.out.println("Item match!!");
    }
}
