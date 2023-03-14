package pom2;

import org.testng.annotations.Test;

public class Scriptclass extends Baseclass
{
	@Test(dataProvider ="data",dataProviderClass = Dataproviderclass.class)
	public static void register(String a,String b,String c,String d,String e) throws InterruptedException
	{
		POMclass pom=new POMclass(driver);
		Thread.sleep(2000);
		pom.register();
		Thread.sleep(1000);
		pom.gender();
		Thread.sleep(1000);
		pom.FirstName(a);
		Thread.sleep(1000);
		pom.LastName(b);
		Thread.sleep(1000);
		pom.email(c);
		Thread.sleep(1000);
		pom.password(d);
		Thread.sleep(1000);
		pom.confirmpassword(e);
		Thread.sleep(1000);
		pom.registerbutton();
			
	}

}
