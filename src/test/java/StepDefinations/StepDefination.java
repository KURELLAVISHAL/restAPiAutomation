package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class StepDefination {

    @Given("the endpoint URL with authentication token")
    public void the_endpoint_url_with_authentication_token() {
        File jsonData = new File(System.getProperty("user.dir")+"src/main/resources/sample.xml");
        RestAssured.baseURI ="http://restapi.adequateshop.com";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/xml");
        request.body(jsonData);
        Response response = request.put("/api/Traveler/90");
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
    }


}