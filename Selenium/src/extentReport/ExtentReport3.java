package extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport3 
{
	public WebDriver driver;
	@Test
	public void report()
	{
		//Extentreport configuration
	ExtentHtmlReporter rep=new ExtentHtmlReporter("./Extent report/report.html");
	ExtentReports reporter=new ExtentReports();
	reporter.attachReporter(rep);
	ExtentTest test = reporter.createTest("Extent Test");
	
	//loging report
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	driver=new ChromeDriver();	
	test.log(Status.INFO,"browser has been launched");
	driver.get("https://www.yahoo.com");
	test.log(Status.INFO,"website has been launched");
	
	//condition
	String title = driver.getTitle();
	if(title.equalsIgnoreCase("facebook"))
	{
		test.log(Status.PASS,"website is correct");
	}
	
	else
	{
		test.log(Status.FAIL,"websites are not matching");
		try {
			test.addScreenCaptureFromPath(Screenshot());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	reporter.flush();
	}
	public String Screenshot()
	{
	String path="./Screenshot/2.jpeg";
	TakesScreenshot ss=(TakesScreenshot)driver;
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
	
	

