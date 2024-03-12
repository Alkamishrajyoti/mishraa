package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionsOnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		Thread.sleep(1000);
		WebElement mha = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Actions act=new Actions(driver);
		act.moveToElement(mha).perform();
		driver.quit();
		

	}

}
