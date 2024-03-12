package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement dst = driver.findElement(By.id("bank"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		driver.quit();
		
}
}
