package testNG_basicframework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ScirptClass extends BaseClass
{
@Test(dataProvider ="Credentials",dataProviderClass = DataProviderClass.class)

	public static void register(String First,String Last,String mail,String pass)
	{
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("//input[@value='M']")).click();
	driver.findElement(By.id("FirstName")).sendKeys(First);
	driver.findElement(By.id("LastName")).sendKeys(Last);
	driver.findElement(By.id("Email")).sendKeys(mail);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
	driver.findElement(By.id("register-button")).click();
	}
}
