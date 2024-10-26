package selectorsHubPagAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLoginPage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://selectorshub.com/xpath-practice-page/");
	    driver.findElement(By.xpath("//input[@placeholder=\"Enter email\"]")).sendKeys("sudarshankillekar1998@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder=\"Enter Password\"]")).sendKeys("sudarshankillekar1998@gmail.com");		
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter your company\"])[1]")).sendKeys("Ah infotech");
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
	}

}
