package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/SingleSelect.html");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("menu"));
		Select s=new Select(dd);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("dd is multiselect");
		}
		else
		{
			System.out.println("dd is single select");
		}
		driver.quit();

	}

}
