package weatherapi;

import POM.Resource;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import weatherapi.dto.WeatherData;

import java.io.IOException;
import java.io.InputStream;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HolidayMakerSteps {

    private Response response;
    private JsonPath jsonPath;
    private RequestSpecification request;
    Properties properties;

    @Given("^I like to holiday in Moscow and only on thursdays$")
    public void iLikeToHolidayInMoscowAndOnlyOnThursdays() throws IOException {
        properties = new Properties();
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("env.properties");
        properties.load(inputStream);
//        request = given().queryParam("q", "Sydney,au").
//                queryParam("APPID", properties.getProperty("KEY")).queryParam("lat", "-33.85").queryParam("lon", "151.22").log().all();
//
    }

    @When("^I look up the weather forecast$")
    public void iLookUpTheWeatherForecast() {
        response = given().when().get(properties.getProperty("HOST"));
    }

    @Then("^I receive the weather forecast$")
    public void iReceiveTheWeatherForecast() {
        response = response.then().statusCode(200).and().contentType(ContentType.JSON).extract().response();
    }

    @And("the temperature is colder than {double} degrees on {string}")
    public void theTemperatureIsColderThanDegrees(Double thresholdTemprature, String dayOfWeek) throws Throwable {
        jsonPath = Resource.rawToJSON(response);

        List<WeatherData> weatherDataList = jsonPath.getList("list", WeatherData.class);

        List<WeatherData> tempratures = weatherDataList
                .stream()
                .filter(weatherData -> LocalDateTime.ofInstant(Instant.ofEpochMilli(weatherData.getDt() * 1000), ZoneId.of("Australia/Sydney")).getDayOfWeek().equals(DayOfWeek.valueOf(dayOfWeek)))
                .filter(weatherData -> {
                    System.out.println(weatherData.getTemp().getDay() - (273.15));
                    return weatherData.getTemp().getDay() - (273.15) < thresholdTemprature;
                }).collect(Collectors.toList());

        if (tempratures.size() > 0) {
            assertTrue(true);
            System.out.println("Temperature is less than -10 degrees");
        } else {
            assertTrue(false);
            System.out.println("Temperature is above -10 degrees");
        }
    }

    @And("^Response has Moscow as destination$")
    public void responseHasSydneyAsDestination() {
        jsonPath = Resource.rawToJSON(response);
        String cityname = jsonPath.get("city.name");
        assertEquals("Response has Moscow as destination", "Moscow", cityname);
    }
}
