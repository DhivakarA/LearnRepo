package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		PlaceAPIs pa = new PlaceAPIs();
		pa.add_place_payload();
		pa.user_calls_with_post_http_request("AddPlaceAPI");
		
	}
	
}
