package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void printTestData(String username, String password, int id){
		System.out.println("Username : "+ username);
		System.out.println("Password : "+ password);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[4][3];
		
		data[0][0] = "Saurabh";
		data[0][1] = "Pro@124";
		data[0][2] = 583465;
		
		data[1][0] = "Gaurav";
		data[1][1] = "XYZ@123";
		data[1][2] = 5465;
		
		data[2][0] = "Saurabh";
		data[2][1] = "uxv@123";
		data[2][2] = 577465;
		
		data[3][2] = 547765;
		data[3][0] = "Saurabh";
		data[3][1] = "sdhf@123";
		
		return data;
	}

}
