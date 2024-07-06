package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
//		// using Single attributes
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac");
//		
//		// using multiple attributes
//		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='Search']")).sendKeys("mac");
//		
//		// x-path with and operator
//		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='Search']")).sendKeys("mac"); // both the attributes should be match
//		
//		// x-path with or operator
//		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='Search']")).sendKeys("mac"); // atleast one attribute should be match 
		
		// x-path with inner text--text()
//		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
//		boolean display_status=driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
//		System.out.println(display_status);
//		
//		String s=driver.findElement(By.xpath("//*[text()='Featured']")).getText();
//		System.out.println(s);
		
		
		// x-path with contains() method
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Mac");
		
		// x-path with start-with()
	//	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mac");
		
		//chained-xpath
		boolean dispaly_status =driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(dispaly_status);
		}

}
