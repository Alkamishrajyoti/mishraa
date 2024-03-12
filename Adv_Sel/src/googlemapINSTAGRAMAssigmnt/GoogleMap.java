package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("rajajinagar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("vijayanagar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Details']")).click();
		
		
		driver.quit();
		
		

	}

}
