package demo;

import org.testng.annotations.Test;
import genric_script.Base_class;
import pom.Element_repo;

public class Login extends Base_class
{
	
	@Test void test()
	{
		
		Element_repo repo=new Element_repo(driver);
		repo.Login_button().click();
	}


	
	
}
