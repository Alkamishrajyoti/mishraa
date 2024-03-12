package dataDrivenTesting;

public class Fetch_data_from_generic {

	public static void main(String[] args) {
		String val = Generic_fetch_data.get_data("./Excel/seleniumTestData.xlsx", "flipkart", 3, 0);
		System.out.println(val);
		
		String val1 = Generic_fetch_data.get_data("./Excel/seleniumTestData.xlsx", "flipkart", 11, 0);
	System.out.println(val1);
	
	}

}
