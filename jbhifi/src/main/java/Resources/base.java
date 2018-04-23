package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver invokebrowser() throws IOException
	
	{
	 prop = new Properties();
	
	FileInputStream fis = new FileInputStream("C:\\Program Files\\jbhifi\\src\\main\\java\\Resources\\data.properties");
	
    prop.load(fis);
     
    
    String browsername = prop.getProperty("browser");
    
    if(browsername.equals("internetexplorer"))
    {String exepath="C:\\Users\\Dennis\\Downloads\\IEDriverServer_x64_3.11.1";
	System.setProperty("webdriver.internetexplorer.driver",exepath);
	 driver=new InternetExplorerDriver();
    	
    	
    }
    
    else if(browsername.equals("firefox"))
    {
    	
    	String exepath="C:\\Users\\Dennis\\Downloads\\geckodriver-v0.19.1-win64//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exepath);
		 driver=new FirefoxDriver();
    }
    
    else if(browsername.equals("chrome"))
    {

		String exepath="C:\\Users\\Dennis\\Downloads\\chromedriver_win32//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exepath);
	driver=new ChromeDriver();
    }
 
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    return driver;
	}
	
	

}
