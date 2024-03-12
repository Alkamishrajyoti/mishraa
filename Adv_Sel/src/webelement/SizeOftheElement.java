package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOftheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension size = driver.findElement(By.id("email")).getSize();
		System.out.println(size);
		int height = size.getHeight();
		 int width = size.getWidth();
		 System.out.println("the height is:"+height);
		 System.out.println("the width is:"+width);
		 
		 driver.quit();
		
		
		
	}

}
