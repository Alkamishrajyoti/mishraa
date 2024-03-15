package pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req=RestAssured.given();
		Response res=req.request(Method.GET,"api/users/2");
		Single_user single=res.as(Single_user.class);
		Data d=single.getData();
		Support s=single.getSupport();
		String fn=d.getFirst_name();
		String url=s.getUrl();
		System.out.println(fn+" "+url);
		

	}

}
