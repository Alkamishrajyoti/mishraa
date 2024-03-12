package autoitscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadAssignment {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Autoit/fileupload.html");
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Autoit\\fileuploads.exe");
	}

}
