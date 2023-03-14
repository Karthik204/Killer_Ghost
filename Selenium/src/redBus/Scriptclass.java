package redBus;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scriptclass extends Baseclass 
{
	@Test(dataProvider = "data",dataProviderClass = Dataproviderclass.class)
	public  void viewcount(String a,String b)
	{
		POMclass pom=new POMclass(driver);
		pom.from().sendKeys(a);
		pom.fromplace().click();
		pom.to().sendKeys(b);
		pom.toplace().click();
		pom.dateclick().click();
		pom.dateselect().click();
		pom.bussearch().click();
		String text = pom.seatadd().getText();
		System.out.println(text);
	}

}
