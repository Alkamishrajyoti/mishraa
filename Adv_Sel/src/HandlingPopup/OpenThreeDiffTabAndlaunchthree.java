package HandlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenThreeDiffTabAndlaunchthree {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Robot r=new Robot();
		for(int i=1;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> arr_id = new ArrayList<String>(all_id);
		 String f_id = arr_id.get(0);
		 String s_id = arr_id.get(1);
		 String t_id = arr_id.get(2);
		 driver.switchTo().window(f_id);
		 driver.get("https://www.facebook.com");
		 driver.switchTo().window(s_id);
		 Thread.sleep(1000);
		 driver.get("https://www.amazon.com");
		 driver.switchTo().window(t_id);
		 Thread.sleep(1000);
		 driver.get("https://www.flipkart.com");
		 Thread.sleep(1000);
	}

}
