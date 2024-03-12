package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilicit_progBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds'"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("10");
		WebElement ele1 = driver.findElement(By.xpath("button[text()='Start']"));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		ele1.click();
		Thread.sleep(1000);
		WebElement ele3 = driver.findElement(By.xpath("//option[text()='Select Your Answer']"));
		Thread.sleep(4000);
		ele3.click();
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.xpath("//option[text()='Yes']"));
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOf(ele2));
		Thread.sleep(2000);
		ele2.click();
		
		

	}

}
