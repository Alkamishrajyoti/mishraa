package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginsendrequest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("alka_mishra_1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("8604169112");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save info']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Search']/../../../../../../../../../../../div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("nshilpanmurthy");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Messages']")).click();
		Thread.sleep(8000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
