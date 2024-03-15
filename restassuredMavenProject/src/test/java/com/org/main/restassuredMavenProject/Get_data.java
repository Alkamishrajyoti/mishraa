package com.org.main.restassuredMavenProject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_data {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req=RestAssured.given();
		Response res = req.request(Method.GET,"/api/users?page=2");
		System.out.println(res.asString());
		System.out.println("-----------");
		res.prettyPrint();

	}

}
