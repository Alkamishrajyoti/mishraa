package autoitscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\rr.exe");
		
		driver.quit();
	}

}
