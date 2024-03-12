package HandlingPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("789962");
		driver.findElement(By.name("submit")).submit();
		Alert alt=driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		alt.accept();
		//alt.dismiss();

	}

}
