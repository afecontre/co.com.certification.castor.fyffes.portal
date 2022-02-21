Feature: O2C Credits and Debits
  As a User
  I want to access the credit and debit notes module
  To validate the different functionalities

  @tag1
  Scenario Outline: Credits and debits
    Given I need to process debits and credits
    When I entered the portal with my <username> and <password>
    Then I will be able to process the data of debits and credits
    Examples:
    |username|password|
    |lgomez  |@bc.123 |