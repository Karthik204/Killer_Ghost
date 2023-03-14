package redBus;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POMclass 
{
	@FindBy(id="src")
	private WebElement from;
	
	@FindBy(xpath="//li[text()='Bangalore Airport, Bangalore']")
	private WebElement fromplace;
	
	@FindBy(id="dest")
	private WebElement to;
	
	@FindBy(xpath="//li[text()='Hinkal, Mysore']")
	private WebElement toplace;
	
	@FindBy(xpath="//label[text()='Date']")
	private WebElement dateclick;
	
	@FindBy(xpath="//td[text()='Mar 2023']/../following-sibling::tr[4]/td[4]")
	private WebElement dateselect;
	
	@FindBy(xpath="//button[text()='Search Buses']")
	private WebElement bussearch;
	
	@FindBy( xpath="//div[text()='View Seats']")
	private WebElement seatadd;
		


public  POMclass(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement from()
{
	return from;
}

public WebElement fromplace()
{
	return fromplace;
}

public WebElement to()
{
	return to;
}

public WebElement toplace()
{
	return toplace;
}

public WebElement dateclick()
{
	return dateclick;
}

public WebElement dateselect()
{
	return dateselect;
}

public WebElement bussearch()
{
	return bussearch;
}

public WebElement seatadd()
{
	return seatadd;
}


}

