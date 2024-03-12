package GenericScriptTestng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript {
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
	}

}
