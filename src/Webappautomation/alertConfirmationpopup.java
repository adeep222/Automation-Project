package Webappautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertConfirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("Test");
		driver.findElement(By.name("submit")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		//To click on Ok in alert popup
		driver.switchTo().alert().accept();
		//to click on cancel
		//driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
