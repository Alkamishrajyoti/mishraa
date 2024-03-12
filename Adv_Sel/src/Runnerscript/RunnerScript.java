package Runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomconcept.PomScript;

public class RunnerScript {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		PomScript p=new PomScript(driver);
		p.passData();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		p.passData();
		p.passData1();
		p.login();
		
		driver.quit();
	}

}
