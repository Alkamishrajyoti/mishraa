package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_fetch_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fis=new FileInputStream("./Excel/seleniumTestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("amazon");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
		Row r1=sh.getRow(1);
		Cell cel=r1.getCell(0);
		String value=cel.toString();
		System.out.println(value);
//		int r=sh.getLastRowNum();
//		for(int i=0;i<r;i++)
//		{
			
//			Thread.sleep(1000);
//		}
//	}

}
}