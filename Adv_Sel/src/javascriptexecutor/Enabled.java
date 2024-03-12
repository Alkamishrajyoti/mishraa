package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/javascriptexecutor/disabled.html");
		Thread.sleep(1000);
		boolean b = driver.findElement(By.id("i1")).isEnabled();
		if(b)
		{
			System.out.println("element is disabled");
		}
		else
		{
			System.out.println("element is disabled");
		}
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1').value='ABC'");
		Thread.sleep(1000);
		jse.executeScript("document.getElementById('i1').value='1'");

	}

}
