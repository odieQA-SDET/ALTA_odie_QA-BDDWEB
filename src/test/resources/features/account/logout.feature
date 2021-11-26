Feature: Log Out feature in demoqa.com
  As a customer at Bookstore of Demoqa.com
  After bought some books
  I'd like to finish my activity in my account


  Scenario: Log Out Success
    Given I was on the Login page
    When I filled my username and Password correctly
    When I clicked 'Login' button
    And I clicked 'Log Out' button in page Books Store
    Then I was taken to the dashboard Login page