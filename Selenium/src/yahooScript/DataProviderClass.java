package yahooScript;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="credentials")
	public static String[][] cred()
	{
		String[][] arr= {{"manu3759@yahoo.com","manju@3759","manjumanu0806@yahoo.com","Dummy report","Hi this is karthik",}};
		return arr;
	}
	

}
