package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppsDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).sendKeys("9876543215");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("select2"));
		Thread.sleep(2000);
		Select sel=new Select(gender);
		sel.selectByValue("Female");
		Thread.sleep(2000);
		
		
		WebElement country = driver.findElement(By.id("select3"));
		Thread.sleep(2000);
		Select sel1=new Select(country);
		sel1.selectByValue("India");
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("select5"));
		
		Select sel12=new Select(state);
		state.sendKeys("karnataka");
		
		WebElement city = driver.findElement(By.id("optionCity"));
		
		Select sel13=new Select(city);
		city.sendKeys("Bangalore");
		
		WebElement Quantity = driver.findElement(By.id("select7"));
		Select sel14=new Select(Quantity);
		sel14.selectByValue("4");
		
		
		
		
				
		
		

	}

}
