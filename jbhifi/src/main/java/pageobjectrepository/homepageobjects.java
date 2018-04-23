package pageobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects {
	
	WebDriver driver;
	
	public homepageobjects(WebDriver driver)
	{
		this.driver=driver;
		
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(css="span.bp.bp2.bp3.bp4")
	WebElement headertext;
	
	@FindBy(className="account")
	WebElement myaccount;
	
	@FindBy(css="img[height='122']")
	WebElement imageelement;

	public WebElement headertext()
	{
		return headertext;
	}
	
	public WebElement myaccount()
	{
		return myaccount;
	}
	
public WebElement imageelement()
{
	return imageelement;
}

	
	
}
