package takesscreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Generic_page_photo.get_photo(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Generic_page_photo.get_photo(driver);

	}

}
