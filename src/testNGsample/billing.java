package testNGsample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class billing extends sample1BaseClass{
	@Test()
	public void createBilling()
	{
		String expectedtext="Adeep";
		String actualtext="Adeepbp";
	Assert.assertEquals(expectedtext, actualtext);
	}
	@Test(dependsOnMethods="createBilling" )
	public void editBilling()
	{
		System.out.println("edit billing");
	}
	@Test()
	public void deleteBilling()
	{
		System.out.println("delete billing");
	}


}
