package stepDefinitions;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends env {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/reyzapratamakomala/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
    }

    @After
    public void after(){
        driver.quit();
    }
}
