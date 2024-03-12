package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Enter_data_into_file {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/seleniumTestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh= book.createSheet("Sheet2");
		Row r=sh.createRow(0);
		Cell cel=r.createCell(0);
		cel.setCellValue("alka");
		FileOutputStream fout=new FileOutputStream("./Excel/seleniumTestData.xlsx");
		book.write(fout);
	}

}







