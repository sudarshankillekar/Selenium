package Rahulshettyseleniumpractie;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchinWindowTabs {

	
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//*[contains(text(),\"Top Deals\")]")).click();
		Set<String> window     =  driver.getWindowHandles();
		Iterator<String> it = window.iterator(); 
		String parent =  it.next(); 
		String  child = it.next(); 
		driver.switchTo().window(child);
		//driver.findElement(By.xpath("//span[contains(text(),\"Course Link\")]")).click();
		driver.switchTo().window(parent);
		//driver.findElement(By.id("password")).sendKeys("sendkeys");
		
	}
	
	
	
	
	
	
}
