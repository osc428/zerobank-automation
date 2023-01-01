Feature: Pay Bills

  Background: Go to home page
    Given The user is on the login page
    When The user enters valid credentials
    And Verify Pay Bills page is shown

  @payBillsTitle @payBills
  Scenario: Account Activity pages title must be "Zero -Pay Bills"
    Then  Verify that page title is "Zero - Pay Bills"

  @payBillsPay @payBills
  Scenario Outline: When the user does payment the user should see "The payment was successfully submitted" message
    When User enters "<Amount>" and "<Date>" and "<Description>" and click the Pay button
    Then  Verify that "The payment was successfully submitted." message is shown
    Examples:
      | Amount | Date       | Description |
      | 200    | 2023-01-03 | car rental  |

  @payBillsEmpty @payBills
  Scenario Outline: If the user has not entered the amount or date, "Please fill out this field!" message must have shown
    When User enters "<Date>" and "<Description>" and click the Pay button
    Then  Verify that "Please fill out this field!" alert is shown
    Examples:
      | Date       | Description |
      | 2023-01-03 | car rental  |

  @payBillsEmpty @payBills
  Scenario Outline: If the user has not entered the amount or date, "Please fill out this field!" message must have shown
    When User enters just "<Amount>" and "<Description>" and click the Pay button
    Then  Verify that "Please fill out this field!" alert is shown but not "The payment was successfully submitted" message
    Examples:
      | Amount | Description |
      | 200    | car rental  |

  @payBillsInvalidAmount @payBills
  Scenario Outline: If the user has entered non-numeric characters in Amount section, payment should NOT be saved
    When User enters "<Amount>" and "<Date>" and "<Description>" and click the Pay button
    Then  Verify that "The payment was successfully submitted." message is NOT shown
    Examples:
      | Amount  | Date       | Description |
      | invalid | 2023-01-03 | car rental  |

  @payBillsInvalidDate @payBills
  Scenario Outline: If the user has entered non-numeric characters in Date section, payment should NOT be saved
    When User enters "<Amount>" and "<Date>" and "<Description>" and click the Pay button
    Then  Verify that "The payment was successfully submitted." message is NOT shown
    Examples:
      | Amount | Date    | Description |
      | 250    | invalid | car rental  |