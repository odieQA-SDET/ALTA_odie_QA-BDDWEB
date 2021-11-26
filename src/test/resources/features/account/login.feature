Feature: Login feature in demoqa.com
  As a customer at BooksStore
  I want to buy my favorite books
  So that I can see the book at my whislist


  Scenario: Login invalid Username But Password
    Given I was on the Login page
    When I filled my Username and Password incorrectly
    When I clicked 'Login' button in login page
    Then Invalid username or password! Alert

  Scenario: Login Invalid Password But Username
    Given I was on the Login page
    When I filled my Username correctly and invalid Password
    When I clicked 'Login' button in page system
    Then Invalid username or password! Alert

  Scenario: Login Invalid Both Of Username and Password
    Given I was on the Login page
    When I filled the invalid username and Password
    When I clicked 'Login' button web
    Then Invalid username or password! Alert


  Scenario: Login The Empty Username and Password
    Given I was on the Login page
    When I filled the empty username and Password
    When I clicked 'Login' button in page
    Then Invalid username or password! Alert

  Scenario: Login The Empty Password But Username Correctly
    Given I was on the Login page
    When I filled my username correctly and Empty Password
    When I clicked 'login' button the empty Password
    Then Invalid username or password! Alert

  Scenario: Login The Empty Username But Password
    Given I was on the Login page
    When I filled the empty username and password correctly
    When I clicked 'Login' button in web
    Then Invalid username or password! Alert


  Scenario: Login Success
    Given I was on the Login page
    When I filled my username and Password correctly
    When I clicked 'Login' button
    Then I was taken to the dashboard

