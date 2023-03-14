package listeners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Example1.class)
public class ExamResults 
{
	@Test(priority = 1)
	public void Ram()
	{
		Assert.fail();
		System.out.println("Ram got placed");
		
	}
	
	@Test(dependsOnMethods = "Ram",priority = 2)
	public void Manju()
	{
		System.out.println("Manju has got 25lacs package");
		
	}
	
	@Test(priority = 3)
	public void Rahul()
	{
		System.out.println("Rahul fell in Love");
	}
	
	@Test(priority = 4)
	public void Karthik()
	{
		System.out.println("getting trained");
	}

}
