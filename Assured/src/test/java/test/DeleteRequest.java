package test;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteRequest {
	
	@Test
	public void DeleteTest() {
		
		baseURI = "https://reqres.in/api";
		
		when().
		  delete("/users/2").
		then().
		  statusCode(204).
		log().all();
		
	}

}
