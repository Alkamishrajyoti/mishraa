package HandlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(1000);
	WebElement e = driver.findElement(By.xpath("//span[text()='Downloads']"));
	Actions ac=new Actions(driver);
	ac.contextClick(e).perform();
	Thread.sleep(1000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(1000);
	
	WebElement e1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
	ac.contextClick(e1).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(3000);
	
	WebElement e2 = driver.findElement(By.xpath("//span[text()='Projects']"));
	ac.contextClick(e2).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(3000);
	
	WebElement e3 = driver.findElement(By.xpath("//span[text()='Support']"));
	ac.contextClick(e3).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(3000);
	
	WebElement e4 = driver.findElement(By.xpath("//span[text()='Blog']"));
	ac.contextClick(e4).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(3000);
	
	Set<String> alid = driver.getWindowHandles();
	for(String id:alid)
	{
		driver.switchTo().window(id);
		driver.close();
		Thread.sleep(1000);
	}
	
	
	
	
}
}
