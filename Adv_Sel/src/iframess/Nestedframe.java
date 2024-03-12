package iframess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/FRAM/Nestedframe/main.html");
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.id("t1"));
		text1.sendKeys("alka");
		driver.switchTo().frame("frame2");
		
		WebElement text2 = driver.findElement(By.id("t2"));
		text2.sendKeys("mishra");
		driver.switchTo().frame("frame3");

		WebElement text3 = driver.findElement(By.id("t3"));
		text3.sendKeys("alkamishra");
		
		
		
		
	}

}












  






