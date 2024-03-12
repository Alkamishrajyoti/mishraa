package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentFaceebooklink {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	Point location = facebook.getLocation();
	Thread.sleep(3000);
	int x=location.getX();
	int y=location.getY();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(1000);
	facebook.click();

}
}
