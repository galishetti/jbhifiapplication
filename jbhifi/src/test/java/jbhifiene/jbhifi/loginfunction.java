package jbhifiene.jbhifi;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageobjectrepository.homepageobjects;
import pageobjectrepository.loginpage;

public class loginfunction extends base{
	
	public static Logger log = LogManager.getLogger(loginfunction.class.getName());
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
		log.debug("succefully closed browser");
	}
	
	
	@Test(dataProvider="getdata")
	public void loginfunctione2e(String userid, String pass) throws IOException  {
		
		driver= invokebrowser();
		log.debug("succesfully invoked browser");
		driver.get(prop.getProperty("URL"));
		log.debug("succesfully landed on homepage");
		homepageobjects hm= new homepageobjects(driver);
		hm.myaccount().click();
		
		loginpage lg=new loginpage(driver);
		
		lg.userid().sendKeys(userid);
		lg.password().sendKeys(pass);
		lg.loginbutton().click();
		log.error("failed to login");
		
	}
		
	
	@DataProvider
		public Object[][]  getdata()
		
		
		{
			Object[][] data=new Object[2][2];
		data[0][0]= "absdfnj@gmail.com";
		data[0][1]= "kfvnfknr";
		
		data[1][0]= "jnjnv@gmail.com";
		data[1][1]= "vehbvirbv";
		
		return data;
		
		}
		
		
		
	
	
	
	

}
