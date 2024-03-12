package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//*[local-name()='svg' and @stroke='currentColor'])[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();

	}

}
