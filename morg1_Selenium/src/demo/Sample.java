package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		 
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		
		Actions act= new Actions(driver);
		
		Thread.sleep(2000);
		act.dragAndDrop(source, target).build().perform();
		
		
		
	}
	

}
