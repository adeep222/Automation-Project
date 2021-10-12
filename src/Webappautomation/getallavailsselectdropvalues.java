package Webappautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class getallavailsselectdropvalues {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("jerry22288@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Password$123");
driver.findElement(By.id("SubmitLogin")).click();
driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_category=3&controller=category'")).click();
	WebElement selectele= driver.findElement(By.id("selectProductSort"));
	Select drop=new Select(selectele);
	List<WebElement>allopts=drop.getOptions();
	for(int i=0;i<allopts.size();i++)
	{
WebElement indexval=allopts.get(i);
String Visibletext=indexval.getText();
System.out.println("The index values are" +indexval);
System.out.println(Visibletext);
	}

}
}
