package pageobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="txtLoginPanelEmail")
	WebElement userid;
	
	@FindBy(id="txtLoginPanelPassword")
	WebElement password;
	
	
	@FindBy(css="input[value='Login']")
	WebElement loginbutton;
	
	
	public WebElement userid()
	{
		return userid;
	}
	
	public WebElement  password()
	{
		return  password;
	}
	
	public WebElement loginbutton()
	{
		return loginbutton;
	}
	
	
}
