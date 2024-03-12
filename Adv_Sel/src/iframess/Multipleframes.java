package iframess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipleframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/FRAM/MultipleFrames/main.html");
		Thread.sleep(500);
		WebElement text1 = driver.findElement(By.id("t1"));
		text1.sendKeys("alka");
		driver.switchTo().frame("frame2");
		Thread.sleep(500);
		WebElement text2 = driver.findElement(By.id("t2"));
		text2.sendKeys("mishra");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame3");
		driver.findElement( By.name("t3")).sendKeys("hello");
		
		
		Thread.sleep(2000);
		
		
		
	}

}
