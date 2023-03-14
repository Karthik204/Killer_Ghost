package pom2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass 
{
	public static  WebDriver driver;
	//@parameter("browser")
	@BeforeMethod
	public  void Openapp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
	}
	@AfterMethod
	public  void closeapp()
		{
			driver.quit();
		}
	
     
}


