package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {

	@Test
	public void test1()
	{
		Reporter.log("Asia",true);

	}
	@Test
	public void test2()
	{
		Reporter.log("India",true);
	}

}
