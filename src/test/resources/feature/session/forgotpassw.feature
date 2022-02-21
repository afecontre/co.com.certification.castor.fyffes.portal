Feature: Validate Forgot Password
  As a User
  I want to Recover my password
  To be able to enter the fyffes portal

  Scenario Outline:Forgot Password
    Given The user is on the login page
    When The user send his <username> and <email>
    Then You can recover your password and enter the portal
    Examples:
      | username | email                     |
      | lgomez   | lesly.gomez@castor.com.co |