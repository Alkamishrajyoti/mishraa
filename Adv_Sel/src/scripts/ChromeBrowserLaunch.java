package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserLaunch {
	
	public static void chrome()
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.youtube.com");
		
	}
	public static void firefox()
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
	}

	public static void main(String[] args) {
		chrome();
		firefox();
	}

}
