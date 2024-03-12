package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapAutomatManual {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/SwapAutomatManual1.html");
		String St1 = "AUTOMATION";
		String st2 = "MANUAL";
		String temp = "";
		temp=St1;
		St1=st2;
		st2=temp;
		
		
		 WebElement ele1 = driver.findElement(By.xpath("//input[@id='tbox']"));
		 Thread.sleep(1000);
		 ele1.clear();
		 Thread.sleep(1000);
		 ele1.sendKeys(St1);
		 Thread.sleep(1000);
		 
		 
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='tbox1']"));
		Thread.sleep(1000);
		ele2.clear();
		Thread.sleep(1000);
		ele2.sendKeys(st2);
		Thread.sleep(1000);
		driver.quit();
		
		
		}
	

	

}

