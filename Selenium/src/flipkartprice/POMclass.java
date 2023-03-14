package flipkartprice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass
{
	@FindBy(xpath="//button[text()='✕']")
	private WebElement cancel;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;

	@FindBy(xpath="//span[text()='Price']/../../following-sibling::div[3]/div[1]/select")
	private WebElement select;
	
	@FindBy(xpath="//div[text()='Availability'][1]") 
	private WebElement scroll;
	
	@FindBy(xpath="//div[text()='Customer Ratings']/../following-sibling::div/div/div[1]/div/label/div[1]")
	private WebElement rating;
	
	@FindBy(xpath="//div[text()='MarQ by Flipkart 9 kg 5 Star Semi Automatic Top Load White, Grey']/../following-sibling::div/div[1]/div[1]/div")
	private WebElement price;
	
	@FindBy(xpath="//div[text()='MarQ by Flipkart 9 kg 5 Star Semi Automatic Top Load White, Grey']")
	private WebElement itemclick;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement checkcart;
	

public POMclass(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement cancel()
{
	return cancel;
}

public WebElement searchfield()
{
	return searchfield;
}

public WebElement searchbutton()
{
	return searchbutton;
}

public WebElement select()
{
	return select;
}

public WebElement scroll()
{
	return scroll;
}

public WebElement rating()
{
	return rating;
}

public WebElement price()
{
	return price;
}

public WebElement itemclick()
{
	return itemclick;
}

public WebElement addtocart()
{
	return addtocart;
}

public WebElement checkcart()
{
	return checkcart;
}

}
