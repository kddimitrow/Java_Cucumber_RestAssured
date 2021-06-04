package stepDefinition1;

import SerializationAndDeserialization.AddPlace;
import SerializationAndDeserialization.Location;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class stepDefinitionAdd  extends Utils {

    ResponseSpecification resspec;
    RequestSpecification res;
    Response response;

    TestDataBuild data = new TestDataBuild();

  /*  @Given("Add Place Payload with {string}  {string} {string}")
    public void add_Place_Payload_with(String name, String language, String address) throws IOException {



        res=given().spec(requestSpecification())
                .body(data.addPlacePayLoad(name,language,address));
    }*/
    @Given("Add Place Payload with {string}  {string} {string}")
    public void addPlacePayload(String name, String language, String address) throws IOException {




        RestAssured.baseURI = "https://rahulshettyacademy.com";

        RequestSpecification req = new RequestSpecBuilder()
                .setBaseUri(RestAssured.baseURI)
                .setContentType(ContentType.JSON)
                .build();

        resspec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();

        res = given().spec(requestSpecification()).body(data.addPlacePayLoad(name,language,address));


    }

    @When("user calls {string} with POST htt request")
    public void userCallsWithPOSTHttRequest(String arg0) {

        resspec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();

         response = res.when()
                            .post("/maps/api/place/add/json")
                            .then()
                            .spec(resspec)
                            .extract().response();

    }

    @Then("the API ca;; is success with status code {int}")
    public void theAPICaIsSuccessWithStatusCode(int arg0) {

        assertEquals(response.getStatusCode(),200);

    }

    @And("{string} in response body is {string}")
    public void inResponseBodyIsOK(String keyValue, String ExpectedValue) {
        String resp = response.asString();
        JsonPath js = new JsonPath(resp);
        assertEquals(js.get(keyValue).toString(), ExpectedValue);
    }


    
   /* @And("{string} in response body is {string}")
    public void in_response_body_is_ok(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/



}






