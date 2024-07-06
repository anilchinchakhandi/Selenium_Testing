package Day_02;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentLocator {

	public static void main(String[] args) {
		// 1) Launch browser
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		// Find all the images in the page
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		// click on the link using linktext 
		driver.findElement(By.linkText("About us")).click();	
		}

}
