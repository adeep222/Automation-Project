package Webappautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoSuggest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/input[1]")).sendKeys("an");
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("del");
		driver.findElement(By.xpath("//p[contains(text(),'New Delhi')]")).click();
	}

}
