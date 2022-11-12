package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Random;

public class login {
    public static void main(String[] args) {

//        Login + assertion -> Done
//        Logout
//        Buy Product -> Done
//        Filter Product

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

        txtProducts.isDisplayed();
        System.out.println("Login success!");

        driver.quit();
    }
}