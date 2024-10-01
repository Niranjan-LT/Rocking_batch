package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_repo 
{
	public Element_repo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement	Login;

	@FindBy(name = "login")
	private WebElement	passs;


	public WebElement Login_button()
	{
		return Login;
	}
	
	
	

}
