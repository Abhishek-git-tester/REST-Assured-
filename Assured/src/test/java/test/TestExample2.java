package test;

import org.testng.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;  // This Import is made static to use classes directly.

public class TestExample2 {
	
	@Test
	public void StaticRestAssured() {
		
		given().
		  get("https://reqres.in/api/users?page=2").
		then().
		  statusCode(200).
		body("data[1].id", equalTo(8)).
		  log().body();
		
	}

	@Test
	public void GetSingleUser() {
		  given().
		get("https://reqres.in/api/users/2").
		  then().
		statusCode(200).
		log().all();
	}
	
}
