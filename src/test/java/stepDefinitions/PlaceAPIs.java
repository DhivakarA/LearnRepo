package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import io.cucumber.java.en.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import resources.Constants;
import resources.TestDataBuild;
import resources.Utils;

public class PlaceAPIs extends Utils{

	ResponseSpecification res;
	Response response;
	TestDataBuild tdb = new TestDataBuild();
	Constants c ;
	
	@Given("Add Place Payload")
	public void add_place_payload() throws IOException {	
		
	res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	}

	@When("User calls {string} with POST Http Request")
	public void user_calls_with_post_http_request(String string) throws IOException {
		
		Constants c = Constants.valueOf(string);
		System.out.println(c.getResource());
		
		response = given().log().all().spec(requestSpecification()).body(tdb.addPlacePayLoad()).when().post(c.getResource()).then().spec(res).extract().response();
		
		System.out.println(response);
		
		}
	@Then("API call is success with statuscode {int} OK")
	public void api_call_is_success_with_statuscode_ok(int expected) {
	    
		int statuscode = response.getStatusCode();
		junit.framework.Assert.assertEquals(expected, statuscode);
		
		
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
		String res = response.asString();
	   JsonPath js = new JsonPath(res);
	   String place_id = js.get(string).toString();
	   System.out.println(place_id);
	  
	}


}
