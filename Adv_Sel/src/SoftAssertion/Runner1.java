package SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericScriptTestng.GenericScript;

public class Runner1  extends GenericScript{
	@Test
	public void validlogin()
	{
		String title= driver.getTitle();
		System.out.println(title);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "DemoApps | Qspiders");
		System.out.println("1");
		sa.assertAll();
	}

}
