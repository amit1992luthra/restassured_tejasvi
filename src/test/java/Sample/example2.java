package Sample;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class example2 {
	
	@Test(enabled = false)
	public void test1()
	{
		//given().get("https://petstore.swagger.io/v2/pet/9222968140497322654").then().body("name",equalTo("id"));
		
		//given().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then().body("name",hasItems("id7","test","fish")).log().all();
	}
	
	
	@Test(enabled = false)
	public void withheaders()
	{
		//given().get("https://petstore.swagger.io/v2/pet/9222968140497322654").then().body("name",equalTo("id"));
		
		given().headers("content-type","Application/JSON").contentType(ContentType.JSON).accept(ContentType.JSON).get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then().body("name",hasItems("id7","test","fish")).log().all();
	}
	
	
	@Test
	public void Post()
	{
		//given().get("https://petstore.swagger.io/v2/pet/9222968140497322654").then().body("name",equalTo("id"));
		
		/*Map<String,Object> map = new HashMap<String,Object>();
		map.put("\"name\"","amit");
		map.put("status","available");
		System.out.println(map);*/
		String b ;		
		
		
		JSONObject request = new JSONObject();
		request.put("status","available");
		request.put("name","amit");
		System.out.println(request.toJSONString());
		
		//request = "\"{"id":0,"category":{"id":0,"name":"string"},"name":"doggie","photoUrls":["string"],"tags":[{"id":0,"name":"string"}],"status":"available"}\""
		
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("user", "James");

		jsonObject.put("role", "admin");
		JSONObject jsonobject2 = new JSONObject();
		jsonobject2.put("name", "amit");
		JSONArray jsonArray = new JSONArray();
		jsonobject2.put("object1",jsonObject);
		
		jsonArray.add("hello");
		jsonArray.add("hello1");
		jsonArray.add("hello2");
		jsonArray.add("hello3");
		
		
		
		jsonObject.put("resource_permissions", jsonArray);
		System.out.println(jsonobject2.toJSONString());
		
		String requestBody = "{\n" +
	            "  \"title\": \"foo\",\n" +
	            "  \"body\": \"bar\",\n" +
	            "  \"userId\": \"1\" \n}";
		

	
		//given().headers("content-type","Application/JSON").contentType(ContentType.JSON).accept(ContentType.JSON).get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then().body("name",hasItems("id7","test","fish")).log().all();
	}
	
	

}
