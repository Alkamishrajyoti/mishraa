package com.orangehrm.genric;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "endtoend")
	public Object[][] getData() {
		
		Object [][]arr= {{"C:\\Users\\Faculty\\Desktop\\scoreboard.jfif","firstname",
			       "middlename","lastname"}};
		return arr;
	}
}
