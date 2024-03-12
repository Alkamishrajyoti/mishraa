package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchfromInstagram {
	public static void main(String[] args) throws InterruptedException {
		String val1=Generic_fetch_data.get_data("./Excel/seleniumTestData.xlsx", "flipkart", 3, 0);
		System.out.println(val1);
		
		String val2=Generic_fetch_data.get_data("./Excel/seleniumTestData.xlsx", "flipkart", 11, 0);
		System.out.println(val2);
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys(val1);
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys(val2);
		Thread.sleep(8000);
		WebElement lgn = driver.findElement(By.xpath("//div[text()='Log in']"));
		lgn.click();
		driver.findElement(By.xpath("//button[text()='Save info']"));
		
	}

}
     