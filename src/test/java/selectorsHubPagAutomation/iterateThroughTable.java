package selectorsHubPagAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Get me data from 3rd row 4th colomn 
public class iterateThroughTable {

	public static void main(String[] args) {
		   
		    WebDriver driver = new ChromeDriver();
	        // Navigate to the webpage containing the table
		    driver.manage().window().maximize();
	        driver.get("https://www.javatpoint.com/html-table");

	        // Locate the table by its XPath, id, or CSS selector (modify the locator accordingly)
	        WebElement table = driver.findElement(By.xpath("//table"));

	        // Locate the 4th row (index 3 as it's zero-based) within the table
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        WebElement fourthRow = rows.get(3);  // 4th row, index is 3

	        // Locate the 3rd column (index 2 as it's zero-based) within the 4th row
	        List<WebElement> columns = fourthRow.findElements(By.tagName("td"));
	        WebElement thirdColumn = columns.get(2);  // 3rd column, index is 2

	        // Print the text of the cell in the 4th row and 3rd column
	        System.out.println("Data in 4th row, 3rd column: " + thirdColumn.getText());


	}

}
