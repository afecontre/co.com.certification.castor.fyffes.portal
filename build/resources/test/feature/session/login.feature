Feature: Log In Fyffes Portal
  As a user
  I want to log in the Fyffes portal
  To browse all applications

  @tag1
  Scenario Outline:Log In
    Given The user is on the main page
    When The user enter <username> and <password>
    Then You can see the Fyffes portal
    Examples:
      | username | password |
      | lgomez   | @bc.123  |