package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameAndtextofanelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(1000);
		String text = link.getText();
		String name = link.getTagName();
		Thread.sleep(1000);
		if(text.equals("Forgotten password?"))
		{
			System.out.println("text is correct");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("text is not correct");
			Thread.sleep(1000);
		}
		if(name.equals("a"))
		{
			System.out.println("input is correct");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("input is not correct");
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
