package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			WebDriver driver = new FirefoxDriver();
			driver.get("https://schooledn.py.gov.in/admission/hsc.html");
	        
			 // Find the draggable element
			Actions actions = new Actions(driver);

			// Find the elements
			WebElement cl = driver.findElement(By.xpath("//a[@href='#'][text()='Schools']"));
			WebElement cl2 = driver.findElement(By.xpath("//a[@href='#'][text()='Government']"));
			WebElement cl3 = driver.findElement(By.xpath("//a[@href='../schools/stateGovt.html'][text()='State Govt']"));

			// Perform a series of actions in the correct order
			// Move to the first element and click on it
			actions.click(cl).perform();
			actions.moveToElement(cl2).perform();
			actions.click(cl2).perform();
			// Move to the second element and click on it
			actions.moveToElement(cl3).perform();
			// Move to the third element and click on it
			actions.click(cl3).perform();	

	}

}
