package json_parsing;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get22 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		Response res=req.request(Method.GET,"api/users?page=2");
		res.prettyPrint();
		System.out.println("-----------------------");
		String value=res.asString();
		JsonPath j=new JsonPath(value);
		String id=j.getString("data.id");
		System.out.println(id);
		String fn=j.getString("data.first_name");
		System.out.println(fn);

	}

}
