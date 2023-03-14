package flipkart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass
{
	@FindBy(xpath="//button[text()='✕']")
	private WebElement cancel;
	
    @FindBy(xpath="//div[text()='Fashion']")
    private WebElement fashion;
    
    @FindBy(xpath="//a[text()='Bags, Suitcases & Luggage']")
    private WebElement luggage;
    
    @FindBy(xpath="//div[text()='Gender']")
    private WebElement gender;
    
    @FindBy(xpath="//div[text()='Men']/preceding-sibling::div[1]")
    private WebElement malecheck;
    
    @FindBy(xpath="//span[text()='Price']/../../following-sibling::div[3]/div[1]/select")
    private WebElement pricedrop;
    
    @FindBy(xpath="//div[text()='Brand']")
    private WebElement scroll1;
    
    @FindBy(xpath="//div[text()='Brand']/../following-sibling::div[1]/div[2]/span")
    private WebElement seemore;
    
    @FindBy(xpath="//div[text()='SKYBAGS']") //preceding-sibling::div")
    private WebElement skybags;
    
    @FindBy(xpath="//span[text()='Apply Filters']")
    private WebElement applyfilter;
    
    @FindBy(xpath="//h1[text()='Bags And Luggage']/../../../following-sibling::div[4]")
    private WebElement scroll2;
    
    @FindBy(xpath="//h1[text()='Bags And Luggage']/../../../following-sibling::div[5]/div/div[3]/div/a[3]/div[1]/div[1]")
    private WebElement fetchprice;
    
    @FindBy(xpath="//h1[text()='Bags And Luggage']/../../../following-sibling::div[5]/div/div[3]/div/a[2]")
    private WebElement clickbag;
    
    @FindBy(xpath="//button[text()='Add to cart']")
    private WebElement addcartbtn;
    
    @FindBy(xpath="//span[text()='Cart']")
    private WebElement cartlink;

    
    public POMclass(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
     
    
    public WebElement cancel()
    {
    	return cancel;
    }

    public WebElement fashion()
    {
    	return fashion;
    }
    
    public WebElement luggage()
    {
    	return luggage;
    }

    public WebElement gender()
    {
    	return gender;
    }

    public WebElement malecheck()
    {
    	return malecheck;
    }

    public WebElement pricedrop()
    {
    	return pricedrop;
    }

    public WebElement scroll1()
    {
    	return scroll1;
    }
    
    public WebElement seemore()
    {
    	return seemore;
    }

    public WebElement skybags()
    {
    	return skybags;
    }

    public WebElement applyfilter()
    {
    	return applyfilter;
    }

    public WebElement scroll2()
    {
    	return scroll2;
    }
    
    public WebElement fetchprice()
    {
    	return fetchprice;
    }

    public WebElement clickbag()
    {
    	return clickbag;
    }

    public WebElement addcartbtn()
    {
    	return addcartbtn;
    }
    
    public WebElement cartlink()
    {
    	return cartlink;
    }
       
}
