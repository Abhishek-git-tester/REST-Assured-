package test;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutRequestMethod {
	
	@Test
	public void PutTest() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Abhishek");
		request.put("job", "Tester");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  put("/users/2").
		then().
		  statusCode(200).
		log().all();
		
	}

}
