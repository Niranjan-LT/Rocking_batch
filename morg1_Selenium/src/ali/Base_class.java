package ali;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Base_constants
{
	public WebDriver driver;
	@BeforeMethod
	void opp_app()
	{
		System.setProperty(gecko_key,gecko_value);
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(unit, TimeUnit.SECONDS);
		driver.get(url);
		}
	
	@AfterMethod
	void close_app()
	{
		driver.quit();
	}
	
	

}
