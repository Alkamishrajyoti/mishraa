package pojo;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runnerclass {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users?page=2");
		 List_user list = res.as(List_user.class);
		 List<Data> d = list.getData();
		 
		 for(Data d1:d)
		 {
			 int id=d1.getId();
			 String fn=d1.getFirst_name();
			 System.out.println(id+" "+fn);
		 }

	}

}
