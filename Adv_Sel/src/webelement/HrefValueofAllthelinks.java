package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefValueofAllthelinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int count = all_links.size();
		for(WebElement links:all_links)
		{
			String url = links.getAttribute("href");
			System.out.println(url);
		}
		
	}

}
