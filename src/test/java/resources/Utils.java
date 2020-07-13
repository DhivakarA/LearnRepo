package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification req;
	
	public RequestSpecification requestSpecification() throws IOException {
		
		if (req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		FileInputStream fis = new FileInputStream("C:\\Users\\dhiva\\eclipse-workspace\\RESTAssured\\src\\test\\java\\resources\\data.properties");
		Properties props = new Properties();
		props.load(fis);
		
		req = new RequestSpecBuilder().setBaseUri(props.getProperty("URL")).addQueryParam("key", props.getProperty("key"))
				.setContentType(ContentType.JSON).addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
		
		return req;
		}
		return req;
		
	}
	
}
