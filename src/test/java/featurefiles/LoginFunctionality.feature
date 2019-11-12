Feature: User Login Functionality

  #This is how background can be used to eliminate duplicate steps
  #Background:
  #Given XXX
  #When YYY
  #Then ZZZ

  Scenario: User is going to login successfully
    Given User will navigate to the webpage
    When User will login into application with "Tim" and "1234"
    Then Dashboard will appear with "True"
    And User will see something

  Scenario: User is going to login successfully
    Given User will navigate to the webpage
    When User will login into application with "Anna" and "1234"
    Then Dashboard will appear with "False"
    And User will see something

  Scenario: User is going to sign in successfully
    Given User will navigate to the webpage
    When User will sign in with following information
    |firstname|lastname|phone|email|address|
    Then Dashboard will appear with "False"
    And User will see something

  Scenario Outline: User is going to login
    Given User will navigate to the webpage
    When User login into with "<username>" and "<password>"
    And User will see something
    Examples:
      |username|password|
      |user1|password1|
      |user2|password2|
      |user3|password3|
      |user4|password4|
