package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectTheOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/multi%20select%20dropdownn.html");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("menu"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("d");
		Thread.sleep(1000);
		s.selectByVisibleText("IDLY");
		Thread.sleep(1000);
		s.deselectByIndex(1);
		Thread.sleep(1000);
		s.deselectByValue("d");
		Thread.sleep(1000);
		s.deselectByVisibleText("IDLY");
		Thread.sleep(1000);
		s.deselectAll();
		Thread.sleep(1000);

	}

}
