Feature: login feature
  Scenario Outline: As user I am able to login successfully with a valid username and password
    Given I open the login page
    When I input valid username and password
    And I click on the login button
    Then I log in successfully


