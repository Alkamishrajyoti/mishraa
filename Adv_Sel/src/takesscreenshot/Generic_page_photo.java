package takesscreenshot;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_page_photo {
	public static void get_photo(WebDriver driver)
	{
		Date d=new Date();
		String da = d.toString();
		String dat = da.replaceAll(":","-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File tmp = tss.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./photo/"+dat+".jpg");
		try {
			FileHandler.copy(tmp, pmt);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Photo not captured");
		}
	}

}
