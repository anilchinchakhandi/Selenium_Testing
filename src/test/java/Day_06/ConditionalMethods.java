// CONDITIONAL METHODS: Access these commands through web elements

// IT returns the Boolean values(true/false)
package Day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://demo.nopcommerce.com/register");
		
		
		driver.manage().window().maximize();
		
		// isDisplayed()---It will check the diplayed or not
	    boolean display_status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	    System.out.println(display_status);
		
		
		//isEnabled()-- we can check enable or disable status of the element
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		//isSelected()--we can use to check the element is selected or not
		WebElement  male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement Female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		
		System.out.println("Before selected");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(Female_rd.isSelected()); //false
		
		male_rd.click();
		System.out.println("After selected male radio button");
		System.out.println(male_rd.isSelected()); //true
		System.out.println(Female_rd.isSelected());//false
		
		boolean disp = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Newsletter enabled"+disp);
		
	}

}
