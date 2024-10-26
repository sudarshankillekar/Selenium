package selectorsHubPagAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tablelemenet =    driver.findElement(By.xpath("//table"));
		
		 //row
		 List<WebElement> row =  tablelemenet.findElements(By.tagName("tr"));
		 WebElement    thirdrow = row.get(2);
	     //	column
		 List<WebElement> column = thirdrow.findElements(By.tagName("td"));
		 WebElement thirdcolumn = column.get(0);
		
		System.out.println(thirdcolumn.getText());
	
	}

}
