package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoappsQspiders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(100,250)");
			Thread.sleep(3000);
		}
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(100,-250)");
			Thread.sleep(3000);

	}
		driver.quit();

}
}
