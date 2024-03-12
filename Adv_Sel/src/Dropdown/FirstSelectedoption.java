package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedoption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/single%20select%20dropdownn.html");
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("menu"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("d");
		Thread.sleep(1000);
		s.selectByVisibleText("IDLY");
		Thread.sleep(1000);
		WebElement first_opt = s.getFirstSelectedOption();
		String ftxt = first_opt.getText();
		System.out.println(ftxt);

	}

}
