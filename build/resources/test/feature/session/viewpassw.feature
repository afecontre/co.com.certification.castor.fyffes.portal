Feature: View Password in Portal Fyffes
  As a user
  I want to see my password when I type it
  To validate that it is correct

  @tag1
  Scenario Outline: View Password
    Given That the user enter their username and password
    When Digit your <username> and your <password>
    Then You can see if your password is correct
    Examples:
      | username  | password   |
      | lgomez    | @bc.123    |
