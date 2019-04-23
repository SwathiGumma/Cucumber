
#Sample Feature Definition Template

Feature: To test add customer functionality
  
  Scenario: To verify the customer id generated
    Given The user is in the add customer page
    
    When The user fill the valid customer details
    When the user clicks the submit button
    Then The user should see the customer id generated
    
 