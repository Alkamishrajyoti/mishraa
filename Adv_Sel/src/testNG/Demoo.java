package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demoo {
	@Test(enabled=false)
	public void test()
	{
		Reporter.log("Asia",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("India",true);
	}
	

}
