package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemoClass {
	
	
		WebDriver driver;
		@Test (priority = 1)
		void TestCase1() {
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		}
		@Test
	void TestCase2() {
			driver.findElement(By.id("email")).sendKeys("sagar@gmail.com");
			driver.findElement(By.id("password")).sendKeys("12355456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		}
		@Test
	void TestCase3() {
			driver.findElement(By.id("email")).sendKeys("");
			driver.findElement(By.id("password")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
		@Test
	void TestCase4() {
			driver.findElement(By.id("email")).sendKeys("***");
			driver.findElement(By.id("password")).sendKeys("////");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();	
	}
		@AfterClass
	void setup() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");

	}
		@BeforeClass
	void display() {
		
	}

	}

