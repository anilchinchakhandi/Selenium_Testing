package Day_02;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver(); // Launch Chrome
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// name
//		driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
//		boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println(logodisplaystatus);	
//        
//        // link text and partial text
//        driver.findElement(By.linkText("Tablets")).click();
        
        
        List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
        System.out.println(headerlinks.size());
      
        
//        List<WebElement> links=driver.findElements(By.tagName("img"));
//        System.out.println(links.size());
        }

}
