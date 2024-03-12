package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Capture_screenshot_of_element{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("email"));
		Generic_Script_Element_phot.get_photo_element(ele, "elel");
		WebElement pass= driver.findElement(By.id("pass"));
		Generic_Script_Element_phot.get_photo_element(pass, "password");
	}
}