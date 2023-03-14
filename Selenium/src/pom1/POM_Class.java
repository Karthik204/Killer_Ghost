package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class 
{
   @FindBy(id="email")
   private WebElement username;
   
   @FindBy(xpath="//button[text()='Log in']")
   private WebElement login;
   
   public POM_Class(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void username(String un)
   {
	   username.sendKeys(un);
   }
   public void lgin()
   {
	   login.click();
   }
}
