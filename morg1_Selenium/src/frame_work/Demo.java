package frame_work;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo extends Base_Demo
{
	@Parameters()
	@Test(dataProvider = "Login")
	void test(String username,String password)
	{
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		//System.out.println(username+" "+password);
	}
	
}
