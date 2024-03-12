package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfallthelinksinreverseOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=count-1;i>=0;i--)
		{
			WebElement link = links.get(i);
			String txt = link.getText();
			System.out.println(txt);
		}

	}

}
