package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/single%20select%20dropdownn.html");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("menu"));
		Select sel=new Select(dd);
		List<WebElement> opts = sel.getOptions();
		int count = opts.size();
		System.out.println(count);
		for(WebElement opt:opts)
		{
			String txt = opt.getText();
			System.out.println(txt);
		}
		

	}

}
