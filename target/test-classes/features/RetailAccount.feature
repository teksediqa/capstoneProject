Feature: Retail Account feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Adil.adib@gmail.com' and password 'Gadaf@12345'
    And User click on login button
    And User should be logged in into Account

  @UpdateAccount @signIn
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ania' and Phone '78965785654'
    And User click on Update button
    Then User profile information should be updated

  @PasswordChange @updateAccount
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Gadaf@12345      | Ladaf@12345 | Ladaf@12345     |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
    

  @AddPayment @signIn
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      |  234567898 | sediqa     |               9 |           2025 |          456 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully
