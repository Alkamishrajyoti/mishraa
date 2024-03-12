package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void compose()
	{
		Reporter.log("message created",true);
	}
	@Test(dependsOnMethods="compose")
	public void sentItems()
	{
		Reporter.log("message delivered",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="sentItems")
	public void trash()
	{
		Reporter.log(" message delivered",true);
	}
	

}
