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
        WebElement element = driver.findElement(By.xpath("//table"));
	    List<WebElement>  row =  element.findElements(By.tagName("tr"));
	    WebElement rowdata = row.get(2);
	    List<WebElement>  coldata =  rowdata.findElements(By.tagName("td"));
	    WebElement webColdata = coldata.get(1);
	    System.out.println(webColdata.getText());
	}

	
}
