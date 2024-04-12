package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub 
			
			WebDriver driver = new FirefoxDriver(); 
			
			driver.get("https://www.calculator.net/"); 
			
			driver.manage().window().maximize(); 
			
			Sub.searchinput(driver).sendKeys("Calculator");

		

	}

}
