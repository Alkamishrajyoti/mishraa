package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
			
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("alka@gmail.com");	
	
		driver.quit();
	}

}
