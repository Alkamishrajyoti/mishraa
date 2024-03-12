package PerformActionsFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsInsideFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/PerfromActionframe.html");
		Thread.sleep(1000);
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.sendKeys("abc");
		driver.switchTo().frame("frame1.html");
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.sendKeys("xyz");
		Thread.sleep(1000);
		WebElement c1 = driver.findElement(By.className("c1"));
		c1.click();
		driver.switchTo().defaultContent();
		t1.clear();
		

	}

}
