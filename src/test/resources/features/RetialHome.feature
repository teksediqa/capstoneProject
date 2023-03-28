Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @allSection
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @sidbarOption
  Scenario Outline: Verify department sidbar options
    When User click on All section
    And User on <department>
    Then below options are persent in department
      | <optionOne> | <optionTow> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItem
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tayeb.mobariz@gmail.com' and password 'Zafar@1234'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @orderWithAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tayeb.mobariz@gmail.com' and password 'Zafar@1234'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address for shipping address
    And User fill new address form information
      | country       | fullName  | phoneNumber | streetAddress      | apt         | city      | state   | zipCode |
      | United States | Sediqa Ma | 65234565423 | 53 somerset Garden | 12 westside | Horncurch | Arizona |   12432 |
    And User click Add  Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4566678900943212 | Malalai    |               5 |           2025 |          134 |
    And User click on Add card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  @orderWithoutAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tayeb.mobariz@gmail.com' and password 'Zafar@1234'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should be change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should displayed 'Order Placed, Thanks'
