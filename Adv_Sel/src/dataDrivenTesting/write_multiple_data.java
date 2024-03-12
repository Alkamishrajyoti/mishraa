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
//import org.w3c.dom.stylesheets.LinkStyle;

public class write_multiple_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./Excel/seleniumTestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.createSheet("amazon");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count=link.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement links = link.get(i);
			String att=links.getAttribute("href");
			Row r=sh.createRow(i);
			Cell cel=r.createCell(0);
			cel.setCellValue(att);
			
		}
		FileOutputStream fout=new FileOutputStream("./Excel/seleniumTestData.xlsx");
		book.write(fout);
		

	}

}
