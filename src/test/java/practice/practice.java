package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	 
		driver.manage().window().maximize();
	
	    driver.get("https://www.goibibo.com/flights/");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//span[@class=\"sc-jlZhew inxprl\"]")).click();
	    
	    Thread.sleep(1000);
	    
	    System.out.println(driver.findElements(By.tagName("a")).size()); 
	    
	    
	    
	    }
	    
	    
	}


