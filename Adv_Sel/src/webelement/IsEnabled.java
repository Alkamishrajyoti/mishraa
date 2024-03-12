package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/checkbox.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("cbox"));
		boolean b = ele.isEnabled();
		if(b)
		{
			System.out.println("the element is enabled");
		}
		else
		{
			System.out.println("the element is not enabled");
		}
		driver.quit();
		
		

	}


	}


