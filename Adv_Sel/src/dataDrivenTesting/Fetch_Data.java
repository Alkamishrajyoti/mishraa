package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Fetch_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		FileInputStream fis=new FileInputStream("./Excel/seleniumTestData.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell cel=r.getCell(0);
		//double value=cel.getNumericCellValue();
		//System.out.println(value);
		//String value=cel.getStringCellValue();
		//System.out.println(value);
		String value=cel.toString();
		System.out.println(value);
		
	}

}
