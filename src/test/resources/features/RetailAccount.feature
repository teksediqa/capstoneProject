Feature: Retail Account feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tayeb.mobariz@gmail.com' and password 'Zafar@1234'
    And User click on login button
    And User should be logged in into Account

  @UpdateAccount 
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Aisha' and Phone '78965785643'
    And User click on Update button
    Then User profile information should be updated

  @PasswordChange
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tayeb@1234     | Zafar@1234 | Zafar@1234     |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully

  @AddPayment 
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2345678981254704 | sediqa     |               9 |           2024 |          756 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully

  @EditCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on master card image
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2345768902340001 | Amano      |               4 |           2026 |          234 |
    And User click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    When User click on card option
    And User click on remove option of card section
    Then Payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName      | phoneNumber | streetAddress     | apt | city       | state   | zipCode   |
      | United States | Tayeb Mobariz |  2345643234 | 53 somersetGarden |  67 | Hornchurch | Arizona | 537898423 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User update new address form with below information
      | country        | fullName     | phoneNumber | streetAddress | apt | city    | state   | zipCode |
      | United Kingdom | Aman Mobariz | 07755673289 | 44 somerset   |  63 | Romford | Croydon |   56432 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully
    
    
    @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
