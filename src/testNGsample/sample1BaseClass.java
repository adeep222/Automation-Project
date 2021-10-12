package testNGsample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class sample1BaseClass {
	@BeforeClass
	public void launch()
	{
		System.out.println("Launch browser");
	}
	@AfterClass
	public void close()
	{
		System.out.println("Close browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to the application");
	}
@AfterMethod
public void logout()
{
	System.out.println("Logout of the application");
}
}
