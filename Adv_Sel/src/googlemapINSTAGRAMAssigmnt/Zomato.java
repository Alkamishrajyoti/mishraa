package googlemapINSTAGRAMAssigmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zomato.com");
		Thread.sleep(1000);
		WebElement restu = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		restu.sendKeys("Mtr");
		restu.click();

	}

}
