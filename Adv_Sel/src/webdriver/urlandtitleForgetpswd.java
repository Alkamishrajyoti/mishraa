package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlandtitleForgetpswd {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Facebook – log in or sign up"))
	{
		System.out.println("title is correct");
	}
	else
	{
		System.out.println("title is wrong");
	}
	
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	if(currenturl.equals("https://www.facebook.com/"))
	{
		System.out.println("url is corerct");
	}
	else
	{
		System.out.println("url is not correct");
	}
	driver.quit();
}
}
