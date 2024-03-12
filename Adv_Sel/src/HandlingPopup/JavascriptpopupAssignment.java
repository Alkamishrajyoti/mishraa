package HandlingPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptpopupAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(1000);
		
				
		
		Alert alt1=driver.switchTo().alert();
		Thread.sleep(1000);
		alt1.accept();
		
		driver.quit();

	}

}
