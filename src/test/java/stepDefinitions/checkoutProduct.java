package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class checkoutProduct extends env {
    @When("user click checkout button")
    public void user_click_checkout_button() {
        WebElement btnCheckout = driver.findElement(By.id("checkout"));

        btnCheckout.click();
    }
    @And("user fill first name")
    public void user_fill_first_name() {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Reyza");
    }
    @And("user fill last name")
    public void user_fill_last_name() {
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Pratama Komala");
    }
    @And("user fill postal code")
    public void user_fill_postal_code() {
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("17520");
    }
    @And("user click continue button")
    public void user_click_continue_button() {
        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();
    }
    @Then("user success checkout product")
    public void user_success_checkout_product() {
        String getOverviewProductName = driver.findElement(By.xpath("//*[@class = \"inventory_item_name\"]")).getText();

        Assert.assertTrue(getOverviewProductName.contains(productName));
        System.out.println("Item valid!!");
    }
}
