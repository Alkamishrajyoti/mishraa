package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Href_alllink_forloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			Thread.sleep(1000);
			String href_val = link.getAttribute("href");
			System.out.println(href_val);
		}
		System.out.println("the count is "+count);
		
		
		

	}
	

}
