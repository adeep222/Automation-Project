package Webappautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getallcheckboxesinpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("jerry22288@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Password$123");
driver.findElement(By.id("SubmitLogin")).click();
driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_category=3&controller=category'")).click();
	List<WebElement> allopts=driver.findElements(By.className("checkbox"));
System.out.print("The total number of checkboxes in the page are:" +allopts.size());
/*Click on all the checkboxes*/
for(int i=0;i<allopts.size();i++)
{
	allopts.get(i).click();
	
}
	}

}
