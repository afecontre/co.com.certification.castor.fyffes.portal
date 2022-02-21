Feature: O2C Dashsboard Acces
  As a user
  I want to access the o2c dashboard
  To validate its operation

  Scenario Outline: O2C Dashsboard
    Given The user is in the portal
    When Register with your <username> and <password>
    Then You can see the dashboar of o2c
    Examples:
    |username |password|
    |lgomez   |@bc.123 |