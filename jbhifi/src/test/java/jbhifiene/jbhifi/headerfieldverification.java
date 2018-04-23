package jbhifiene.jbhifi;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resources.base;
import pageobjectrepository.homepageobjects;




public class headerfieldverification extends base {
	
	@AfterMethod
	public void closebrowser() {
		
		driver.close();
	}	
	
	@Test
	public void headerfieldverification1() throws IOException
	{
		driver= invokebrowser();
		
		driver.get(prop.getProperty("URL"));
		
		homepageobjects hm= new homepageobjects(driver);
		
		Assert.assertTrue(hm.headertext().isDisplayed());
	}
	

	@Test
	public void headervalidation() throws IOException
	{
    
	driver=invokebrowser();
	
    driver.get(prop.getProperty("URL"));
    
    homepageobjects hm= new homepageobjects(driver);
    
    
    
    //Assert.assertTrue(hm.headertext().isDisplayed());
    Assert.assertEquals(hm.headertext().getText(), "Gift Cards");
    //System.out.println(hm.headertext().getText());
	
	
	
	
	
	
	}

	

}
