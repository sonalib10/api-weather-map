package POM;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Resource {

    public static JsonPath rawToJSON(Response res){
        String responseString = res.asString();
        JsonPath x = new JsonPath(responseString);
        return x;
    }
}
