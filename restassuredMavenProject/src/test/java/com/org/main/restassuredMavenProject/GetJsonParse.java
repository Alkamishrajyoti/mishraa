package com.org.main.restassuredMavenProject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetJsonParse {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, "api/users/2");
		res.prettyPrint();
		System.out.println("----------------");
		String value = res.asString();
		JsonPath j=new JsonPath(value);
		String val = j.getString("support.url");
		System.out.println(val);
		String fn = j.getString("support.text");
		System.out.println(fn);
		
	}

}
