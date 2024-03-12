package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssvalue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String fontsize = link.getCssValue("font-size");
		String fontfamily = link.getCssValue("font-family");
		System.out.println(fontsize);
		System.out.println(fontfamily);
		
		driver.quit();
	}

}
