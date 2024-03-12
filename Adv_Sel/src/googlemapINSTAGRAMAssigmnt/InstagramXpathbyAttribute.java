package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpathbyAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("alka_mishra_1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("8604169112");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
