package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
public	WebDriver driver;
@Parameters("browser")	
@BeforeMethod
	
	public void openapp(String brower)
	{
		if(brower.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gorilla.com");
		}
		
		else if (brower.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.gorilla.com");				
		}
	}
		@Test
		public void print()
		{
			System.out.println("hi");
			
		}
		@AfterMethod
		public void closeapp()
		{
			driver.quit();
	}

}
