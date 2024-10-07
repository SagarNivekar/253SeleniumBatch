package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationDataProviderTask {
	
	WebDriver driver;
	@BeforeMethod
	
	void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		}
	
	@AfterMethod
	void end1() {
		}
	@Test (dataProvider= "loginData") 
	
public void valid_Invalid_Data1 (String password , String username) {
	
		driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submit")).click();
}
	@DataProvider (name="loginData")
	Object[][] newTest1()
	{
		
		Object obj[][] = new Object [3][2];
		 
		obj [0] [0]="student";
		obj [0] [1]="Password123";
		
		obj [1][0]="teacher";
		obj [1][1]="ABC3456";
	    
		obj [2][0]="";
		obj [2][1]="";
	
		return obj;
	}
	
	
	
	
}
