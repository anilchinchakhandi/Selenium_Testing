package Day_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/* 
1) Launch Chrome browser
2) Open URL https://demo.nopcommerce.com/
3) validate the title "nopCommercedemo store"
4) close page 
*/

public class AssignmentDemo {

	public static void main(String[] args) {
		// 1) Launch Chrome browser
		// WebDriver driver = new ChromeDriver();
		
		// 1) Launch Edge browser
		WebDriver driver = new EdgeDriver();
		
		//2) Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3)validate the title "nopCommercedemo store"
	    String	actual_title=driver.getTitle();
	    if(actual_title.equals("nopCommerce demo store")) {
	    	System.out.println("Test passed");
	    }
	    else {
	    	System.out.println("Test failed");
	    }
	    
	    // close page 
	    driver.close();
		


	}

}
