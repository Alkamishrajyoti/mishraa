package autoitscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmntnternetHerokuapp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Auth")).click();
		
		Runtime.getRuntime().exec("\"C:\\Users\\HP\\Desktop\\Autoit\\herouapp.exe\"");
		
		Thread.sleep(8000);
		driver.quit();

	}

}
