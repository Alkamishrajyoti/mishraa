package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifygettitlefacebook
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("tile is correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
		driver.quit();
		
	}
	

}
