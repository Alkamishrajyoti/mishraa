package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_fetch_data {
	public static String get_data(String file_path,String sheetname,int ro,int c)
	{
		FileInputStream fis;
		
		Workbook book=null;
		try
		{
			fis=new FileInputStream(file_path);
			book=WorkbookFactory.create(fis);
		}
		catch(IOException e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}
		Sheet sh=book.getSheet(sheetname);
		Row r=sh.getRow(ro);
		Cell cel=r.getCell(c);
		String value=cel.toString();
		return value;
}
}
