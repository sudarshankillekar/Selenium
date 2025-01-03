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
	
	WebDriver driver;	
	
	driver =  new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.xpath("(//div[@class=\"rb_main_secondary_item  link\"])[1]")).click();
	
	   Set<String> window     =       driver.getWindowHandles();
	   	   
	   Iterator<String>  it =   window.iterator();
	   
	   String parent = it.next();
	   String child1 = it.next();
	   driver.switchTo().window(child1);
	   driver.switchTo().window(parent);
	   driver.findElement(By.xpath("(//div[@class=\"rb_main_secondary_item  link\"])[1]")).click();
	   String child2 = it.next();
	   driver.switchTo().window(child2);
	   driver.switchTo().window(child1);
	}
	 
	 
	
	}
	
	
	
	
	
