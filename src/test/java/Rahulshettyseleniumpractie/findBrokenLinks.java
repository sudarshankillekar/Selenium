package Rahulshettyseleniumpractie;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import  org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
   	    List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a[@href]"));
	    SoftAssert ass = new SoftAssert();
   	    for(WebElement link : links) {
   	    
   	    String Url =  link.getAttribute("href");	
		HttpURLConnection connection = (HttpURLConnection)new URL(Url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int resPonsecode =  connection.getResponseCode();
		System.out.println(resPonsecode);
	    ass.assertTrue(resPonsecode<400, "The Link with Text "+link.getText()+" ");
   	    }	
   	    
   	  ass.assertAll();
	}

}
