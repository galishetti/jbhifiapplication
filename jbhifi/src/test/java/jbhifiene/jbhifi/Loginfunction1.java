package jbhifiene.jbhifi;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageobjectrepository.homepageobjects;
import pageobjectrepository.loginpage;


public class Loginfunction1 extends base {
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
		
	}
	
	
	
	@Test(dataProvider="getdata")
	public void login(String user, String pass) throws IOException
	
	{
	driver= invokebrowser();
	
	driver.get(prop.getProperty("URL"));
	
	homepageobjects  hg = new  homepageobjects(driver);
	
	hg.myaccount().click();
	loginpage lp = new loginpage(driver);
	
	lp.userid().sendKeys(user);
	lp.password().sendKeys(pass);
	lp.loginbutton().click();
	
	
	
	
	}
	
	@DataProvider 
	public Object[][] getdata() 
	{
		Object[][]  data= new Object[2][2];
		
		data[0][0]  = "abchddkfv";
		data[0][1]  = "sfnonowv";
		
		data[1][0]  = "knfeonfekne";
		data[1][1]  = "fbijbvjefj";
		
		return data;
		
				
				
		
		
		
	}
	
	
	

}
