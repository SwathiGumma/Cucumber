#Sample Feature Definition Template
Feature: To test add tariff plan

  @tag2
  Scenario Outline: To test add tariff plan with valid details
    Given The user is in the add tariff plan page
    When The user fill in the plan details "<Monthrent>","<freeloc>","<freeint>","<freesms>","<loccharges>","<intcharges>","<smscharges>"
    When The user clicks the submit button in triff plan
    Then  The user should see the success msg

    Examples: 
      | Monthrent | freeloc | freeint | freesms | loccharges | intcharges | smscharges |
      |       300 |     400 |     600 |     300 |        200 |        400 |        100 |
      |       200 |     392 |     677 |     758 |        536 |        686 |        756 |
