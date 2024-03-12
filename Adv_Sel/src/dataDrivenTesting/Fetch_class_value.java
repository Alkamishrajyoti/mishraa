package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_class_value {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("./Excel/seleniumTestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.createSheet("flipkart");
		
		

		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 int count=links.size();
		 
		 for(int i=0;i<count;i++)
		 {
			 Row r=sh.createRow(i);
			 Cell cel=r.createCell(0);
			 WebElement link = links.get(i);
			 String txt=link.getText();
			 cel.setCellValue(txt);
		 }
		 FileOutputStream fout=new FileOutputStream("./Excel/seleniumTestData.xlsx");
		 book.write(fout);

	}

}
