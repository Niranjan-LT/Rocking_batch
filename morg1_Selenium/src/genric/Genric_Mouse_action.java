package genric;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Genric_Mouse_action extends Base_class
{
	static Actions act;
	public static void mouse_action()
	{
		act=new Actions(driver);
	}
	public static void Move_to_element(WebElement ele)
	{
		act.moveToElement(ele).build().perform();
	}
	public static void Double_click(WebElement ele)
	{
		act.doubleClick(ele).build().perform();
	}
	public static void right_click(WebElement ele)
	{
		act.contextClick(ele).build().perform();
	}
	public static void drag_and_drop(WebElement ele,WebElement ele1)
	{
		act.dragAndDrop(ele,ele1).build().perform();
	}
	public static void drag_by_axis(WebElement ele,int x,int y)
	{
		act.dragAndDropBy(ele, x, y).build().perform();
	}

}
