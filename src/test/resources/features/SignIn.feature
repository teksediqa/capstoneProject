Feature: Retail SignIn feature

  @signIn 
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Adil.adib@gmail.com' and password 'Aman6@12345'
    And User click on login button
    Then User should be logged in into Account

  @dryRun @Regression @smokeTest @registerAccount
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New account button
    And User fill the signUp information with below data
      | name    | email                | password    | confirmPassword |
      | Mobariz | Adil.adib@gmail.com | Aman6@12345 | Aman6@12345     |
    And User click on SignUp button
    Then User should be logged into account page
