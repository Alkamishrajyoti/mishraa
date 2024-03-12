package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Capture_screenshot_of_element1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https:www.facebook.com");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("email"));
		File tmp=ele.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./element_photo/un_txt.jpg");
		FileHandler.copy(tmp,pmt);
	}

}
