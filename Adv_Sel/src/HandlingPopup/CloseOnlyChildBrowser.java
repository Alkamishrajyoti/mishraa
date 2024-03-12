package HandlingPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		String pid = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		int count= all_id.size();
		System.out.println("count of id "+  count);
		
		//remove pid from all_id
		
		all_id.remove(pid);
		int count1=all_id.size();
		System.out.println( "after removing parent id "+  count1);
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			driver.close();
		}

	}

}
