package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationDataProviderDemo {
	
	WebDriver driver;
	@BeforeMethod
	void setUP() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");

	}
	@AfterMethod
	void tearDown() {
		}
	
	@Test (dataProvider="loginData")
	public void valid_Invalid_Test_Data(String username, String password)
	 {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
@DataProvider (name = "loginData")
Object [][] testData()
{
	Object obj[][]= new Object[5][2];
	//set 1
	obj [0][0]="kiran@gmail.com";
	obj [0][1]="123456";
	
	//set 2
		obj [1][0]="ABC@gmail.com";
		obj [1][1]="ABC3456";
	
		//set 3
		obj [2][0]="";
		obj [2][1]="";
		
		//set 4
		obj [3][0]="";
		obj [3][1]="123456";
		
		//set 5
		obj [4][0]="kiran@gmail.com";
		obj [4][1]="";
	
	return obj;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}

