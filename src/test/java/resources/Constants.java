package resources;

public enum Constants {
	
	AddPlaceAPI("/maps/api/place/addPlace/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/delete/json");

	private String resource;
	
	Constants(String resource){
		
		this.resource = resource;
	}
	
	public String getResource() {
		return resource;
	}

}
