

Feature: Test Login Functionality

  Scenario: check if user login is sucessful after entering valid credentials
    
    Given User is on login page
    When user eneters valid user name and password
    And clicks on login button
    Then user is navigated to homepage
    

  