package Page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	@FindBy (id="email")
	WebElement txtEmail;
	
	@FindBy (id="password")
	WebElement txtPassword;
	
	@FindBy (xpath="//*[@id=\\\"form\\\"]/div[3]/div/button")
	WebElement btnSignIn;

	
	public void email(String mail) {
		
		txtEmail.sendKeys(mail);
	}
	
	public void pass(String pass) {
		
		txtPassword.sendKeys(pass);
	}
	
	public void btn() {
		btnSignIn.click();
	}
	
	
	
	
	
	
	
	
	
}
