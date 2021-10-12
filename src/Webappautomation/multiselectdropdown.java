package Webappautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
        //WebElement multi=driver.findElement(By.cssSelector("div[class='ui fluid dropdown selection multiple']"));
        driver.findElement(By.cssSelector("select[name='skills'][css='1']")).click();
        /*Select dd=new Select(multi);
        List<WebElement>allopts=dd.getOptions();
        
        for(int i=0;i<allopts.size();i++)
        {
        	System.out.println("The elemts are "+allopts.get(i));
        	
        }*/
        }
	}


