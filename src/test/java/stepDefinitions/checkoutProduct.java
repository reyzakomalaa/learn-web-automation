package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import objectRepository.pageProduct;
import credentials.userData;

public class checkoutProduct extends env {

    pageProduct element = new pageProduct();
    userData data = new userData();
    @When("user click checkout button")
    public void user_click_checkout_button() {
        WebElement btnCheckout = driver.findElement(element.getBtnCheckout());

        btnCheckout.click();
    }
    @And("user fill first name")
    public void user_fill_first_name() {
        WebElement firstName = driver.findElement(element.getFieldFirstName());
        firstName.sendKeys(data.getFirstName());
    }
    @And("user fill last name")
    public void user_fill_last_name() {
        WebElement lastName = driver.findElement(element.getFieldLastName());
        lastName.sendKeys(data.getLastName());
    }
    @And("user fill postal code")
    public void user_fill_postal_code() {
        WebElement postalCode = driver.findElement(element.getFieldPostalCode());
        postalCode.sendKeys(data.getPostalCode());
    }
    @And("user click continue button")
    public void user_click_continue_button() {
        WebElement btnContinue = driver.findElement(element.getBtnContinue());
        btnContinue.click();
    }
    @Then("user success checkout product")
    public void user_success_checkout_product() {
        String getOverviewProductName = driver.findElement(element.getOverviewProductName()).getText();

        Assert.assertTrue(getOverviewProductName.contains(productName));
        System.out.println("Item valid!!");
    }
}
