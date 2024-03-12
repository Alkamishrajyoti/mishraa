package HandlingPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyTheParentBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		 WebElement ele = driver.findElement(By.id("windowButton"));
		 ele.click();
		 Set<String> all_id = driver.getWindowHandles();
		 for(String id:all_id)
		 {
			 driver.switchTo().window(id);
			 String title = driver.getTitle();
			 if(title.equals("DEMOQA"))
			 {
				 driver.close();
			 }
			 
		 }

	}

}
