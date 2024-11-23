package selectorsHubPagAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//a[contains(text(),\" SelectorsHub Youtube Channel  \")]")).click();
             Set<String>  tabs  =        driver.getWindowHandles();
             Iterator<String> iterator  = tabs.iterator();
	         String Parent  = iterator.next();  
	         Thread.sleep(2000);
             String child  =  iterator.next();
   
	          driver.switchTo().window(child);
	         
	          Thread.sleep(2000);
	          
	          driver.switchTo().window(child).close();
	          Thread.sleep(2000);
	          
	          driver.switchTo().window(Parent);
             
	}

}
