package testNGsample;

import org.testng.annotations.Test;

public class users extends sample1BaseClass {

	@Test(priority=0)
	public void createuser()
	{
		System.out.println("user created successfully");
	}
	@Test(priority=1)
	public void edituser()
	{
		System.out.println("user edited successfully");
	}
	@Test(priority=2)
	public void deleteuser()
	{
		System.out.println("user deleted successfully");
	}

}
