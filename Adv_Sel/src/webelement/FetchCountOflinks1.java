package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCountOflinks1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/HP/Desktop/FetchCountOflinks.html");
			Thread.sleep(1000);
			List<WebElement> links = driver.findElements(By.xpath("//input"));
			int count=links.size();
			System.out.println(count);

		}

	

	}


