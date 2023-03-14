package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 {
	
	@Test(priority = 1,enabled = true,invocationCount = 2)
	public void Born()
	{
		Reporter.log("Borned on 12/12/95", true);
		Assert.fail();
	}
	@Test(priority = 2,invocationCount = 3,dependsOnMethods = "Born")
	public void Grown()
	{
		Reporter.log("Brought up in Bagepalli", true);
	}
	@Test(priority = 3,invocationCount = 4)
	public void Job()
	{
		Reporter.log("Got job in banglore",true);
	}
	@Test(priority = 5,invocationCount = 5)
	public void Working()
	{
		Reporter.log("working in banglore",true);
	}
	

}
