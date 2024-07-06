
// GETMETHODS USE WORK ON WEBPAGE
//WE CAN ACCESS THROUGH METHODS

package Day_06;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// get(URL) - Open URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()- It will returns the title of the web page
		System.out.println(driver.getTitle());    
		
		// getCurrentUrl()--It returns the URL of the web page
		System.out.println(driver.getCurrentUrl());
		
    	// getPageSource()--It returns the page source of the web page
		System.out.println(driver.getPageSource());
		
		//getWndowHandle()--It returns the id of the single Browser window   
    	String WIndowID=driver.getWindowHandle();  // It returns the string
	    System.out.println("Window"+WIndowID);
		
		//getWndowHandles()--It returns the id of the multiple Browser window  
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> WindowIDS=driver.getWindowHandles();
		System.out.println(WindowIDS);
		
	}

}
