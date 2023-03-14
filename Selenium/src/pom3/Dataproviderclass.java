package pom3;

import org.testng.annotations.DataProvider;

public class Dataproviderclass 
{
	@DataProvider(name="data")
	public static String[][] data()
	{
		String arr[][]= {{"manu3759@yahoo.com","manju@3759","manjumanu0806@yahoo.com","d","e"}};
		return arr;
	}

}
