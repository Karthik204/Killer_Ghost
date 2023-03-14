package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass {
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
	
	@FindBy(xpath="//input[@value='M']")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement FirstName;
	
	@FindBy(id="LastName")
	private WebElement LastName;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
	

public POMclass(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void register()
{
	register.click();
}
public void gender()
{
	gender.click();
}
public void FirstName(String fn)
{
	FirstName.sendKeys(fn);
}
public void LastName(String ln)
{
	LastName.sendKeys(ln);
}
public void email(String em)
{
	Email.sendKeys(em);
}
public void password(String pd)
{
	Password.sendKeys(pd);
}
public void confirmpassword(String cpd)
{
	ConfirmPassword.sendKeys(cpd);
}
public void registerbutton()
{
	registerbutton.click();
}
}









