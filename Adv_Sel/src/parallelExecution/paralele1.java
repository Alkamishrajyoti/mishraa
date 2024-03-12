package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralele1 {
	public WebDriver driver;
 @Parameters({"browser"})
	@Test
	public void data(String browser)
	{
	 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     if(browser.equals("firefox"))
     {
    	 driver=new  FirefoxDriver();
    	 driver.get("https://www.facebook.com");
     }
     else
     {
    	 driver=new  ChromeDriver();
    	 driver.get("https://www.instagram.com");
     }
	}
     
	

}
