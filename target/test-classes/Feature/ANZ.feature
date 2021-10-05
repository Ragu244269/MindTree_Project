@ANZ
Feature: ANZ Repayments Calculator

 @FunctionalTesting
  Scenario: Estimation for Living Expenses
    Given Living Expenses with details
      | AT     | ND | AProperty       | YI    | YOI   | LE  | CHLR | OLR | OC | TCCL  |
      | Single |  0 | Home to live in | 80000 | 10000 | 500 |    0 | 275 |  0 | 10000 |
    Then Borrowing estimate as "Y"
    And Start Over
    Given Living Expenses with details
      | AT     | ND | AProperty       | YI | YOI | LE | CHLR | OLR | OC | TCCL |
      | Single |  0 | Home to live in |  0 |   0 |  1 |    0 |   0 |  0 |    0 |
    Then Borrowing estimate as "N"
