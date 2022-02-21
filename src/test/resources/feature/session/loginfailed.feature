Feature: Validate Message whit invalid username or password
  As a user
  I want to validate the wrong password message
  For the user to enter the correct values

  Scenario Outline: Login Failed
    Given The user does not remember their login details
    When The user entered the wrong <username> and <password>
    Then The system should prevent your entry and display an error message
    Examples:
      | username | password |
      | lgomes   | @bc*456  |