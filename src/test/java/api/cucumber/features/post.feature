Feature: Post feature of facebook
  This will test the post functionality at the user wall
  Scenario: Post a message on user wall

    Given  user should be logged in and should be present on his wall
    When I type the message in the box
    And click on post button
    Then the message should get posted