package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfile1 {
	@Test
	public void getdata() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("./Propertyfile1/file1.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String user = prop.getProperty("un");
		String pass = prop.getProperty("pwd");
		
		 String ur = prop.getProperty("url");
		driver.get(ur);
		
		
	}

}
