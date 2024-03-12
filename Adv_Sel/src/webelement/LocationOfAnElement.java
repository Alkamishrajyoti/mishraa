package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfAnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point p = driver.findElement(By.id("email")).getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println("the x coordinate is :"+x);
		System.out.println("the y cocordinate is:"+y);

	}

}
