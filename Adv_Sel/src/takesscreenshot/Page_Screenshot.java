
package takesscreenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		TakesScreenshot tss= (TakesScreenshot)driver;
		File tmp = tss.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./photo/defect.jpg");
		
		
	}

}
