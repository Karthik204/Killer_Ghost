package flipkart2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Example1.class)
public class Scriptclass extends Baseclass 
{
     @Test(dataProvider = "data",dataProviderClass = Dataproviderclass.class)
public static void flipkart(String a) throws InterruptedException
{
    POMclass pom=new POMclass(driver);
    pom.cancel().click();
    Thread.sleep(2000);
    Actions act=new Actions(driver);
    act.moveToElement(pom.fashion()).perform();
    Thread.sleep(2000);
    pom.luggage().click();
    Thread.sleep(4000);
    pom.gender().click();
    pom.malecheck().click();
    Thread.sleep(2000);
    Select sel=new Select(pom.pricedrop());
    sel.selectByValue(a);
    Point loc = pom.scroll1().getLocation();
    int x = loc.getX();
    int y=loc.getY();
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    Thread.sleep(5000);
    jse.executeScript("window.scrollBy("+x+","+y+")");
    Thread.sleep(5000);
    pom.seemore().click();
    Thread.sleep(5000);
    //pom.skybags().click();
    Thread.sleep(5000);
    pom.applyfilter().click();
    Thread.sleep(5000);
    Point loc2 = pom.scroll2().getLocation();
    x=loc2.getX();
    y=loc2.getY();
    jse.executeScript("window.scrollBy("+x+","+y+")");
    System.out.println(pom.fetchprice().getText());
    Thread.sleep(5000);
    pom.clickbag().click();
    String pid = driver.getWindowHandle();
    Set<String> handles = driver.getWindowHandles();
    handles.remove(pid);
    for(String handle:handles)
    {
    driver.switchTo().window(handle);  
    }
    Thread.sleep(5000);
    pom.addcartbtn().click();
    TakesScreenshot ss=(TakesScreenshot)driver;
    File src = ss.getScreenshotAs(OutputType.FILE);
    File dst = new File("./Screenshot/ .jpeg");
    try {
		FileHandler.copy(src, dst);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Thread.sleep(5000);
    pom.cartlink().click();
    Thread.sleep(5000);
    driver.switchTo().window(pid);
    for(int i=1;i<=4;i++)
    {
    driver.navigate().back();
    Thread.sleep(3000);
    }
    
}
}
