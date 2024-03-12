package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductXpathAttributAssgnmt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Samsung Galaxy ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy S24 ')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
