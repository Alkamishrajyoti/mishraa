package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(8000);
		//driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
		//Thread.sleep(8000);
	    driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys("alka54069@gmail.com");
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//button[@type='button']/../button/span")).click();
	    Thread.sleep(8000);
	    driver.quit();

	}
	

}

