package Webappautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		//driver.findElement(By.id("uploadfile_0")).sendKeys("Chhdhd/hsh");
		Thread.sleep(3000);
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Adeep\\Downloads\\Test1");
		// check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}

}
