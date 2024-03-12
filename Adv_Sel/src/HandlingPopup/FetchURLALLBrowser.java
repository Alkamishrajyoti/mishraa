package HandlingPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchURLALLBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.close();
		}

	}

}
