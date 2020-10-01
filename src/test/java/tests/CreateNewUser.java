package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class CreateNewUser {
	String payLoad="{\r\n"+
"firstName\": \"Alireza\",\r\n" + 
			"    \"title\": \"Khan.\",\r\n" + 
			"    \"middleName\": \"Ezekiel\",\r\n" + 
			"    \"lastName\": \"Huber\",\r\n" + 
			"    \"suffix\": \"Sunior\",\r\n" + 
			"    \"gender\": \"Male\",\r\n" + 
			"    \"maritalStatus\": \"Married\",\r\n" + 
			"    \"employmentStatus\": \"Jobless\",\r\n" + 
			"    \"birthDate\": \"1980-01-15T20:43:33.000+00:00\",\r\n" + 
			"    \"languagePref\": \"English\"}";
			
	@Test
	public void createUserByPayLoad() {
		RestAssured.baseURI="http://tekschool-test-env.herokuapp.com";
		RequestSpecification request=RestAssured.given();
		Response response=request.post(payLoad);
		
	}
	

}
