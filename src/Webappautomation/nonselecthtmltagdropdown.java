package Webappautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nonselecthtmltagdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com");
		driver.findElement(By.xpath("//span[@class='more-arr']")).click();
		/*elements in unsorted list*/
		driver.findElement(By.xpath("//span[contains(text(),'Adventures')]")).click();
	}

}
