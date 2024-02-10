package base_URL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {
    protected RequestSpecification specJsonPlace;

    @Before
    public void setUp(){
       specJsonPlace = new RequestSpecBuilder().
               setBaseUri("https://jsonplaceholder.typicode.com/posts").
               build();
    }
}

//RequestSpecification is an interface and objects cannot be created from interfaces.Therefore, it does not have a constructor.
//Thus, we utilize the RequestSpecBuilder() class constructor from the RestAssured library to assign the spec.
