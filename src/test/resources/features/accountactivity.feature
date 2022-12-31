Feature: Acoount Activity

  Scenario: Account Activity sayfasinin basligi Zero-Account activity olmalidir.

    Scenario: Account menusunde varsayilan secenek Savings olmalidir.

      Scenario: Account menusu asagidaki secenekleri de icermelidir:
      ? Savings,
      ? Checking,
      ? Loan,
      ? Credit Card,
      ? Brokerage.

        Scenario: Transactions tablosu ndaki sutun isimleri sunlar olmalidir:
        ? Date,
        ? Description,
        ? Deposit
        ? Withdrawal
