package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defaultvalue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/defaultvalue.html");
		Thread.sleep(1000);
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='tbox']"));
		txtbox.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(1000);
		txtbox.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		txtbox.sendKeys("ALKA MISHRA");
		driver.quit();
		
		

	}

}
