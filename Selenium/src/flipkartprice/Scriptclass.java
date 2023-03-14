package flipkartprice;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scriptclass extends Baseclass
{
	@Test(dataProvider = "data",dataProviderClass = Dataproviderclass.class)
	public static void addcart(String a,String b) throws InterruptedException
	{
		POMclass pom=new POMclass(driver);
		pom.cancel().click();
		Thread.sleep(2000);
		pom.searchfield().sendKeys(a);
		Thread.sleep(2000);
		pom.searchbutton().click();
		Thread.sleep(2000);
		Select sel=new Select(pom.select());
		Thread.sleep(1000);
		sel.selectByValue(b);
		Thread.sleep(5000);
		Point loc = pom.scroll().getLocation();
		Thread.sleep(1000);
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(1000);
		pom.rating().click();
		String pr = pom.price().getText();
		System.out.println(pr);
		Thread.sleep(5000);
		pom.itemclick().click();
		Thread.sleep(5000);
		String p_id = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		handles.remove(p_id);
		for(String handle:handles)
		{
		driver.switchTo().window(handle);
		}
		pom.addtocart().click();
		pom.checkcart().click();
	}
		
	

}
