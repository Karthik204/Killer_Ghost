package flipkart2;

import org.testng.annotations.DataProvider;

public class Dataproviderclass {
	@DataProvider(name="data")
	public String[][] senddata()
	{
		String arr[][]= {{"1000"}};
		return arr;
	}

}
