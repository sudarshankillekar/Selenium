package Rahulshettyseleniumpractie;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.easemytrip.com/bus/");
	 
	 driver.findElement(By.xpath("//input[@placeholder=\"Source City\"]")).click();
	 
	 Thread.sleep(2000);
	 
	  List<WebElement> Options =           driver.findElements(By.xpath("//ul[@id=\"srcNav\"]//li"));
	  
	  String compareString = "Bangalore";
	  int count = 0;
	  for (WebElement webElement : Options) {
		
		    String Texts =   webElement.getText();
		  
		    if(Texts.contains(compareString)) {
		    	webElement.click();
		    	count++;
		    }
		    
	}
	
	  if(count != 0) {
		  System.out.println(compareString+" is present");
	  }else {
		  System.out.println(compareString+" is  not available" );
	  }
	  
	  
		
	}

}
