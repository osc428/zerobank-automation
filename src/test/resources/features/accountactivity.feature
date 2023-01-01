Feature: Account Activity

  Background: Go to home page
    Given The user is on the login page
    When The user enters valid credentials
    And Verify Account Activity page is shown

  @accActTitleCheck @accAct
  Scenario: Verify that current pages title is "Zero-Account activity"
    Then Verify that title is "Zero - Account Activity"

  @accActDefault @accAct
  Scenario: Verify that default value of Account menu is "Savings"
    Then verify that default value of Account menu is "Savings"

  @accActOptions @accAct
  Scenario Outline: Verify that Account menu has these options:
    Then Verify that menu has "<opt1>" option:
    And Verify that menu has "<opt2>" option:
    And Verify that menu has "<opt3>" option:
    And Verify that menu has "<opt4>" option:
    And Verify that menu has "<opt5>" option:
    Examples:
      | opt1    | opt2     | opt3 | opt4        | opt5      |
      | Savings | Checking | Loan | Credit Card | Brokerage |

  @accActTableHeaders @accAct
  Scenario Outline: Verify that Transactions table has these columns:
    Then Verify that Transaction table has "<head1>" header
    And Verify that Transaction table has "<head2>" header
    And Verify that Transaction table has "<head3>" header
    And Verify that Transaction table has "<head4>" header
    Examples:
      | head1 | head2       | head3   | head4      |
      | Date  | Description | Deposit | Withdrawal |

