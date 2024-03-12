
package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InstagramReport {
	@Test
	public void  Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser Launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized",true);
		driver.get("https://www.instagram.com/");
		Reporter.log("url entered",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("ALKA");
		Reporter.log("username entered",true);
		Thread.sleep(1000);
		driver.close();
		
	
		

	}

}
