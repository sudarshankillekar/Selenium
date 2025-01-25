package Rahulshettyseleniumpractie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class playingwithCheckBox {

	public static void main(String[] args) throws InterruptedException {
	
		
   WebDriver driver = new ChromeDriver();
   
   driver.get("https://selectorshub.com/xpath-practice-page/");
	
   driver.manage().window().maximize();
   
   System.out.println(driver.findElements(By.xpath("//div[@id = \"tableWrapper\"]//input[@type = \"checkbox\"]")).size());
	
   System.out.println(driver.findElement(By.xpath("//input[@id = \"ohrmList_chkSelectRecord_25\"]")).isSelected());
   Thread.sleep(1000);
  driver.findElement(By.xpath("//th[@class = \"checkbox-col\"]//input")).click();
  System.out.println(driver.findElement(By.xpath("//input[@id = \"ohrmList_chkSelectRecord_25\"]")).isSelected());
   
   

	}

}
