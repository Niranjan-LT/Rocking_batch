package ali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(name = "email")
	private WebElement unsername;
	@FindBy(name = "pass")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement Login;
		public Pom(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	public WebElement Login()
	{
		return Login;
	}
	public WebElement username()
	{
		return unsername;
	}
	public WebElement password()
	{
		return password;
	}
	
	
	
	
		
		

}
