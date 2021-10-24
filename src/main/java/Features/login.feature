Feature: Login Action
#  @Test2
#  Scenario: Login with valid credential
#    Given User on Home page
#    When User go to login page
#    And Login with correct credentials
#      | test1212@gmail.com | 123456 |
#   # Then My Dashboard is displayed
#    Then User logout successfully

@test1
  Scenario Outline: Login with valid credential
    Given User on Home page
    When User go to login page
    And Login with "<username>" and "<passoword>"
   # Then My Dashboard is displayed
    Then User logout successfully
    Examples:
      | username           | passoword |
      | test1212@gmail.com | 123456    |



#  Scenario: Login with valid credential
#    Given User on Home page
#    When User go to login page
#    And Login with correct login credentials
#      | test1212@gmail.com | 123456 |
#   # Then My Dashboard is displayed
#    Then User logout successfully
