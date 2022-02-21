Feature: Log out of the portal
  As a user
  I want to close my session in the portal
  To exit the system correctly

  @tag1
  Scenario Outline: Log out
    Given That I am in the portal working
    When I enter <username> <password> and finished my work session
    Then I want to close my work session on the portal
    Examples:
      | username | password |
      | lgomez   | @bc.123  |