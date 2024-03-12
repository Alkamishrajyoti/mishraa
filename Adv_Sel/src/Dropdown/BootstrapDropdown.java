package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shaadi.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='Dropdown-control'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();

	}

}
