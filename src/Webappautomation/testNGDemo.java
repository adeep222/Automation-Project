package Webappautomation;

import org.testng.annotations.Test;

public class testNGDemo {
	@Test(priority=2)
	public void firstmethod()
	{
		System.out.println("This is the first method");
	}
	@Test(enabled=false)
	public void secondmethod()
	{
		System.out.println("This is the second method");
	}
	@Test(priority=3)
	public void thirdmethod()
	{
		System.out.println("This is the third  method");
	}
	@Test(priority=1)
	public void fourthmethod()
	{
		System.out.println("This is the fourth  method");
	}
	@Test(dependsOnMethods = "sixthmethod")
	public void fifthmethod()
	{
		System.out.println("This is the fifth  method");
	}
	@Test()
	public void sixthmethod()
	{
		System.out.println("This is the sixth  method");
	}
}
