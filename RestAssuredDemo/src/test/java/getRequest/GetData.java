package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	@Test
	public void testResponseCode() {
		Response resp = RestAssured.get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/");
		int code = resp.getStatusCode();
		System.out.println("Status code is "+code);
		
		String data = resp.asString();
		System.out.println(data);
	}

}
