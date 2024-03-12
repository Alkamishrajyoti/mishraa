package assertionInTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends GenericLogin {
	@Test
	public void login()
	{
		String t = driver.getTitle();
		Assert.assertTrue(t.contains("DemoApps | Qspiders"));
		System.out.println("TC pass");
	}

}
