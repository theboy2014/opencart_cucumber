Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://demo.opencart.com/"
    When User navigate to MyAccount menu
    And Click on Login
    And User enters Email as "pavanoltraining@gmail.com" and Password as "test123"
    And Click on Login button
    Then User navigates to MyAccount Page


