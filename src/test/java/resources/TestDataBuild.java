package resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pojo.*;

public class TestDataBuild {

	Testing t = new Testing();
	
	public Testing addPlacePayLoad() {
		
		Location loc = new Location();
		List<String> list = new ArrayList<>(Arrays.asList("shoe","test"));
		
		
		loc.setLat("-38.383494");
		loc.setLng("33.427362");
		t.setLocation(loc);
		t.setAccuracy("50");
		t.setName("Frontline house");
		t.setPhone_number("(+91) 983 893 3937");
		t.setAddress("29, side layout, cohen 09");
		t.setTypes(list);
		t.setWebsite("http://rahulshettyacademy.com");
		t.setLangauge("French-IN");
		System.out.println("Completed");
		
		return t;
	}
	
}
