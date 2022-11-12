package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.junit.Assert.*;

public class loginTest {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "/Users/reyzapratamakomala/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        //Login flow
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement btnLogin = driver.findElement(By.xpath("//*[@type = \"submit\"]"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        btnLogin.click();

        //Assert Product text on header
        WebElement txtProducts = driver.findElement(By.xpath("//*[contains(text(),'Products')]"));
        WebElement btnFilter = driver.findElement(By.xpath("//*[@data-test = \"product_sort_container\"]"));
        WebElement filterByNameAZ = driver.findElement(By.xpath("//*[@data-test = \"product_sort_container\"]//*[@value = \"az\"]"));
        WebElement filterByNameZA = driver.findElement(By.xpath("//*[@data-test = \"product_sort_container\"]//*[@value = \"za\"]"));
        WebElement filterByNameLowHigh = driver.findElement(By.xpath("//*[@data-test = \"product_sort_container\"]//*[@value = \"lohi\"]"));
        WebElement filterByNameHighLow = driver.findElement(By.xpath("//*[@data-test = \"product_sort_container\"]//*[@value = \"hilo\"]"));


        txtProducts.isDisplayed();
        System.out.println("Product is Displayed!");

        //Add to cart
        WebElement atcRedShirt = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        String productName = driver.findElement(By.xpath("//*[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]")).getText();

        atcRedShirt.click();

        //Assert add to cart item
        WebElement removeRedShirt = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));

        removeRedShirt.isDisplayed();
        System.out.println("Red Shirt has been added to cart!");

        //Go to cart page
        WebElement cart = driver.findElement(By.xpath("//a[@class = \"shopping_cart_link\"]"));

        cart.click();

        //Assert product on cart == selected product on Home
        String getCartItemName = driver.findElement(By.xpath("//*[@class = \"inventory_item_name\"]")).getText();

        Assert.assertTrue(getCartItemName.contains(productName));
        System.out.println("Item match!!");
//        if (productName.equals(getCartItemName)){
//            System.out.println("Item match!");
//        }else{
//            System.out.println("Item not match!");
//        }

        //Go to checkout page
        WebElement btnCheckout = driver.findElement(By.id("checkout"));

        btnCheckout.click();


        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        WebElement btnContinue = driver.findElement(By.id("continue"));

        //Assert checkout page
        firstName.isDisplayed();
        btnContinue.isDisplayed();

        System.out.println("Checkout page!");

        //Fill Name and Postal code
        firstName.sendKeys("Reyza");
        lastName.sendKeys("Pratama Komala");
        postalCode.sendKeys("17520");
        btnContinue.click();

        //Assert overview page
        String getOverviewProductName = driver.findElement(By.xpath("//*[@class = \"inventory_item_name\"]")).getText();

        Assert.assertTrue(getOverviewProductName.contains(getCartItemName));
        System.out.println("Item valid!!");

//        if (productName.equals(getOverviewProductName) && getCartItemName.equals(getOverviewProductName)){
//            System.out.println("Item valid!!");
//        }else{
//            System.out.println("Item not valid!");
//        }

        //Finish checkout
        WebElement btnFinish = driver.findElement(By.id("finish"));

        btnFinish.click();

        //Assert success checkout
        String txtThankyouForOrder = driver.findElement(By.xpath("//*[contains(text(), 'THANK YOU FOR YOUR ORDER')]")).getText();
        WebElement btnBackToHome = driver.findElement(By.id("back-to-products"));

        Assert.assertTrue(txtThankyouForOrder.contains("THANK YOU FOR YOUR ORDER"));
        System.out.println("Success checkout!");

        btnBackToHome.click();


        driver.quit();
    }
}