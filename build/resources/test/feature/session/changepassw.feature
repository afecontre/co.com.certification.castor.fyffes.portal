Feature: Change of Password
  As a user
  I want to change my password
  To protect my access data

  @tag1
  Scenario Outline: Change Password
    Given That the user requires changed his password
    When Enter his <username> and <password> and go to chang password by <newpassw>
    Then Can enter his new data
    Examples:
    |username|password|newpassw|
    |lgomez  |@bc.123 |@bc.456 |
    |lgomez  |@bc.456 |@bc.123 |



