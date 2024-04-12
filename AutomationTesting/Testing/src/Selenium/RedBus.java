package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
    	WebDriver driver = new FirefoxDriver();
        
        // Open Redbus website
        driver.get("https://www.redbus.in/");
        
        // Find the account element and ticket details element
        WebElement Account = driver.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));
        WebElement Details = driver.findElement(By.id("ticket_details"));

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Move to the account element and click on it
        actions.moveToElement(Account).click().perform();
        Thread.sleep(1000); // Wait for 2 seconds
        // Move to the details element
        actions.moveToElement(Details).perform();
        Thread.sleep(1000); // Wait for 2 seconds
        // Click on the details element
        actions.click(Details).perform();  	
    	
    }

}