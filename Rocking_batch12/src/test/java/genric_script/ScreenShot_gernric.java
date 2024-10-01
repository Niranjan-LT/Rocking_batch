package genric_script;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_gernric 
{
	static String path="C:\\Users\\lenovo\\Desktop\\ScreenShot\\";
	public  static void sc(WebDriver driver)
	{
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replace(":", "-");
		try {
		TakesScreenshot tc=(TakesScreenshot)driver;
		
		File src = tc.getScreenshotAs(OutputType.FILE);
		
		File target=new File(path+date+".jpeg");
		
		FileHandler.copy(src, target);
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	

}
