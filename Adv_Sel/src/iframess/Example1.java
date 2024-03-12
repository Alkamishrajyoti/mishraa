package iframess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/FRAM/main1.html");
		Thread.sleep(3000);
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.sendKeys("alka");
		driver.switchTo().frame("frame1");
		
		
		
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.sendKeys("mishra");
		
		Thread.sleep(3000);
		t2.clear();
		
		WebElement c1 = driver.findElement(By.className("c1"));
		c1.click();
		c1.click();
		driver.switchTo().defaultContent();
		t1.clear();
		
	}

}
