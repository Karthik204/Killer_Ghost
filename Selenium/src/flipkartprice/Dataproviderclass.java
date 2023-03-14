package flipkartprice;

import org.testng.annotations.DataProvider;

public class Dataproviderclass 
{
	@DataProvider(name="data")
	public static String[][] senddata()
	{
		String arr[][]= {{"MarQ by Flipkart 6.5 kg with Semi Automatic Top Load Grey, White","10000"}};
		return arr;
	}

}
