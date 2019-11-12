Feature: User Invoke Browser Functionality
  @Amazon
  Scenario: User is going to invoke browser successfully
    Given User will navigate to the url as "http://www.amazon.com"
    When User will type in search box with "Toys"
    Then User will see toys
