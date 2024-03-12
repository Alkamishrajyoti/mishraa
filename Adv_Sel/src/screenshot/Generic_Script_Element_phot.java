package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Script_Element_phot {
	public static void get_photo_element(WebElement ele,String txt)
	{
		File tmp=ele.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./element_photo/"+txt+".jpg");
		try
		{
			FileHandler.copy(tmp, pmt);
		}
		catch(IOException e)
		{
			System.out.println("fele not found");
			e.printStackTrace();
		}
	}
	

}
