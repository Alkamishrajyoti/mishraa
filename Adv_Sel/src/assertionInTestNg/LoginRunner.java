package assertionInTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRunner extends GenericLogin {
	@Test
	public void login()
	{
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("DemoApps | Qspiders"));
		System.out.println("TC pass");
	}

}
