package testNG;

import org.testng.annotations.DataProvider;

public class CustomDataProv {
	
	@DataProvider(name="login credential")
	public Object[][] getData()
	{
		Object[][]data= {{"santhosh@gmail.com","123"},{"pradeep@gmail.com","565"},{"rahul@gmail.com","789"}};
		return data;
	}
			

}
