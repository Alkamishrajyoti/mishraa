package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextAllselectOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/single%20select%20dropdownn.html");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("menu"));
		Select s=new Select(dd);
		s.selectByValue("d");
		s.selectByVisibleText("IDLY");
		List<WebElement> all_opts = s.getAllSelectedOptions();
		for(WebElement all_txt:all_opts)
		{
			String txt = all_txt.getText();
			System.out.println(txt);
		}
	}

}
