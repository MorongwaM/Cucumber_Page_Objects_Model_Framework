Feature: feature to test login in Mercury new tours

  Scenario Outline: validate login to Mercury tours is working

    Given browser is opened
    And user is on home page
    When user click login link
    And the user enter <username> and <password>
    And user click submit button
    Then user is navigated to the Mercury home page
    And close browser


    Examples:
      | username| password |
      | Test    | Test     |
      | Test1   | Test1    |