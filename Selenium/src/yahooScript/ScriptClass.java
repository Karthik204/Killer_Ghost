package yahooScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

public class ScriptClass extends BaseClass {
	@Test(dataProvider ="credentials",dataProviderClass = DataProviderClass.class)
	public static void Sendmes(String email,String pass,String tomail,String Subject,String Body) throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys(pass);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys(tomail);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys(Subject);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys(Body);
		driver.findElement(By.xpath("//button[@aria-label='Attach files']")).click();
		driver.findElement(By.xpath("//li[@title='Attach files from computer']")).click();
		Robot r= new Robot();
//		for(int i=1;i<=7;i++)
//		{
//		r.keyPress(KeyEvent.vk)	
//		}
	}
	

}
