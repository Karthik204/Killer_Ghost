package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel_execution {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void openapp(String brow )
	{
		
		if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		}
		
		else if(brow.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		}	
	}	
	
	@Test
	public void openapp10()
	{
		System.out.println("parallel execution");
	}
		@AfterMethod
		public void closeapp()
		{
			driver.quit();
	}

}
