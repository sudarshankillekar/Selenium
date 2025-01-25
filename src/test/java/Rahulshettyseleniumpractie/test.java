package Rahulshettyseleniumpractie;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.goibibo.com/bus/");
	
	driver.findElement(By.xpath("//input[@name=\"autosuggestBusSRPSrcHomeName\"]")).sendKeys("B");
	
	Thread.sleep(2000);
	
	List<WebElement> text = driver.findElements(By.xpath("//li/span"));
	
	String placename = "Patna, Bihar";
	int count = 0;
	for(WebElement names :text) {
    
   
    String test =   names.getText();	
		
	if(test.contains(placename)) {
		
		names.click();
		count++;	
	}
	
	}
	
		
		
		
		
		
		
	}
	 
	 
	
	}
	
	
	
	
	
