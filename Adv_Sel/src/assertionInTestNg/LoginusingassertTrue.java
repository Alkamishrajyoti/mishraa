package assertionInTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginusingassertTrue extends GenericLogin {
	@Test
	public void login()
	{
		driver.getTitle();
		Assert.fail();
	}

}


//  https://github.com/Alkamishrajyoti/mishraa.git