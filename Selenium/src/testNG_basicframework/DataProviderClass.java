package testNG_basicframework;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="Credentials")
	public static String[][] Getdata() 
	{
		String[][] arr= {{"Karthik","Reddy","rkarthik@gmail.com","karthil123",}};
		return arr;
	}
	

}
