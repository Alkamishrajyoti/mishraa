package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDemoappsQspiders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='With Element']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebElement drop_down = driver.findElement(By.xpath("//p[text()='Do you like Automation']"));
		Thread.sleep(5000);
		Select sel=new Select(drop_down);
		sel.selectByVisibleText("Yes");
		driver.quit();
	}
}
