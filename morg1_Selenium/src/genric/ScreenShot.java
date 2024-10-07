package genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{
	static String path="./photo/";
	public static void sc(WebDriver driver)
	{
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replace(":","-");
		try 
		{
			TakesScreenshot tc =(TakesScreenshot)driver;
			File src = tc.getScreenshotAs(OutputType.FILE);
			File f=new File(path+date+".jpeg");
			FileHandler.copy(src, f);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
