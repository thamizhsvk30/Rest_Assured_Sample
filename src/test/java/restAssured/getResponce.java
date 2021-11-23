package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class getResponce {

	public static void main(String[] args) {
		
		/*Response response = RestAssured.get("https://www.google.co.in");
		int statusCode = response.statusCode();
		String statusLine = response.statusLine();
		//ResponseBody body = response.getBody();
		//String asPrettyString = body.asPrettyString();
		System.out.println(statusCode);
		System.out.println(statusLine);*/
		
		Response response = RestAssured.get("https://reqres.in/api/unknown");
		int statusCode = response.statusCode();
		System.out.println("Status code : "+statusCode);
	  
		ResponseBody body = response.body();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}
	

}
