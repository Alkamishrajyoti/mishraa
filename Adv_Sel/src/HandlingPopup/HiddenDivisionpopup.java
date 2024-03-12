package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
