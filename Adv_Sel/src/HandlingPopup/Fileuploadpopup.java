package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/fileuploadpopup.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\HP\\Downloads\\alka mishra Automation testing.pdf");
		
		driver.quit();
	}

}
