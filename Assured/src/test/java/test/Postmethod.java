package test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Postmethod {
	
	@Test
	public void PostTest() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Abhishek");
		request.put("job", "Student");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  post("/users").
		then().
		  statusCode(201).
		log().all();
		
	}

}
