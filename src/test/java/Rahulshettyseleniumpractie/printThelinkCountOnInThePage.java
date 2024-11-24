package Rahulshettyseleniumpractie;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printThelinkCountOnInThePage {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");;
    System.out.println(driver.findElements(By.tagName("a")).size());
    
    WebElement footerlink =      driver.findElement(By.id("gf-BIG"));
   
    System.out.println(footerlink.findElements(By.tagName("a")).size());
    
         WebElement column =   footerlink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
         System.out.println(column.findElements(By.tagName("a")).size());
         
         for(int i = 1 ; i<column.findElements(By.tagName("a")).size();i++){
        	 
        	  String clickOnLinkTab =  Keys.chord(Keys.CONTROL,Keys.ENTER);
        	  
        	  column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
  
         }
         
         Set<String> windowhandle =  driver.getWindowHandles();
         Iterator<String>  iterator =    windowhandle.iterator();
         
         
         
         while(iterator.hasNext()) {
        	 
         }
         
	}

}
