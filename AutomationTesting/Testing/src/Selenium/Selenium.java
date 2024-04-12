package Selenium;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.webDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
	
	
		WebDriver driver = new FirefoxDriver();
		
		//ID
		driver.findElement(By.id("calcSearchTerm")).sendKeys("Calculator");
		driver.findElement(By.xpath("//span[@id='bluebtn']")).click();
		//XPATH
		driver.findElement(By.xpath("//input[@id='csex2']")).click();
		//CLASS
		driver.findElement(By.className("//DIV[@class='hicon'"));
		//LINK
	        driver.findElement(By.linkText("Mortgage Calculator"));
               //PARTIAL LINK
	        driver.findElement(By.partialLinkText("Financial"));
	       //TAG  NAME
	        driver.findElement(By.tagName("body"));  
	}

}
