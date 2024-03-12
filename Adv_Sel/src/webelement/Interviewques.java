package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewques {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/checkbox1.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("cbox"));
		if(ele.isDisplayed())
		{
			System.out.println("element is displayed");
		}
		if(ele.isEnabled())
		{
			System.out.println("element is enabled");
		}
		if(ele.isSelected())
		{
			System.out.println("element is selected");
		}
		else
		{
			System.out.println("element is not selected");
			ele.click();
		}
		driver.quit();
	

	}

}
