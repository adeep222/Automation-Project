package Webappautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://demo.guru99.com/popup.php");
driver.findElement(By.cssSelector("a[href='../articles_popup.php'")).click();
Set<String>windhandler=driver.getWindowHandles();
Iterator<String> it=windhandler.iterator();
String popup=it.next();
driver.switchTo().window(popup);
Thread.sleep(3000);
driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");  
driver.findElement(By.name("btnLogin")).click();

	}
}
