Feature: Login Action
  Scenario Outline: Successful login with valid credentials
    Given User is on home page
    When User navigate to login page
    And User enters "<username>" and "<password>"
    Then Message displayed login successfully
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
