package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_css {
public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver","./softare/chromedriver.exe");
WebDriver  driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/");
Thread.sleep(3000);
WebElement ele = driver.findElement(By.cssSelector("input[id='user']"));
ele.sendKeys("selenium");
Thread.sleep(2000);
ele.clear();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[href='https://www.facebook.com']")).click();
}
}