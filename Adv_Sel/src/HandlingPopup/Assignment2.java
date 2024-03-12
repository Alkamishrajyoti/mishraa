package HandlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Robot r=new Robot();
		for(int i=0;i<4;i++)
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
		 driver.switchTo().window(f_id);
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(1000);
		 String s_id = arr_id.get(1);
		 String t_id = arr_id.get(2);
		 String fo_id = arr_id.get(3);
		 String fv_id=arr_id.get(4);
		 driver.switchTo().window(fv_id);
		 driver.get("https://www.selenium.dev/support/");
		 Thread.sleep(1000);
		 

	}

}
