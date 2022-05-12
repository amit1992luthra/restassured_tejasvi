package Sample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Test1 {
	
	
	@Test(enabled = true)
	public void test1()
	{
		Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/9223372000001086000");
		String Statuscode = response.getStatusLine();
		String exp = response.jsonPath().getString("name");
		System.out.println(exp);
		System.out.println(Statuscode);
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.headers().toString());
		//System.out.println(re);
	}

		
		
			

	


	

}
