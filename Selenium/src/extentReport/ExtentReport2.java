package extentReport;

import java.io.File;
import java.io.IOException;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport2
{
	public WebDriver driver;
	@Test
	public void exreport()
	{
		//Configuration of Extentreport
		ExtentHtmlReporter rep=new ExtentHtmlReporter("./Extent report/report.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(rep);
		ExtentTest test = reports.createTest("Extent Test");
		
		//repporting and printing the status
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"Browser has been launched");
		driver.get("https://www.facebook.com");
		test.log(Status.INFO,"Application has been launched");
		
		String title = driver.getTitle();
		if(title.equals("whatsapp"))
		{
			test.log(Status.PASS,"browser got launched");
		}
		
		//adding screenshot
		else
		{
			test.log(Status.FAIL,"Failed to launch website");
			try {
				test.addScreenCaptureFromPath(Screenshot());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	reports.flush();	
	}
		
		//taking screenshot
		public String Screenshot()
		{
			String path = "./Screenshot/1.jpeg";
			TakesScreenshot ss=(TakesScreenshot) driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			File dst = new File(path);
			try {
				FileHandler.copy(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "."+path;
			
		}
		
}
