package testNG;

import org.testng.annotations.Test;

public class DataPovExample {
	@Test(dataProvider="login credential",
	dataProviderClass=CustomDataProv.class)
	public void loginTest(String un,String pwd)
	{
		System.out.println(un+" "+pwd);
	}
			
	
}
