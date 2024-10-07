package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	@BeforeClass void b_class()
	{
		System.out.println("data Fetch the DB");
	}
	
	@BeforeMethod
	public static  Object[][] data() throws SQLException
	{
		System.out.println(" Data base connection");
		String url="jdbc:mysql://localhost:3306/bank";
		String un="root";
		String pwd="root";
	
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery("select* from customer;");
//		
		List<String> list=new ArrayList<String>();
		String user=null;
		String pwds=null;
		while(result.next())
		{
		 user = result.getString("username");//fetching the username
		 pwds = result.getString("pss");//fetching the pass
		list.add(user);
		list.add(pwds);
		}
		return new Object[][]
				{
					{user,pwds},
					{user,pwds}
			
				};
	}
	
	
	@DataProvider(name="facebook_login")
	public Object[][] data1() throws SQLException
	{
		return Login.data();			
	}
	
	
	@Test(dataProvider ="facebook_login")
	public void test(String un,String pass)
	{
		
		System.out.println(un +" "+ pass);
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
	
	

}
