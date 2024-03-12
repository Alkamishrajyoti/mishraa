package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/checkboxes.html");
		Thread.sleep(2000);
		List<WebElement> cboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = cboxes.size();
		for(int i=0;i<count;i++)
		{
			WebElement cbox = cboxes.get(i);
			cbox.click();
			Thread.sleep(1000);
			
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement cbox = cboxes.get(i);
			cbox.click();
			Thread.sleep(1000);
		}
		
	}

}
