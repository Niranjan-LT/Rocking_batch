package genric_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base_class implements Base_constans
{


	public WebDriver driver;
	@BeforeMethod
	public void op_app()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.get(Url);
	}
	@AfterMethod
	public void close_app(ITestResult result)
	{
		if(result.FAILURE==result.FAILURE)
		{
			ScreenShot_gernric.sc(driver);
		}
		driver.quit();
	}
	

}
