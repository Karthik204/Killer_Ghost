package pom1;

import org.testng.annotations.Test;

public class Script_class extends Baseclass
{
		@Test(dataProvider = "data",dataProviderClass = Dataproviderclass.class)
		public static void Page(String a,String b)
		{
			POM_Class pmc=new POM_Class(driver);
			pmc.username(a);
			driver.navigate().refresh();
			pmc.username(b);
			pmc.lgin();
		}

}
