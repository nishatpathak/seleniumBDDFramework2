Feature: login to my account:
  As a user
  I want to add multiple login functionality
  @NewLogin1
  Scenario Outline:
    Given I am on homepage
    When I click on login btn on homepage
    And I enter username "<username>"
    And I enter password "<password>"
    And I click on login btn
    Then I should see logout btn

    Examples:
      | username     | password |
      | np@gmail.com | 123456   |
      | tp@gmal.com  | 123456   |