package Login_Page_Test_Cases;



	package LoginPageTestCases_pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;

import Page_Object_model.LoginPage;



	public class LoginPageTestCases1 {
		WebDriver driver;
	    LoginPage lp;
		
	    
	    @BeforeMethod
		void setup() {
			
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");
			
			lp = new LoginPage(driver);
			
		}
		void tearDown() {
			
		}

		void loginPageTestCase(String uname, String pass) {
			
			
		}
	}

}
