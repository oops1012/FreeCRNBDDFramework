Feature: Login Action
#
#  Scenario: Login with valid credential
#    Given User on Home page
#    When User go to login page
#    And Login with correct credentials
#   # Then My Dashboard is displayed
#    Then User logout successfully


  Scenario Outline: Login with valid credential
    Given User on Home page
    When User go to login page
    And Login with "<username>" and "<passoword>"
   # Then My Dashboard is displayed
    Then User logout successfully
    Examples:
      | username           | passoword |
      | test1212@gmail.com | 123456    |
