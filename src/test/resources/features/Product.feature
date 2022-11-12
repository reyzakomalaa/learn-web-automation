Feature: Product
  @Positive
  Scenario: Ensure user can add product to cart
    Given user is in SauceDemo login page
    When user input username
    And user input password
    And user click login button
    When user click add to cart button
    And product has been added to cart
    When user click cart icon
    Then user verify product success added to cart

  @Positive
  Scenario:  Ensure user can checkout product
    Given user is in SauceDemo login page
    When user input username
    And user input password
    And user click login button
    When user click add to cart button
    And product has been added to cart
    When user click cart icon
    When user click checkout button
    And user fill first name
    And user fill last name
    And user fill postal code
    When user click continue button
    Then  user success checkout product

