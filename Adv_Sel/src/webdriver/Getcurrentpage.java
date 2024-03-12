package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrentpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		//driver.navigate().to("https://www.facebook.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		if(currenturl.equals("https://www.facebook.com/"))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is wrong");
		}
		
		driver.quit();
		//driver.close();

	}

}
