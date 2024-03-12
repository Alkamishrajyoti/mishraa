package propertyfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_property 
{
	@Test
	public void Fetch_property() throws FileNotFoundException, IOException
	{
		Properties p= new Properties();
		p.load(new FileInputStream("./file.properties"));
		String val=p.getProperty("path");
		System.out.println(val);
	}

}
