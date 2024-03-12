package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Apna Bana Le");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[.='Share'])[3]/../../../..//button[@title='I like this']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]/../..")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("alka54069@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("momosalka");
		

	}

}
