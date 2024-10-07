package Data_Driven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AcceptData {

	WebDriver driver;

	@BeforeMethod
	void setUp() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");
	}

	@AfterMethod
	void tearDown() {

		//
	}

	@Test(dataProvider = "LoginData")

	void TestCase(String username, String password) {

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		Assert.assertTrue(driver.getTitle().equals("JavaByKiran | Dashboard"));
	}

	@DataProvider(name = "LoginData")

	Object[][] testData() throws IOException {

		Object TestData[][] = Excel_Data.data123();

		return TestData;
	}
}
