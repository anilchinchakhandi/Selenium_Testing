package Day_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
  Test case :
---------------------
1) Launch browser
2) Open URL https://demo.opencart.com/
3) Validate the title should be  "Your Store" 
4) Close browser
 */

public class Firsttest {

	public static void main(String[] args) {
		// 1) Launch browser (Chrome)
		// ChromeDriver driver = new ChromeDriver(); 
		
		WebDriver driver = new ChromeDriver(); // webDriver is the parent class of ChromeDriver
		
		// 2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// 3) Validate the title should be  "Your Store"
		
		String actual_title=driver.getTitle();
		if(actual_title.equals("Your Store")) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
		// 4) Close browser
		driver.close();

	}

}

