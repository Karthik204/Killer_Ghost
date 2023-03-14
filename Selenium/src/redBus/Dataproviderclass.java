package redBus;

import org.testng.annotations.DataProvider;

public class Dataproviderclass 
{
	@DataProvider(name="data")
	public String[][] data()
	{
		String[][]arr= {{"Bangalore Airport","Hinkal, Mysore"}};
		return arr;
	}

}
