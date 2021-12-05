Feature: LoginDDT

  Background: Common pre-steps for all Login Scenarios
    Given User Launch browser
    And opens URL "https://demo.opencart.com/"
    When User navigate to MyAccount menu
    And click on Login

  Scenario Outline: Login Data Driven
#    Given User Launch browser
#    And opens URL "https://demo.opencart.com/"
#    When User navigate to MyAccount menu
#    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples:
      | email                     | password |
      | pavanoltraining@gmail.com | test123  |
      | pavanol@gmail.com         | test123  |

  @sanity @regression
  Scenario Outline: Login Data Driven2
#    Given User Launch browser
#    And opens URL "https://demo.opencart.com/"
#    When User navigate to MyAccount menu
#    And click on Login
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples:
      |row_index|
      |1|
      |2|
      |3|

#    the below secanrio both have common steps then we can delete those steps and add to bacground above
#  Scenario Outline: Login Data Driven
#    Given User Launch browser.Feature:
#    backgound will execute before executing any scenario in the feature you can not execute in the middle
#
#
#



