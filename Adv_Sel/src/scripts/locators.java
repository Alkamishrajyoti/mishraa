package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators { 
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(5000);
driver.get("file:///D:/HTML%20NOTES/demo3.html");
driver.findElement(By.id("face")).click();



}


}
