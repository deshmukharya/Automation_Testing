package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Project {
	WebDriver driver = new ChromeDriver();

	    @BeforeMethod
	    public void setUp() {
	        driver.manage().window().setSize(new Dimension(768, 816));
	        driver.get("http://localhost:4200/user/login");
	    }

	    @Test(dataProvider = "credentials")
	    public void loginTest(String email, String password) {
	        driver.findElement(By.name("email")).sendKeys(email);
	        driver.findElement(By.name("password")).sendKeys(password);
	        driver.findElement(By.id("login-button")).click();
	    }

	    @AfterMethod
	    public void tearDown() {
//	        driver.quit();
	    }

	    @DataProvider(name = "credentials")
	    public Object[][] provideCredentials() {
	        return new Object[][] {
	                {"deshmukharya61@gmail.com", "arya@305"},
	        };
	    }


}