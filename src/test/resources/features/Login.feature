Feature: Login function
  @Positive
  Scenario: Ensure user success Login
    #precondition
    Given user is in SauceDemo login page
    #step
    When user input username
    And user input password
    And user click login button
    #expected
    Then user verify success login

  @Negative
  Scenario: Ensure user failed to login
    Given user is in SauceDemo login page
    And user click login button
    Then user verify failed to login



#  @DDT
#  Scenario Outline: Ensure user success Login
#    Given user is in SauceDemo login page
#    When user input <username> as username
#    And user input <password> as password
#    And user click login button
#    Then user verify success login
#    Examples:
#      | username | password |
#      | abc1 | def2 |
#      | abc3 | def4 |

#    @When("user input (.*) as username$")
#    public void user_input_username(String username) {
#    WebElement username = driver.findElement(element.getUsername());
#    wait = new WebDriverWait(driver, 10);
#
#    wait.until(ExpectedConditions.visibilityOfElementLocated(element.getUsername()));
#    username.sendKeys(username);
#    }
#    @And("user input (.*) as password$")
#    public void user_input_password(String password) {
#    WebElement password = driver.findElement(element.getPassword());
#    wait = new WebDriverWait(driver, 10);
#
#    wait.until(ExpectedConditions.visibilityOfElementLocated(element.getPassword()));
#    password.sendKeys(password);
#    }