Feature: Holiday Maker
  This feature deals with a holiday maker who selects holiday location, weather and day to holiday.
  Scenario: A happy holiday maker

    Given I like to holiday in Moscow and only on thursdays
    When I look up the weather forecast
    Then I receive the weather forecast
    And the temperature is colder than -10.00 degrees on "THURSDAY"
    And Response has Moscow as destination
