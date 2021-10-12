package Webappautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTestclass {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("jerry22288@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Password$123");
driver.findElement(By.id("SubmitLogin")).click();
Thread.sleep(2000);
/*driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();*/
System.out.println("The title is: " +driver.getTitle());
String expectedTitle="My account - My Store";
String actualTitle=driver.getTitle();
if(expectedTitle.equals(actualTitle))
{
	System.out.println("The title matches");
}
else
{
	System.out.println("The title does not matche");
}
driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=order']")).click();
String actualtext=driver.findElement(By.cssSelector("p[class='alert alert-warning']")).getText();
String expectedtext="Your shopping cart is empty.";
if(actualtext.equals(expectedtext))
{

System.out.println("Actual Text matches expected text and the text is: " +actualtext);
	}
else
{
	System.out.println("Actual Text does not match the expected text");
}
//To check if the element Cart title exists
try
{
driver.findElement(By.id("cart_title"));	
System.out.println("Cart title item exists");
}
catch(Exception e)
{
	System.out.println("Cart title element does not exist");
	
}
Thread.sleep(6000);
driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_category=3&controller=category']")).click();
Thread.sleep(6000);
WebElement checkbox=driver.findElement(By.cssSelector("input[id='layered_category_4'][value='4']"));
checkbox.click();
Thread.sleep(8000);
Boolean chk=checkbox.isSelected();
if(chk==true)
{
	System.out.println("Checkbox is selected");
}
else
{
	System.out.println("Checkbox is not selected");
}
Boolean button=driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=prices-drop']")).isEnabled();
if(button)
{
	System.out.println("All specials button is enabled");
}
else
{
	System.out.println("All specials button is disabled");
}

/*To get the string value of the attribute Ex: tooltip, button link etc*/

WebElement ele=driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=prices-drop'][title='All specials']"));
String tooltip=ele.getAttribute("title");
String hrefvalue=ele.getAttribute("href");
System.out.println("The tooltip of the All specials button is: " +tooltip);
System.out.println("The link of the button is: " +hrefvalue);
	}
	
	
	

}


	


