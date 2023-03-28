Feature: Retail SignIn feature

  @signIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tayeb.mobariz@gmail.com' and password 'Zafar@1234'
    And User click on login button
    Then User should be logged in into Account

  @creatAccount
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New account button
    And User fill the signUp information with below data
      | name   | email                   | password   | confirmPassword |
      | Zafar | Zafar.mobariz@gmail.com | Zafar@1234 | Zafar@1234      |
    And User click on SignUp button
    Then User should be logged into account page
