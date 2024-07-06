package Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the screen
		driver.manage().window().maximize();	
		
		// Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// tag and id ---- Syntax--tag#id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		
		//tag and class -----Syntax--- tag.class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mac");
		
		// tag and attribute --- Syntax---tag[attribute="value"]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		
		// tag,class and attribute---Syntax ---tag.class[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");

	}

}
