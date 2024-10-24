package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExample1 {
	
	@Test (priority = 0)
	public void test1() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("Status Code Is " +response.statusCode());
		System.out.println(response.getStatusLine());
		System.out.println("Response Time Is " +response.getTime());
		System.out.println("Header is " +response.getHeader("content-type"));
		System.out.println("Response Body Is " +response.getBody().asString());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	
	@Test (priority = 1)
	public void test2() {
		Assert.assertTrue(false);
		
	}

}
