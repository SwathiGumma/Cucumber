
#Sample Feature Definition Template

Feature: To test add customer functionality

  
  Scenario: To verify the customer id generated
    Given the user is in the add customer page
   

    When the user fill the valid customer details
     |swathi|gumma|ajfl@gamil.com|addr|9492648312|
    When The user clicks the submit button

    Then the user should see the customer id generated

    


 
