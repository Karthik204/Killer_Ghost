package pom3;

import java.io.IOException;

import org.testng.annotations.Test;

public class ScriptClass extends Baseclass
{
	@Test(dataProvider = "data",dataProviderClass = Dataproviderclass.class)
	public static void Script(String he,String we,String him,String her,String his) throws IOException, InterruptedException
	{
		POMClass pom=new POMClass(driver);
		pom.username(he);
		pom.usernamesubmit();
		//Thread.sleep(50000);
		pom.password(we);
		pom.passwordsubmit();
		pom.mailbutton();
		pom.composebtn();
		pom.mailid(him);
		pom.subject(her);
		pom.body(his);
		pom.attatchfiles();
		pom.attatchcomp();
		Runtime.getRuntime().exec("‪C:\\Users\\USER\\Desktop\\file4.exe");
		pom.sendmes();
		
	}

}
