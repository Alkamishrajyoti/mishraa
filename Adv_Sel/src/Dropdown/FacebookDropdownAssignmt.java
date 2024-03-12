package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownAssignmt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		 WebElement drop = driver.findElement(By.id("day"));
		 Select sel=new Select(drop);
		 sel.selectByValue("13");
		 Thread.sleep(1000);
		 
		 WebElement drop1 = driver.findElement(By.id("month"));
		 Select sel1=new Select(drop1);
		 sel1.selectByValue("6");
		 Thread.sleep(1000);
		 
		 WebElement drop2 = driver.findElement(By.id("year"));
		 Select sel2=new Select(drop2);
		 sel2.selectByValue("1995");
		 Thread.sleep(1000);
		 
		 driver.quit();
		 
		

	}

}
