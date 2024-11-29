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

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
	    List<WebElement> links  = driver.findElements(By.xpath("//div[@class=\"rightfotmenu\"]/div[@class=\"menuft1 ftnew flxwrp\"]/div[@class=\"menulinkx\"]/ul/li/a[@href]"));
	
	    for(WebElement link : links) {
	    	
	     String Url = link.getAttribute("href");
	     HttpURLConnection connection     = (HttpURLConnection)new URL(Url).openConnection();
	     connection.setRequestMethod("HEAD");	                     
	     connection.connect();
	     int resPonseCode = connection.getResponseCode();
	     System.out.println(resPonseCode+" "+link.getText());	
	    }
	    
	    
	}

}
