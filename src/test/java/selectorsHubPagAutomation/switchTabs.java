package selectorsHubPagAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
//		JavascriptExecutor jse      =         (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,2500)");
//		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='coming google']"));
//		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("(//span[@class = \"commonModal__close\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),\"Book Now\")])[1]")).click();
		
	}

}
