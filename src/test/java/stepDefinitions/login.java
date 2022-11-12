package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import credentials.credentialsLogin;

public class login extends env {

    pageLogin element = new pageLogin();
    credentialsLogin credentials = new credentialsLogin();
    @Given("user is in SauceDemo login page")
    public void user_is_in_sauce_demo_login_page() {

    }
    @When("user input username")
    public void user_input_username() {
        WebElement username = driver.findElement(element.getUsername());
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getUsername()));
        username.sendKeys(credentials.getUsername());
    }
    @And("user input password")
    public void user_input_password() {
        WebElement password = driver.findElement(element.getPassword());
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getPassword()));
        password.sendKeys(credentials.getPassword());
    }
    @And("user click login button")
    public void user_click_login_button() {
        WebElement btnLogin = driver.findElement(element.getBtnLogin());

        btnLogin.click();
    }
    @Then("user verify success login")
    public void user_verify_success_login() {
        WebElement txtProducts = driver.findElement(element.getTxtProduct());

        txtProducts.isDisplayed();
        System.out.println("Login success!");
    }

    @Then("user verify failed to login")
    public void user_verify_failed_to_login() {
        WebElement txtLoginFailedMessage = driver.findElement(element.getErrorLoginMesssage());
    }

}
