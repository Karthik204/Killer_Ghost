package pom2;

import org.testng.annotations.DataProvider;

public class Dataproviderclass 
{
	@DataProvider(name="data")
	public String[][] senddata()
	{
		String arr[][]= {{"k","a","r","t","h"},{"r","e","d","d","y"}};
		return arr;
	}

}
