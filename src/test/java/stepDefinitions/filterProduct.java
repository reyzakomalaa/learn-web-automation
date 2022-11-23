package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageProduct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class filterProduct extends env {

    pageProduct element = new pageProduct();

    @When("user click filter")
    public void user_click_filter() {
        firstProduct = driver.findElement(element.getProductListHome()).getText();
        WebElement btnFilter = driver.findElement(element.getBtnFilter());

        btnFilter.click();
    }
    @And("user click filter by name z to a")
    public void user_click_filter_by_name_z_to_a() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnFilterByNameZA()));
        WebElement filterByZA = driver.findElement(element.getBtnFilterByNameZA());

        filterByZA.click();
    }
    @Then("user verify product filtered by name z to a")
    public void user_verify_product_filtered_by_name_z_to_a() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getProductListHome()));
        if (driver.findElement(element.getProductListHome()).getText().contains("Test.allTheThings() T-Shirt (Red)")){
            System.out.println("Product filtered by Name Z to A!");
        }else{
            System.out.println("Product not filtered!");
        }
    }
    @And("user click filter by price low to high")
    public void user_click_filter_by_price_low_to_high() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnFilterByPriceLowHigh()));
        WebElement filterByLoHi = driver.findElement(element.getBtnFilterByPriceLowHigh());

        filterByLoHi.click();
    }
    @Then("user verify product filtered by price low to high")
    public void user_verify_product_filtered_by_price_low_to_high() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getProductListHome()));
        if (driver.findElement(element.getProductListHome()).getText().contains("Sauce Labs Onesie")){
            System.out.println("Product filtered by Price Low to High!");
        }else{
            System.out.println("Product not filtered!");
        }
    }
    @And("user click filter by price high to low")
    public void user_click_filter_by_price_high_to_low() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnFilterByPriceHighLow()));
        WebElement filterByHiLo = driver.findElement(element.getBtnFilterByPriceHighLow());

        filterByHiLo.click();
    }
    @Then("user verify product filtered by price high to low")
    public void user_verify_product_filtered_by_price_high_to_low() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getProductListHome()));
        if (driver.findElement(element.getProductListHome()).getText().contains("Sauce Labs Fleece Jacket")){
            System.out.println("Product filtered by Price High to Low!");
        }else{
            System.out.println("Product not filtered!");
        }
    }
}
