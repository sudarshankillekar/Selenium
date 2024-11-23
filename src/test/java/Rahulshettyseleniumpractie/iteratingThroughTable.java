package Rahulshettyseleniumpractie;

import java.sql.Driver;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iteratingThroughTable {

	public static void main(String[] args) {
		
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	List<WebElement> elementList   = driver.findElements(By.xpath("//div[@class=\"w3-example\"]//table//td[1]"));
	
	
	List<String> secondColumnData =  elementList.stream().filter(s->s.getText().contains("Ernst Handel")).
			map(s->getdatathroughfirstrow(s)).collect(Collectors.toList());
	secondColumnData.forEach(a->System.out.println(a));
	    

	}

	private static String getdatathroughfirstrow(WebElement s) {
		String data =    s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return data;
	}
	
}
