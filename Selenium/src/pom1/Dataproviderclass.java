package pom1;

import org.testng.annotations.DataProvider;

public class Dataproviderclass {
	@DataProvider(name="data")
	public static String[][] Getdata()
	{
		String arr[][]= {{"hi","bye"},{"chinnu","minnu"}};
		return arr;
		
	}

}
