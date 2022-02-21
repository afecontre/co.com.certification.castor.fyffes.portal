Feature: Supply Chain Dashsboard Acces
  As a user
  I want to access the o2c dashboard
  To validate its operation

  Scenario Outline: Supply Chain Dashsboard
    Given The user is in the fyffes portal
    When Enter my <username> and <password>
    Then I can see the dashboar Supply Chain
    Examples:
    |username |password|
    |lgomez   |@bc.123 |