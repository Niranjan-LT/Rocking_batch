package automation_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class BusOnlineticket extends Base_class
{
	@Test(priority = 1)
	public void test()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@id='txtOriginGeneral']")).sendKeys("Cameron Highlands");
		driver.findElement(By.xpath("//input[@id='txtDestinationGeneral']")).sendKeys("Kuala Lumpur",Keys.TAB);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")));
		driver.findElement(By.xpath("//a[text()='20']")).click();
		driver.findElement(By.id("btnBusSearchNewGeneral")).click();
		driver.findElement(By.xpath("(//a[text()='Select'])[9]")).click();
		for(int i=2;i<=4;i++)
		{
			driver.findElement(By.xpath("//td[@rowspan='5']/../td["+i+"]")).click();
			driver.findElement(By.xpath("//td[@rowspan='5']/../../tr[2]/td["+i+"]")).click();
		}
		driver.findElement(By.xpath("//input[@class='seatproceed']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//b[text()='Passenger Details']")).isDisplayed(),"Passenger Details Page not Displayed ");
		driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("tester12@gmail.com");
		driver.findElement(By.id("btnNext")).click();
		driver.findElement(By.xpath("//input[@name='payment_btnProceedPayment']")).click();
		String pop_up_text = driver.findElement(By.xpath("//div[@class='mt-4 text-semibold']")).getText();
		Reporter.log(pop_up_text);
		
		}

}
