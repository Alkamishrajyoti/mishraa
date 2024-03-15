package com.org.main.restassuredMavenProject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get2 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, "/api/users?page=2");
		res.prettyPrint();
		String val = res.asString();
		JsonPath j=new JsonPath(val); 
		String last_name = j.getString("data[4].last_name");
		System.out.println(last_name);
		String text = j.getString("support[0].text");
		System.out.println(text);

	}

}
