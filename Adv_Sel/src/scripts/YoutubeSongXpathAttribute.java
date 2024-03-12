package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSongXpathAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apna bana le");
		driver.findElement(By.xpath("//button[@id=\'search-icon-legacy\']")).click();
	}

}
