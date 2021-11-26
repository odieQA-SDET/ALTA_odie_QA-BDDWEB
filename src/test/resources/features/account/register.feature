Feature: Registration feature in demoqa.com
  As a customer would like to have a new account
  I want to Register with the new account
  So that I can take books to the BooksStore


  Scenario: Registration Success
    Given I was on the Login in this page
    When I clicked 'New User' in page Registration
    When I filled First Name, Last Name, UserName, and Password
    When I clicked 'CHAPTCHA' robot
    And I clicked 'Register' in page Register
    Then I have made a New Account