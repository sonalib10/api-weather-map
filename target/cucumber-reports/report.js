$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/weatherapi/holidaymaker.feature");
formatter.feature({
  "name": "Holiday Maker",
  "description": "  This feature deals with a holiday maker who selects holiday location, weather and day to holiday.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "A happy holiday maker",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I like to holiday in Moscow and only on thursdays",
  "keyword": "Given "
});
formatter.match({
  "location": "HolidayMakerSteps.iLikeToHolidayInMoscowAndOnlyOnThursdays()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I look up the weather forecast",
  "keyword": "When "
});
formatter.match({
  "location": "HolidayMakerSteps.iLookUpTheWeatherForecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive the weather forecast",
  "keyword": "Then "
});
formatter.match({
  "location": "HolidayMakerSteps.iReceiveTheWeatherForecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the temperature is colder than -10.00 degrees on \"THURSDAY\"",
  "keyword": "And "
});
formatter.match({
  "location": "HolidayMakerSteps.theTemperatureIsColderThanDegrees(Double,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response has Moscow as destination",
  "keyword": "And "
});
formatter.match({
  "location": "HolidayMakerSteps.responseHasSydneyAsDestination()"
});
formatter.result({
  "status": "passed"
});
});