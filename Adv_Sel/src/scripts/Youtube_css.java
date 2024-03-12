package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("apna bana le piya");
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
	}
}
