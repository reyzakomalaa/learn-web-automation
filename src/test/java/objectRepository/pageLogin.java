package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    By username = By.id("user-name");
    public By getUsername() {
        return username;
    }

    By password = By.id("password");
    public By getPassword() {
        return password;
    }

    By btnLogin = By.xpath("//*[@data-test = \"login-button\"]");
    public By getBtnLogin() {
        return btnLogin;
    }

    By txtProduct = By.xpath("//*[contains(text(),'Products')]");
    public By getTxtProduct() {
        return txtProduct;
    }

    By errorLoginMesssage = By.xpath("//*[@data-test = \"error\"]");

    public By getErrorLoginMesssage() {
        return errorLoginMesssage;
    }
}
