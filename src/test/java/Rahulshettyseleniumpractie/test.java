package Rahulshettyseleniumpractie;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;	
	
	driver =  new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
		
	driver.findElement(By.id("src")).sendKeys("beng");
	
	Thread.sleep(2000);
	
	 List<WebElement> DDvalues =  driver.findElements(By.xpath("//ul[@class =\"sc-dnqmqq dZhbJF\"]//li//div//text"));
	
	 String toSelectValue = "Bengali Square";
	 
	 for (WebElement webElement : DDvalues) {
	 
		 String value = webElement.getText();
		 System.out.println(value);
		if(value.contains(toSelectValue)) {
			     webElement.click();
			     break;
		}
		 
	}
	 
	 
	
	}
	
	
	
	
	
	
	
}
