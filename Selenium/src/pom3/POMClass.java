package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass 
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(id="login-signin")
	private WebElement ussub;
	
	@FindBy(id="login-passwd")
	private WebElement pass;
	
	@FindBy(id="login-signin")
	private WebElement passub;
	
	@FindBy(xpath="//a[@id='ybarMailLink']")
	private WebElement mail;
	
	@FindBy(xpath="//a[text()='Compose']")
	private WebElement compose;
	
	@FindBy(xpath="//input[@id='message-to-field']")
	private WebElement mailid;
	
	@FindBy(xpath="//input[@data-test-id='compose-subject']")
	private WebElement subject;
	
	@FindBy(xpath="//div[@aria-label='Message body']")
	private WebElement body;
	
	@FindBy(xpath="//button[@aria-label='Attach files']")
	private WebElement attatch;
	
	@FindBy(xpath="//li[@title='Attach files from computer']")
	private WebElement atcom;
	
	@FindBy(xpath="//span[text()='Send']")
	private WebElement send;
	
public POMClass(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void username(String un)
{
	username.sendKeys(un);
}

public void usernamesubmit()
{
	ussub.click();
}

public void password(String pwd)
{
	pass.sendKeys(pwd);
}

public void passwordsubmit()
{
	passub.click();
}

public void mailbutton()
{
	mail.click();
}

public void composebtn()
{
	compose.click();
}

public void mailid(String ml)
{
	mailid.sendKeys(ml);
}

public void subject(String sub)
{
	subject.sendKeys(sub);
}

public void body(String bd)
{
	body.sendKeys(bd);
}

public void attatchfiles()
{
	attatch.click();
}
public void attatchcomp()
{
	atcom.click();
}

public void sendmes()
{
	send.click();
}
}