package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class DragandDrop{
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	

        // Locate the draggable element
        WebElement draggable = driver.findElement(By.id("draggable"));

        // Locate the droppable element
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Create Actions class object
        Actions actions = new Actions(driver);

        // Perform drag and drop
        actions.dragAndDrop(draggable, droppable).build().perform();
}
}
