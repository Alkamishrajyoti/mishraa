package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("top");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("span[class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
