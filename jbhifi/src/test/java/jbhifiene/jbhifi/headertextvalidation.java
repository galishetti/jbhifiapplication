package jbhifiene.jbhifi;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.base;
import pageobjectrepository.homepageobjects;

public class headertextvalidation extends base {
	
	
	public static Logger log = LogManager.getLogger(loginfunction.class.getName());
	
	
	@Test
	public void headervalidation() throws IOException
	{
    
	driver=invokebrowser();
	
    driver.get(prop.getProperty("URL"));
    
    homepageobjects hm= new homepageobjects(driver);
    
    
    
    //Assert.assertTrue(hm.headertext().isDisplayed());
    Assert.assertEquals(hm.headertext().getText(), "Gift Cards");
    //System.out.println(hm.headertext().getText());
	
	log.info("successfully compared navigator text");
	
	
	
	
	}

}
