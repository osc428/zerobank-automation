Feature: Account Summary Page

  Background: Go to home page
    Given The user is on the login page
    When The user enters valid credentials
    Then verify Account Summary page is shown

  @accSumPageHeader @acc
  Scenario: Verify that Account summary page header is "Zero -Account summary"
    Then Verify that header is "Zero - Account Summary"

  @accSumAccTables @acc
  Scenario Outline: Verify that Account summary page has these account types:
    Then Verify that <arg0> table exists
    And Verify that <arg01> table exists
    And Verify that <arg02> table exists
    And Verify that <arg03> table exists
    Examples:
      | arg0            | arg01                 | arg02             | arg03           |
      | "Cash Accounts" | "Investment Accounts" | "Credit Accounts" | "Loan Accounts" |

  @accSumCreditHeaders @acc
  Scenario: Verify that Credit Accounts table has these column headers:
    Then Verify that table has "Account" header
    And Verify that table has "Credit Card" header
    And Verify that table has "Balance" header





