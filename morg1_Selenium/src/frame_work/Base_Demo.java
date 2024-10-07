package frame_work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Base_Demo 
{
	public WebDriver driver;
	@BeforeMethod
	void oppapp()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");	
	}
	@AfterMethod
	void close()
	{
		driver.quit();
	}
	
	
	 @DataProvider (name = "facebook")
	 
     public Object[][] dpMethod()
	 {
	   return new Object[][] 
			   {
		   			{"Selenium","32165498"},
		   			{"Api","6540"}
			   };
     }
	 @DataProvider (name = "Login")
	 
     public Object[][] dpMethodq()
	 {
	   return new Object[][] 
			   {
		   			{"Selenium","32165498"},
		   			{"Api","6540"}
			   };
     }

}
