package LocalTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class LocalServerTest {
	
	@Test
	public void GetMethod() {
		
		baseURI = "http://localhost:3000";
		given().
		  get("/data").
		then().
		  statusCode(200).
		log().all();
	}

}
