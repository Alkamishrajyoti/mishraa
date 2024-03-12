package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_css 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML%20NOTES/sinchsam.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='sinchu']")).sendKeys("alkamishra");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='sinchu']")).clear();
driver.findElement(By.cssSelector("a[href='https:www.amazon.com']")).click();
	}

}
