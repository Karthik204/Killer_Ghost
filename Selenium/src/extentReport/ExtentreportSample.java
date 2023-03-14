package extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportSample 
{
	private static final String Screenshot = null;
	public WebDriver driver;
	@Test
	public void exreport()
	{
		ExtentHtmlReporter rep=new ExtentHtmlReporter("./Extent report/report.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(rep);
		ExtentTest test = reports.createTest("Extent Report");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		test.log(Status.INFO,"Browser is launched");
		driver.get("https://www.swiggy.com");
		test.log(Status.INFO,"Application is launched");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9844945804");
		test.log(Status.INFO,"Number is entered");
		
		String title=driver.getTitle();
		if(title.equals("twiggy"))
		{
			test.log(Status.PASS,"Homepage is displayed");
		}
		else
		{
			test.log(Status.FAIL,"Homepage is not displayed");
			try {
				test.addScreenCaptureFromPath(Screenshot());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		reports.flush();
		driver.quit();
	}
	public String Screenshot()
	{
	String path="./Screenshot/swiggy.jpeg";
	TakesScreenshot ss=(TakesScreenshot)driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File dst = new File(path);
	try {
		FileHandler.copy(src, dst);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return "."+path;
	
	}
	

}
