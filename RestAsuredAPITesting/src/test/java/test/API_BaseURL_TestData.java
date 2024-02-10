package test;

import base_URL.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class API_BaseURL_TestData extends JsonPlaceHolderBaseUrl {

    @Test
    public void test01(){
        //Step 1: Create URL and Request body.
         specJsonPlace.pathParam("pp1",22);

        //Step 2: Create expected data.

        JsonPlaceHolderTestData jsonPlaceHolder = new JsonPlaceHolderTestData();
        JSONObject expBody = jsonPlaceHolder.expectedDataCreate();
        //System.out.println(expBody);

        //Step 3: Save the response.
        Response response = given().
                spec(specJsonPlace).
                when().
                get("{pp1}");
        //response.prettyPrint();

        //Step 4: Do Assert
     //We create a respJSPath object from the JsonPath class and convert our response to Json format using the jsonPath() method.
        JsonPath resJSPath = response.jsonPath();

        //Comparing expected data with actual data.
        assertEquals(jsonPlaceHolder.successfulStatusCode,response.getStatusCode());
        assertEquals(expBody.getInt("userId"),resJSPath.getInt("userId"));
        assertEquals(expBody.getString("title"),resJSPath.getString("title"));
        assertEquals(expBody.getString("body"),resJSPath.getString("body"));
    }
}
