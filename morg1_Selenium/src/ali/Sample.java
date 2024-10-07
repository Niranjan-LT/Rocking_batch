package ali;

import org.testng.annotations.Test;

public class Sample
{
	@Test(dependsOnGroups = {"sanity"})
	public void test() 
	{
		System.out.println("sanity");
	}
	@Test(dependsOnGroups = {"Smoke"})
	public void test1() 
	{
		System.out.println("Smoke");
	}
}
